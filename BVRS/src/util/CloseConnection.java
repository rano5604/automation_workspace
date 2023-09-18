package util;

import java.sql.Connection;
import java.sql.SQLException;

public class CloseConnection {
	
	Connection conn;
	
	public CloseConnection(Connection conn){
		this.conn = conn;
	}
	
	public void closeConnection(){
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
