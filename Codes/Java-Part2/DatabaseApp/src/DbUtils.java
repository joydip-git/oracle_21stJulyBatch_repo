import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtils {
	public static Connection createConnection(String filePath) throws SQLException, FileNotFoundException, IOException {
		ConfigurationManager manager = null;
		Connection connection = null;
		try {
			manager = new ConfigurationManager();
			Properties props = manager.getConfigurationProperties(filePath);
			String dbURL = props.getProperty("DB_URL");
			String userName = props.getProperty("USERNAME");
			String password = props.getProperty("PASSWORD");

			connection = DriverManager.getConnection(dbURL, userName, password);

			if (connection == null) {
				throw new SQLException("database not connected");
			}

		} catch (FileNotFoundException ex) {
			// System.out.println(ex.getMessage());
			throw ex;
		} catch (IOException ex) {
			// System.out.println(ex.getMessage());
			throw ex;
		} catch (SQLException ex) {
			// System.err.format("SQL state: %s\n%s", ex.getSQLState(), ex.getMessage());
			throw ex;
		} catch (Exception ex) {
			// ex.printStackTrace();
			throw ex;
		}
		return connection;
	}

	public static void closeConnection(Connection connection) throws SQLException {
		if (!connection.isClosed()) {
			connection.close();
		}
	}
	
	public static String readQuery(String filePath, String key) throws IOException {
		ConfigurationManager manager = null;
		try {
			manager = new ConfigurationManager();
			Properties props = manager.getConfigurationProperties(filePath);
			String query = props.getProperty(key);
			return query;
		}catch(IOException ex) {
			throw ex;
		}catch(Exception ex) {
			throw ex;
		}
	}
}
