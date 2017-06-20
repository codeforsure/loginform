import java.sql.*;

public class RegisterSql {
	public static boolean register(String name,String uname,String upass,String edd)
	{
		boolean status= false;
		try
		{  
			Class.forName("com.mysql.jdbc.driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","admin","finsol");
			String sql = "INSERT INTO user VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,uname);
			ps.setString(3,upass);
			ps.setString(4,edd);
			int rows = ps.executeUpdate(sql);
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
