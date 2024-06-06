import java.sql.*;
public class crud {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
//-------------------Making Connection-------------------//
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
//		System.out.println("Connected: " +conn);
		
//---------------------Show Databases------------------//
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
//		System.out.println("Connected: " +conn);
//		Statement st = conn.createStatement();
//		ResultSet rs = st.executeQuery("show databases");
//		System.out.println("databases are: "+ rs);
//		
//		while(rs.next()) {
//		System.out.println(rs.getString(1));
//		}
		
//--------------------creating database---------------------------//
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
//		Statement st = conn.createStatement();
//		st.executeUpdate("create database navi");
//		System.out.println("Connected: " +conn);
//		System.out.println("database created successfully");
//		
		
//------------------------creating table-----------------//
		
	
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Navi","root","");
//		String sql = "create table navi(id int, name varchar(30), mail varchar(45) primary key, address varchar(50),age int)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("table created");
		
		
//------------------inserting Data in table---------------//
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Navi","root","");
//		String query = "insert into navi values(1,'Navi','navi@gmail.com','Allahabad', 20)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(query);
//		System.out.println("data inserted successfully");
		
		
//--------------inserting many data in table----------------//
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Navi","root","");
//		String query = "insert into navi values (2,'Tanu','tanu@gmail.com','Lucknow', 22), (3,'Queen','queen@gmail.com', 'Delhi', 21)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(query);
//		System.out.println("multiple data inserted successfully");
		
//---------------------- read data ----------------------------//
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nsti","root","");
//		String query = "select * from adit";
//		Statement st = conn.createStatement();
//		ResultSet res = st.executeQuery(query);
//		while(res.next()) {
//			System.out.println(res.getString("name") +" - "+ res.getString("mail"));
//		}
		
//------------------Update Database------------------------//
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/navi","root","");
//	    String updateQuery = "UPDATE navi SET name = 'Jyoti' WHERE name = 'Navi'";
//	    Statement st = conn.createStatement();
//	    st.executeUpdate(updateQuery);
//	    System.out.println("Data updated");
		
//------------Delete Data------------------//
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/navi","root","");
//		String deleteQuery = "DELETE FROM navi WHERE mail='navi@gmail.com'";
//		Statement st = conn.createStatement();
//	    st.executeUpdate(deleteQuery);
//	    System.out.println("Data deleted Successfully ");
	    
	    
	}

} 



