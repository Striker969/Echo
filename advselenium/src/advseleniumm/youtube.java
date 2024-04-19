package advseleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.firefox.FirefoxDriver;


//class youtube{
//	public static void main(String[] args) throws InterruptedException  {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		FirefoxDriver x=new FirefoxDriver();
//		Thread.sleep(2000);
////		x.close();
//		x.quit();
//	}
//}

class youtube{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.get("https://www.flipkart.com");
	}
}

