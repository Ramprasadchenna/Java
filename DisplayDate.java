package chocky;
import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayDate extends HttpServlet{
	   public void doGet(HttpServletRequest request, HttpServletResponse
	  response) throws ServletException, IOException{
	  PrintWriter pw = response.getWriter();
	  Date today = new Date();
	  pw.println("<html>"+"<body><h1>Today Date is</h1>");
	  pw.println("<b>"+ today+"</b></body>"+ "</html>");
	  }
	}
