package advseleniumm;

//package advseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class mozz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
		WebDriver x=new FirefoxDriver();
		x.get("https://www.instagarm.com");
		x.manage().window().maximize();
		Thread.sleep(2000);
		x.findElement(By.cssSelector("input[name='username']")).sendKeys("7785632333");
		Thread.sleep(2000);
		x.findElement(By.cssSelector("input[name='password']")).sendKeys("ieoerupg");
		Thread.sleep(2000);
		x.findElement(By.cssSelector("button[type='submit']")).click();
	}
}

