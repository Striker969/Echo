package firstPoject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.get("https://www.flipkart.com");
		x.manage().window().maximize();
		Thread.sleep(2000);
		x.findElement(By.xpath("//input[@name='q']")).sendKeys("puma");
		Thread.sleep(2000);
		x.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		x.findElement(By.xpath("//a[@title='Wild Rider Rollin Sneakers For Women']")).click();
//		Thread.sleep(2000);

	}

}
