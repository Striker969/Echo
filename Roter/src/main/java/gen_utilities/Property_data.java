package gen_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property_data {
	public String readdatafrompropfile(String key) throws IOException
	{
		FileInputStream fis=new  FileInputStream(Sites_and_data.filepath);
		Properties pro =new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
	}
}
