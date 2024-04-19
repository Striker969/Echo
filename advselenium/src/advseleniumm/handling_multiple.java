package advseleniumm;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class handling_multiple {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("file:///C:/Users/CSC/Desktop/html/coon.html");
//		List<WebElement> a=x.findElements(By.xpath("//input"));
//		ArrayList<WebElement> w1=new ArrayList<WebElement>(a);
//		int count =a.size();
//		System.out.println(count);
//		/*
//		 * for(int i=0;i<=count;i++) { WebElement we = w1.get(i); we.sendKeys("admin");
//		 * }
//		 */
//		for(int i=count-1;i>=0;i--)
//		{
//			WebElement we = w1.get(i);
//			we.sendKeys("admin");
//		}
//	}
//
//}


//public class handling_multiple {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.netflix.com");
//		List<WebElement> a= x.findElements(By.xpath("//a"));
//		int b=a.size();
//		System.out.println(b);
//		
//	}
//
//}


public class handling_multiple {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.get("https://www.netflix.com");
		List<WebElement> a= x.findElements(By.xpath("//a"));
		int b=a.size();
		System.out.println(b);
		for(int i=0;i<=b;i++) {
			WebElement t=a.get(i);
			System.out.println(t.getText());
		}
		
	}

}

