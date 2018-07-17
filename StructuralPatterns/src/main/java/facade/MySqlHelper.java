package facade;

import java.sql.Connection;

public class MySqlHelper {

	public static Connection getMySqlDBConnection() {
		//get MySql DB connection using connection parameters
		return null;
	}

	public void generateMySqlPDFReport(String tableName, Connection connection) {
		//get data from table and generate pdf report
	}

	public void generateMySqlHTMLReport(String tablename, Connection connection) {
		//get data from table and generate HTML report
	}
}
