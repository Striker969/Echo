package firstPoject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script6 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver t= new ChromeDriver();
	t.get("file:///C:/Users/CSC/Desktop/html/yyy.html");
	Thread.sleep(2000);
	WebElement x=t.findElement(By.id("a"));
	x.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	WebElement y=t.findElement(By.id("c"));
	y.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	WebElement z=t.findElement(By.id("b"));
	z.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	WebElement z1=t.findElement(By.id("a"));
	z1.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	WebElement z2=t.findElement(By.id("c"));
	z2.sendKeys(Keys.CONTROL+"ax");	
	Thread.sleep(2000);
	WebElement z4=t.findElement(By.id("b"));
	z4.sendKeys(Keys.CONTROL+"v");		


}
}
