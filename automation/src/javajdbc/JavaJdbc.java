package javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://10.100.20.155:3306/test_common_gateway\",\"qc_user\", \"qc_user");
        Statement smt=con.createStatement();
        String s="Select*from ci_tbl_tags";
        smt.executeQuery(s);
        con.close();
	}

}
