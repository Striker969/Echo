package firstPoject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProjectTest {

	public static void main(String[] args) {
		WebDriver x=new ChromeDriver();
		x.get("https://www.netflix.com");
		WebElement y=x.findElement(By.name("xys"));
	}
}
