package firstPoject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {
	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
	WebDriver x=new ChromeDriver();
	x.get("file:///C:/Users/CSC/Desktop/html/httt.html");
	List<WebElement> y= x.findElements(By.xpath("//input"));
	int t=y.size();
	for(WebElement v:y) {
		v.sendKeys("my name");
	}
	for(int i=t-1;i>=0;i--) 
	{
		WebElement r=y.get(i);
		r.clear();
	}
	x.close();
}
}
