package servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class aldC extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) {
		String a = req.getParameter("name");
		String b = req.getParameter("age");
		String c = req.getParameter("mail");
		
		System.out.println(a+ "-"+ b+ "-"+ c);
	}

}
