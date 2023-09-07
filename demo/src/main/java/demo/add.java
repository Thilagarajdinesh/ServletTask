package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class add extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
	response.setContentType("text/html");
	int i=Integer.parseInt(request.getParameter("firstnum"));
	int j=Integer.parseInt(request.getParameter("secondnum"));
	int k=i+j;
	PrintWriter out=response.getWriter();
	out.print(k);

	

}
}