package mycom.test.myweb;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8787/Day02_0122/
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServlet() {
        super();
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(req, resp);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request 파악
		String imgNum = request.getParameter("param_imgNum");
		
		//문자열(String) -> 숫자(int, Integer)		
		int iNum = 0;
		if(imgNum!=null) {
			iNum = Integer.parseInt(imgNum);// String -> int
			
			// DB 로직 처리
			// response 제어
			
			response.setContentType("text/html;charset=utf-8");
			
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h1>Welcome to servlet</h1>");
			
			String img_path = "";
			switch(iNum) {
			case 1:
				img_path = "pooh.png";
				break;
			case 2:
				img_path = "pooh_thumb.png";
				break;
			case 3:
				img_path = "cute.jpg";
				break;
			default:
				img_path = "pooh.png";
			}
			
			out.println("<img src=\"img/" + img_path + "\">");
			out.println("</body></html>");
			
			out.close();
		}
		else {
			String img_path = "";
			response.sendRedirect("error.html?img="+img_path);
		}
		
//		System.out.println("doGet.....");
//		System.out.println(request.getCharacterEncoding());
//		System.out.println(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
