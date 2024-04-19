package firstPoject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
		WebDriver x=new FirefoxDriver();
		x.get("https://www.netflix.com");
		String y=x.getTitle();
		String t=x.getCurrentUrl();
		System.out.println(y);
		System.out.println(t);
		x.quit();
	}
}
