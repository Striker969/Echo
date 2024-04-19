package advseleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.get("https://www.youtube.com");
		String a=x.getTitle();
		System.out.println(a);
	}
}
