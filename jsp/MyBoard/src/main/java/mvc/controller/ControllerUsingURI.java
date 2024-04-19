package mvc.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import mvc.command.NullHandler;

@WebServlet(loadOnStartup = 1)
public class ControllerUsingURI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		String configFile = getInitParameter("configFile");
		// configFile = "/WEB-INF/commandHandlerURI.properties"
		Properties prop = new Properties();
		
		String configFilePath = getServletContext().getRealPath(configFile);
		System.out.println(configFilePath);
		
		try(FileReader fis = new FileReader(configFilePath)){
			prop.load(fis);
		} catch(IOException e) {
			throw new ServletException(e);
		}
		
		Iterator keyIter = prop.keySet().iterator();
		while(keyIter.hasNext()) {
			String command = (String) keyIter.next();
			// command = "/join.do"
			String handlerClassName = prop.getProperty(command);
			try {
				Class<?> handlerClass = Class.forName(handlerClassName);
				CommandHandler handlerInstance = (CommandHandler) handlerClass.newInstance();
                commandHandlerMap.put(command, handlerInstance);
			} catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException(e);
			}
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
