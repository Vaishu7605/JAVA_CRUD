package navi;
import java.sql.*;

public class connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost","root","");
		System.out.println("Connected Successfully.");
		

	}

}
