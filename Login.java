
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet {
	 boolean st =false;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
		request.setAttribute("EmployeeName", email);
		request.setAttribute("EmpPassword", pass);
		
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","root");
            PreparedStatement ps = con.prepareStatement("select * from register");
            ResultSet rs =ps.executeQuery();
			while(rs.next())
			{

				if(rs.getString("email").equals(email) && rs.getString("Pass").equals(pass))
					st=true;
			}

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        if(st==true)
        {
        	ServletContext context= getServletContext();
            RequestDispatcher rd = context.getRequestDispatcher("/Validate.html");
            rd.forward(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
        }   
    }


}