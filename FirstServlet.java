import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FirstServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String n=request.getParameter("username");
		String p=request.getParameter("userpass");
		String name = username.name(n,p);
		if(LoginDao.validate(n, p)){
			session.setAttribute("userName",name);
			RequestDispatcher rd=request.getRequestDispatcher("new.html");
			rd.forward(request,response);
		}
		else{
			out.print("<font text-align:center color:white font-size: 30px>Sorry username or password error</font>");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request,response);
		}
		
		out.close();
	}

}
