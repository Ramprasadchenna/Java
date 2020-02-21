package sample;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
	public class Jdbc2 {

		public static void main(String[] args) throws SQLException {
			Connection con1=null;
    
			try {
				Class.forName("com.mysql.jdbc.Driver");
				 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
				System.out.println("Connected");
				//PreparedStatement ps=con.prepareStatement("insert into employ values(100,'RAM',7865.98,67)");
				//PreparedStatement ps=con1.prepareStatement("insert into employ values(?,?,?,?)");
                //ps.setInt(1,100);
                //ps.setString(2,"RAM");
                //ps.setFloat(3,8765.98f);
                //ps.setInt(4,23);
                
				ps.executeUpdate();
				ps.close();
				ps=con1.prepareStatement("select *from employ");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt("eno"));
					System.out.println(rs.getString("ename"));
					System.out.println(rs.getFloat("esal"));
		 			System.out.println(rs.getInt("deptno"));

					
				}
			}
			catch(ClassNotFoundException se)
			{
				System.out.println(se);
			}
			finally {
				con1.setAutoCommit(false);

				con1.commit();
			}
	
		}

	}


