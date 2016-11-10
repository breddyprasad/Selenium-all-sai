package DBConnection;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) throws Throwable {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sasi", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt("Sno") + "  " + rs.getString("EmpName"));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}finally{
			if(con != null)
				con.close();
		}
	}
}