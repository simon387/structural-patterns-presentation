package facade;

import java.sql.Connection;

public class FacadePatternTest {

	public static void main(String[] args) {

		String tableName = "Employee";

		//generating Mysql HTML report and Oracle PDF report without using Facade
		Connection connection = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, connection);

		Connection connection1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOracleHTLMReport(tableName, connection);

		//generating Mysql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,
				HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,
				HelperFacade.ReportTypes.PDF, tableName);

		//più pulito, più semplice, toglie logica client side
	}
}
