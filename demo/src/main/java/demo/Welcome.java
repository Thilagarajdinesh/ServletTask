package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
	response.setContentType("text/html");
	String name=request.getParameter("uname");
	PrintWriter out=response.getWriter();
	if(name.equals("Thilagaraj")) {
		out.print("Hello"+name);
	}else {
		out.print("please Register");
	}
	
}
}
