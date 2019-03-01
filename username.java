import java.sql.*;
public class username {
	public static String name(String name,String pass)
	{
		String uname = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","finsol");
			
			PreparedStatement ps=con.prepareStatement("select name from users where edd=? and upass=?");
			ps.setString(1,name);
			ps.setString(2,pass);
			ResultSet rs=ps.executeQuery(); 
			while(rs.next())
			{
				uname = rs.getString(1);
			}
		}
		catch(Exception e){System.out.println(e);}
		return uname;
	}
}
