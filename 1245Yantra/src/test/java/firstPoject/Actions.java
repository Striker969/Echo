package firstPoject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	public static void main(String[] args) {
		WebDriver x=new ChromeDriver();
		x.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement z = x.findElement(By.xpath("//button[@id='btn30']"));
		//thogo guru helooooo
	
	}

}
