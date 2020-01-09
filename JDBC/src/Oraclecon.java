import java.sql.*;

public class Oraclecon {
		public static void main(String arg[])
		{
			try {
//Load the driver

				Class.forName("oracle.jdbc.driver.OracleDriver");

//Create the connection object
// Change your port and user and password
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:Port_name:xe", "user","password");

//Create Statement object

			Statement stmt = con.createStatement();
//String query = "insert into emp1 values (?,?,?)";
//PreparedStatement st = prepareStatement(query);
//st.setInt(1,id);
//st.setString(2,name);
//st.setInt(3,age);

//Execute Statement

			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");

//Inserting record into table
			int count = stmt.executeUpdate("insert into student values(103,'Rohit')");

			System.out.println(count+"row's affected");

//close the connection object
			con.close();

			} catch (ClassNotFoundException e) {

			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

}