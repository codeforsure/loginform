import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("test/html");
		PrintWriter out = response.getWriter();
		
		String n = request.getParameter("name");
		String u = request.getParameter("uname");
		String p = request.getParameter("upass");
		String e = request.getParameter("eadd");
		if(RegisterSql.register(n,u,p,e))
		{
			RequestDispatcher rd=request.getRequestDispatcher("suc.html");
			rd.forward(request,response);
		}
		else
		{
			out.print("cannot be registered try again");
		}
	}
}
