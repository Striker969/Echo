package assignment_and_prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gen_utilities.Excel_data;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;

public class A_and_P {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
//		Webdriver_utility wu=new Webdriver_utility();
//		Property_data pd=new Property_data();
//		WebDriver dr=new FirefoxDriver();
//		Excel_data ex=new Excel_data();
		
		//8
		
//		dr.get("https://www.amazon.in/s?k=iphone+13&crid=2AKV64UKHP8W3&sprefix=iphone+13%2Caps%2C237&ref=nb_sb_noss_1");
//		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		dr.manage().window().maximize();
//		WebElement w=dr.findElement(By.xpath("//span[.='Apple iPhone 14 (128 GB) - Blue']/ancestor::div[@class='sg-col-20-of-24 s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 AdHolder sg-col s-widget-spacing-small sg-col-12-of-16']/following-sibling::div[@class='sg-col-20-of-24 s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col s-widget-spacing-small sg-col-12-of-16']//span[.='Apple iPhone 13 (128GB) - Blue']/ancestor::div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/following-sibling::div[@class='puisg-row']//span[@class='a-price']"));
//		String s=w.getText();
//		ex.writedataintoexcel("sheet1", 7, 4, s);
		
		//* 3) //span[.='SHOP NOW']
		
		//

		
		// 1)
		
//		String str=pd.readdatafrompropfile("netflixurl");
////		wu.launchbrowser(dr, str);
//		for(int i=0;i<4;i++) {
//			dr.switchTo().newWindow(WindowType.WINDOW);
//		}
//	    Set<String> com=dr.getWindowHandles();
//	    int count=0;
//	    for(String a:com) {
//	    	count++;
//	    	if(count==1) {
//	    		dr.switchTo().window(a);
//	    		dr.close();
//	    		break;
//	    	}
//	    }
	    
	    // 4)
	    
//		WebDriver x=new FirefoxDriver();
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		x.manage().window().maximize();
//		for(int i=0;i<1;i++) {
//			x.switchTo().newWindow(WindowType.TAB);
//			x.get("https://www.google.com");
//			x.switchTo().newWindow(WindowType.TAB);
//			x.get("https://www.facebook.com");
//		}
		
		// 5)
		
		//label[.='Last Name']/following-sibling::br/following-sibling::input[@name='name']
		
		// 6)
		
//		WebDriver x=new FirefoxDriver();
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		x.manage().window().maximize();
//		x.get("https://www.youtube.com/");
//		x.findElement(By.xpath("//input[@id='search']")).click();
//		x.findElement(By.xpath("//input[@id='search']")).sendKeys("tujhme");
//		Thread.sleep(4000);
//		Robot ro=new Robot();
//		ro.keyPress(KeyEvent.VK_DOWN);
//		ro.keyRelease(KeyEvent.VK_DOWN);
//		ro.keyPress(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_ENTER);
		
		// 7)
		
		//a[.='Samsung']
		
		//9
		
//		dr.manage().window().maximize();
//		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		dr.get("https://www.facebook.com/");
//		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("aaaaa");
//		dr.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("11111");
//		dr.findElement(By.xpath("//button[@name='login']")).click();
		
		WebDriver x=new EdgeDriver();
		x.manage().window().maximize();
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		x.get("file:///C:/Users/CSC/Desktop/myfol/ht.html");
		WebElement web=x.findElement(By.xpath("//input[@id='disabledField']"));
		JavascriptExecutor js=(JavascriptExecutor)x;
		js.executeScript("arguments[0].removeAttribute('disabled')",web);
		web.sendKeys("hello");
	}
}













