import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.pept.transport.Connection;
 
public class World extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  System.out.println("hello");
  response.setContentType("text/html");
  PrintWriter pw=response.getWriter();
  String s1=request.getParameter("t1");
  String s2=request.getParameter("t2");
  pw.println(s1+""+s2);
  try {
	   String url=getServletContext().getInitParameter("url");
	   String usr=getServletContext().getInitParameter("user");
	   String pass=getServletContext().getInitParameter("password");
	   Class.forName(getServletContext().getInitParameter("driver"));
	   Connection con=(Connection) DriverManager.getConnection("url","usr","pass");
	   System.out.println("connecting");
	   
	   
  }
  
 catch(ClassNotFoundException | SQLException cf)
 {
   System.out.println(cf);
  }
 pw.println("Hello");
  
	}
}
