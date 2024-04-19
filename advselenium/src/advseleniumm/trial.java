package advseleniumm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trial {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="./eveningselenium/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		
		
//		String k="webdriver.chrome.driver";
//		String v="./eveningselenium/chromedriver.exe";
//		System.setProperty(k, v);
//		ChromeDriver drive=new ChromeDriver();
	}
}
//String key="webdriver.chrome.driver";
//String value="./eveningselenium/chromedriver.exe";
//System.setProperty(key, value);
//ChromeDriver driver=new ChromeDriver();