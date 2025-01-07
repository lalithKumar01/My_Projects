package learnJDBC;
import java.sql.*;
public class Basics {

	public static void main(String[] args) throws Exception {
		String url ="jdbc:mysql://localhost:3306/learndb";
		String uname ="root";
		String pass="Barath@8778";
		int id = 8;
		String name = "Hope";
		String date ="2024-01-21";
		double amount= 300.00;
		boolean paid = true;
		String query = "INSERT into PGIncome values (?,?,?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2, name);
		st.setString(3,date );
		st.setDouble(4, amount);
		st.setBoolean(5, paid);
		int count = st.executeUpdate();
		System.out.println(count);
		//ResultSet rs =st.executeQuery(query);
	/* while (rs.next()) {
		 String name =rs.getInt(1)+": "+ rs.getString(2)+" "+rs.getDate(3)+" "+rs.getBigDecimal(4)+" "+ rs.getBoolean(5);
		 System.out.println(name);

	}*/
		st.close();
		con.close();
	}

	

}
