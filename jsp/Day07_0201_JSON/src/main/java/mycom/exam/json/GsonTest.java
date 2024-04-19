package mycom.exam.json;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import mycom.exam.model.MemberDTO;

@WebServlet("/gsonTest")
public class GsonTest extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//		MemberDTO(Model) --> JSON
		
		MemberDTO m1 = new MemberDTO("홍길동", "010-123-4567", "서울시");
		MemberDTO m2 = new MemberDTO("김길동", "010-789-2345", "경기도");
		
//		java object --> json(문자열)
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(m1);
		list.add(m2);
		
//		차후에는 service 클래스에서 요청해서 받아오는 Model 객체들
		Gson gson = new Gson();
		
		String json = gson.toJson(list);
		System.out.println(json);
		
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(json);
	}
	
}
