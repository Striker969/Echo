package advseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
		WebDriver x=new FirefoxDriver();
		x.get("file:///C:/Users/CSC/Desktop/html/ddot.html");
		WebElement y=x.findElement(By.id("h"));
		y.sendKeys("hello");
//		x.switchTo().frame(0);
//		x.switchTo().frame("c");
		WebElement u = y.findElement(By.xpath("//iframe[@id='c']"));
		x.switchTo().frame(u);
		x.findElement(By.id("k")).sendKeys("helloboiis");
	}
}
