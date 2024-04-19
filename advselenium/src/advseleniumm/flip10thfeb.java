package advseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class flip10thfeb {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/button");
//		Thread.sleep(1000);
//		x.findElement(By.xpath("//button[@id='btn']")).click();
//		Thread.sleep(1000);
//		x.findElement(By.xpath("//button[@id='btn3']")).click();
//		Thread.sleep(1000);
//		x.findElement(By.xpath("//button[@id='btn8']")).click();
//
//	}
//}

//public class flip10thfeb {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/link?sublist=0");
//		Thread.sleep(2000);
//		x.findElement(By.xpath("//a[@class='text-white hover:text-slate-300 text-[14px]']")).click();
//	}
//}


public class flip10thfeb {
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
