package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {
	
	public static String getProperty()
	{
		String returnVal= null;
		try {
			FileReader reader = new FileReader("src/test/resources/qa.properties");
			Properties prop = new Properties();
			prop.load(reader);
			returnVal=prop.getProperty("URL");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		return returnVal;
	}
	

}
