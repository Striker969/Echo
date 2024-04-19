package advseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class swapping {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver t= new ChromeDriver();
//		t.get("file:///C:/Users/CSC/Desktop/httt.html");
//		Thread.sleep(2000);
//		WebElement x=t.findElement(By.id("a"));
//		x.sendKeys(Keys.CONTROL+"ax");
//		Thread.sleep(2000);
//		WebElement y=t.findElement(By.id("c"));
//		y.sendKeys(Keys.CONTROL+"v");
//		Thread.sleep(2000);
//		WebElement z=t.findElement(By.id("b"));
//		z.sendKeys(Keys.CONTROL+"ax");
//		Thread.sleep(2000);
//		WebElement z1=t.findElement(By.id("a"));
//		z1.sendKeys(Keys.CONTROL+"v");
//		Thread.sleep(2000);
//		WebElement z2=t.findElement(By.id("c"));
//		z2.sendKeys(Keys.CONTROL+"ax");	
//		Thread.sleep(2000);
//		WebElement z4=t.findElement(By.id("b"));
//		z4.sendKeys(Keys.CONTROL+"v");		
//
//
//	}
//}


//public class swapping {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("file:///C:/Users/CSC/Desktop/ttt.html");
//		x.manage().window().maximize();
////		Thread.sleep(2000);
//		WebElement y=x.findElement(By.id("a"));
//		boolean b=y.isDisplayed();
//		if(b) {
//			System.out.println("displayed");
//		}
//		else {
//			System.out.println("not displayed");
//		}
//	}
//}


//public class swapping {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("file:///C:/Users/CSC/Desktop/ttt.html");
//		x.manage().window().maximize();
////		Thread.sleep(2000);
//		WebElement y=x.findElement(By.id("b"));
//		boolean b=y.isEnabled();
//		if(b) {
//			System.out.println("Selected");
//		}
//		else {
//			System.out.println("not Selected");
//		}
//	}
//}


public class swapping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
		WebDriver x=new FirefoxDriver();
		x.get("file:///C:/Users/CSC/Desktop/ttt.html");
		x.manage().window().maximize();
//		Thread.sleep(2000);
		WebElement y=x.findElement(By.id("b"));
		boolean b=y.isEnabled();
		if(b) {
			System.out.println("Selected");
		}
		else {
			System.out.println("not Selected");
		}
	}
}