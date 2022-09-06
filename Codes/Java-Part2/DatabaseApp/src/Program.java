import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		String path = "D:\\\\oracle\\\\oracle_21stJulyBatch_repo\\\\Codes\\\\Java-Part2\\\\DatabaseApp\\\\resources\\\\config.properties";
		readRecords(path);
	}

	static void readRecords(String path) throws FileNotFoundException, SQLException, IOException {
		Connection connection = null;
		Statement command = null;
		ResultSet records = null;
		try {
			connection = DbUtils.createConnection(path);
			// if (connection != null) {
			// System.out.println("connected");
			command = connection.createStatement();
			String selectQuery = DbUtils.readQuery(path, "SELECT_QUERY");
			records = command.executeQuery(selectQuery);
			while (records.next()) {
				int id = records.getInt("id");
				String name = records.getString("name");
				System.out.println(id+" "+name);
			}
			// }
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			DbUtils.closeConnection(connection);
		}
	}
}
