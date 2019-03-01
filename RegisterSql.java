import java.sql.*;

public class RegisterSql {
	public static boolean register(String name,String uname,String upass,String edd,String phno)
	{
		boolean status= false;
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","finsol");
			String sql = "INSERT INTO users VALUES(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,uname);
			ps.setString(3,upass);
			ps.setString(4,edd);
			ps.setString(5,phno);
			int rows = ps.executeUpdate();
			if(rows ==1)
			{
				status = true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
}
