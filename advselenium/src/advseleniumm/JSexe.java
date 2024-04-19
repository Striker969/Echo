package advseleniumm;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class JSexe {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("file:///C:/Users/CSC/Desktop/html/coon.html");
//		x.manage().window().maximize();
//		JavascriptExecutor y= (JavascriptExecutor)x;
//		Thread.sleep(1000);
//		y.executeScript("document.getElementById('k').value='abc'");
//	}
//}

//public class JSexe {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://www.hotstar.com");
//		x.manage().window().maximize();
//		JavascriptExecutor y= (JavascriptExecutor)x;
//		Thread.sleep(1000);
//		y.executeScript("window.scrollBy(0,600)");
//		y.executeScript("window.scrollBy(0,-600)");
//	}
//}


public class JSexe {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
		WebDriver x=new FirefoxDriver();
		x.get("https://www.flipkart.com");
		x.manage().window().maximize();
		Thread.sleep(1000);
		x.findElement(By.xpath("//span[.='Mobiles']")).click();
		Thread.sleep(1000);
		TakesScreenshot y= (TakesScreenshot)x;
		Thread.sleep(1000);
		File src=y.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\CSC\\Desktop\\html\\a2n\\defect3.jpeg");
		x.findElement(By.xpath("//span[.='Mobiles']")).click();
		
//		org.openqa.selenium.io.FileHandler.copy(u, dest);
		org.openqa.selenium.io.FileHandler.copy(src, dest);
//		"C:\Users\CSC\Desktop\html\a2n"
	}
}
