package firstPoject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Script10 {
	public static void main(String[] args) throws AWTException {
		WebDriver x=new ChromeDriver();
		x.get("https://www.netflix.com");
		WebElement y= x.findElement(By.xpath("//a[.='Sign In']"));
		Actions t=new Actions(x);
		t.contextClick(y).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
}
