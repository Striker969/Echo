package gen_utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
import com.mysql.jdbc.Driver;

public class DB_data {
	Connection con=null;
	public void connection() throws SQLException {
		Driver dr=new Driver();
		DriverManager.registerDriver(dr);
		con=DriverManager.getConnection(Sites_and_data.db_url,Sites_and_data.username,Sites_and_data.pwd);
	}
	public void executequery(String query,int colindex,String expdata) throws SQLException {
		java.sql.Statement state=con.createStatement();
		ResultSet rs=state.executeQuery(query);
		boolean flag=false;
		while(rs.next()) {
			String actdata=rs.getString(colindex);
			if(actdata.contains(expdata)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("data is present and verified");
		}
		else {
			System.out.println("data is not present");
		}
		}
	
	
	public void executeupdate(String query) throws SQLException {
		java.sql.Statement state=con.createStatement();
		int in=state.executeUpdate(query);
	}

	
	
	public void closecon() throws SQLException {
		con.close();
	}
}
