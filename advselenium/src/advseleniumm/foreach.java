package advseleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class foreach {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("file:///C:/Users/CSC/Desktop/html/httt.html");
//		List<WebElement> y= x.findElements(By.xpath("//input"));
//		int t=y.size();
//		for(WebElement v:y) {
//			v.click();
//		}
//		for(int i=t-1;i>=0;i--) {
//			
//			WebElement r=y.get(i);
//			r.click();
//		}
//	}
//}

//public class foreach {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("file:///C:/Users/CSC/Desktop/html/httt.html");
//		List<WebElement> y= x.findElements(By.xpath("//input"));
//		int t=y.size();
//		for(WebElement v:y) {
//			v.sendKeys("my name");
//		}
//		for(int i=t-1;i>=0;i--) 
//		{
//			WebElement r=y.get(i);
//			r.clear();
//		}
//		x.close();
//	}
//
//}


public class foreach {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.get("https://www.netflix.com");
		List<WebElement> y= x.findElements(By.xpath("//img"));
//		int t=y.size();
		for(WebElement v:y) {
			System.out.println(v.getAttribute("src"));
		}
	}
}
