import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {
	FileInputStream stream;
	//String filePath="D:\\oracle\\oracle_21stJulyBatch_repo\\Codes\\Java-Part2\\DatabaseApp\\resources\\config.properties";

	public Properties getConfigurationProperties(String filePath) throws IOException {
		Properties props = null;
		try {
			stream = new FileInputStream(filePath);
			if (stream != null) {
				props = new Properties();
				props.load(stream);
			} else {
				throw new FileNotFoundException("property file path '" + filePath + "' not found");
			}

		}catch(FileNotFoundException ex) {
			throw ex;
		}
		catch (IOException ex) {
			throw ex;
		} catch (Exception ex) {
			throw ex;
		}
		return props;
	}
}
