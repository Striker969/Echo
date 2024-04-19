package firstPoject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class Calender_pop {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x= new FirefoxDriver();
//		x.manage().window().maximize();
//		x.get("https://www.goibibo.com");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//		x.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
//		Thread.sleep(2000);
//		x.findElement(By.xpath("//span[.='Departure']")).click();
//		String s="March 2025";
//		String st="27";
//		for(;;) {
//			try {				
//		x.findElement(By.xpath("//div[text()='"+s+"']/../..//p[text()='"+st+"']")).click();
//		break;
//			}
//			catch(Exception w) {			
//				x.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//			}
//		}
//	}
//}
//span[text()='July']/../../..//a[text()='26']


//public class Calender_pop {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x= new FirefoxDriver();
//		x.manage().window().maximize();
//		x.get("https://www.irctc.co.in/nget/train-search");
//		x.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
//		x.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
//		Thread.sleep(2000);
//		for(;;) {
//			try {
//			x.findElement(By.xpath("//span[text()='July']"));
//			x.findElement(By.xpath("//a[text()='26']")).click();
//			break;
//		}
//		catch(Exception e) {
//		x.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
//		}
//		}
//	}
//}




//public class Calender_pop {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x= new FirefoxDriver();
//		x.manage().window().maximize();
//		x.get("https://www.makemytrip.com");
//		x.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
//		x.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
//		Thread.sleep(2000);
//		for(;;) {
//			try {
//			x.findElement(By.xpath("//span[text()='July']"));
//			x.findElement(By.xpath("//a[text()='26']")).click();
//			break;
//		}
//		catch(Exception e) {
//		x.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
//		}
//		}
//	}
//}


//class Calender_pop{
//	static WebDriver driver;
//	public static void main(String[] args) throws IOException, InterruptedException {
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commonfile.properties");
//		Properties pro = new Properties();
//		pro.load(fis);
//		String browser = pro.getProperty("browser");
//		String url = pro.getProperty("website");
//		String un = pro.getProperty("username");
//		String pwd = pro.getProperty("password");
//		if(browser.equalsIgnoreCase("chrome")) {
//			driver=new ChromeDriver();
//		}
//		else if(browser.equalsIgnoreCase("firefox")) {
//			driver =new FirefoxDriver();
//		}
//		Thread.sleep(2000);
//		driver.get(url);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//}



//class Calender_pop{
//	static WebDriver driver;
//	public static void main(String[] args) throws IOException, InterruptedException {
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commonfile.properties");
//		Properties pro = new Properties();
//		pro.load(fis);
//		String url = pro.getProperty("fb");
//		String un = pro.getProperty("fbun");
//		String pwd = pro.getProperty("fbpwd");
//		driver=new ChromeDriver();
//		Thread.sleep(2000);
//		driver.get(url);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}
//}




class Calender_pop{
	public static void main(String[] args) throws IOException   {
//		FileInputStream fin= new FileInputStream(".\\src\\test\\resources\\data.properties");
		Properties p= new Properties();
		p.setProperty("browser", "firefox");
		p.setProperty("url", "http://rmgtestingserver:8888/");
		p.setProperty("un", "admin");
		p.setProperty("pwd", "admin");
		FileOutputStream fout= new FileOutputStream(".\\src\\test\\resources\\data.properties");
		p.store(fout, "credentials");
	}
}



