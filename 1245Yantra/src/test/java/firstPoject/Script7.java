package firstPoject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver x=new FirefoxDriver();
		x.get("https://www.hotstar.com");
		x.manage().window().maximize();
		JavascriptExecutor y= (JavascriptExecutor)x;
		Thread.sleep(1000);
		y.executeScript("window.scrollBy(0,600)");
		y.executeScript("window.scrollBy(0,-600)");
	}
}
