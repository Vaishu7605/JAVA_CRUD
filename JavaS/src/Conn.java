import java.sql.*;

public class Conn {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		Driver Register
//		------------connecting database 
		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url = "jdbc:mysql://localhost:3306";
//		String user= "root";
//		String pass = "";
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
//		System.out.println("Connected: " +conn);
//		Statement st = conn.createStatement();
//		----------------show databases
//		ResultSet rs = st.executeQuery("show databases");
//		System.out.println("databases are: "+ rs);
		
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
//		------------create database 
//		st.executeUpdate("create database nsti");
//		System.out.println("database created successfully");
//		System.out.println("Connected: " +conn);
//		------create table successfully 
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nsti","root","");
//		String sql = "create table adit(id int, name varchar(30), mail varchar(45) primary key)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("table created");
		
//---------------data inserted successfully------------
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nsti","root","");
//		String query = "insert into adit values(1,'Navi','navi@gmail.com')";
//		Statement st = conn.createStatement();
//		st.executeUpdate(query);
//		System.out.println("data inserted successfully");
	
//------------multiple data entry ----------		
//	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nsti","root","");
//	String query = "insert into adit values (2,'tanu','tanu@gmail.com'),(3,'Vaishnavi','vaishnavi@gmail.com')";
//	Statement st = conn.createStatement();
//	st.executeUpdate(query);
//	System.out.println("data inserted successfully");
	
//------------ read database
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nsti","root","");
//		String query = "select * from adit";
//		Statement st = conn.createStatement();
//		ResultSet res = st.executeQuery(query);
//		while(res.next()) {
//			System.out.println(res.getString("name") +" - "+ res.getString("mail"));
//		}
		
//-------------------Update data------------------// 
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nsti","root","");
//	    String updateQuery = "UPDATE adit SET name = 'Jyotiya' WHERE name = 'Navi'";
//	    Statement st = conn.createStatement();
//	    st.executeUpdate(updateQuery);
//	    System.out.println("Data updated");
		
//------------------Delete data---------------//4
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nsti","root","");
//		String deleteQuery = "DELETE FROM adit WHERE mail='tt@mail.com'";
//		Statement st = conn.createStatement();
//	    st.executeUpdate(deleteQuery);
//	    System.out.println("Data deleted Successfully ");
		
	}

}
