package realtimeautomation.selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Assert;

public class BaseTest {

	
	protected static String profile;
	public static Properties TestDataProperties;
	public static String AppUrl;

	public void setupSuite() throws Exception {
		
		profile = System.getenv("ENVIRONMENT");

		if (profile == null) {
			Assert.fail("Environment Variable NOT Set");
		}
		
		String path = "src/main/resources/ui/TestData/";
		
		
		TestDataProperties = new Properties();
		File testdatafile = new File(path + "TestData.properties");
		FileInputStream fileInput = new FileInputStream(testdatafile);
		TestDataProperties.load(fileInput);
		fileInput.close();
		
		AppUrl = TestDataProperties.getProperty("Utest.url." + profile);
	}
	
}
