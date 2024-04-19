package firstPoject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.utilities;

//public class march15th {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui?scenario=1");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		WebElement w=x.findElement(By.xpath("//input[@id='name']"));
//		WebDriverWait wait=new WebDriverWait(x, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(w));
//		w.sendKeys("hello");
//	}
//}


//public class march15th {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		x.findElement(By.xpath("//input[@id='email']")).sendKeys("@gmail.com");
//		WebElement w= x.findElement(By.xpath("//input[@id='password']"));
//		w.sendKeys("121345");
//		w.sendKeys(Keys.CONTROL+"ac");
//		WebElement w1= x.findElement(By.xpath("//input[@id='confirmPassword']"));
//		w1.sendKeys(Keys.CONTROL+"v",Keys.ENTER);
//	}
//}



//public class march15th {
//	public static void main(String[] args) throws AWTException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		x.findElement(By.xpath("//input[@id='email']")).click();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_R);
//		r.keyRelease(KeyEvent.VK_R);
//		r.keyPress(KeyEvent.VK_
//		r.keyRelease(KeyEvent.VK_D);
//	}
//}



//public class march15th {
//	public static void main(String[] args) throws AWTException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		x.findElement(By.xpath("//input[@id='email']")).click();
//		String s="erecom";
//		Robot r=new Robot();
//		for(char c:s.toCharArray()) {
//			int finaltext=KeyEvent.getExtendedKeyCodeForChar(c);
//			r.keyPress(c);
//			r.keyRelease(finaltext);
//		}
//	}
//}




//public class march15th {
//	public static void main(String[] args) throws AWTException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		x.findElement(By.xpath("//input[@id='email']")).sendKeys("hello".toUpperCase());
//		x.findElement(By.xpath("//input[@id='email']")).sendKeys("HELLo".toLowerCase());
//	}
//}



//public class march15th {
//	public static void main(String[] args) throws AWTException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		WebElement w=x.findElement(By.xpath("//input[@id='email']"));
//		w.click();
//		w.sendKeys("hello".toUpperCase());
//		Robot r=new Robot();
//		r.key
//		
//		WebElement w1=x.findElement(By.xpath("//input[@id='password']"));
//		w1.click();
//	}
//}





//public class march15th {
//	public static void main(String[] args) throws AWTException {
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_ESCAPE);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		r.keyRelease(KeyEvent.VK_ESCAPE);
//	}
//}




//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException {
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ALT);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_ALT);
//		r.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ALT);
//		r.keyPress(KeyEvent.VK_F4);
//		r.keyRelease(KeyEvent.VK_ALT);
//		r.keyRelease(KeyEvent.VK_F4);
//	}
//}


//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		Runtime r=Runtime.getRuntime();
//		Process proc =r.exec("taskkill /im chrome.exe /f /t");
//	}
//}



//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		ChromeOptions op =new ChromeOptions();
//		op.addArguments("--headless");
//		WebDriver x=new ChromeDriver(op);
//		x.get("https://www.netflix.com");
//		Thread.sleep(2000);
//		System.out.println(x.getCurrentUrl());
//	}
//}


//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		ChromeOptions op =new ChromeOptions();
//		op.addArguments("--incognito");
//		WebDriver x=new ChromeDriver(op);
//		x.get("https://www.netflix.com");
//		Thread.sleep(2000);
//		System.out.println(x.getCurrentUrl());
//	}
//}


//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		ChromeOptions op =new ChromeOptions();
//		op.addArguments("--lang=tel");
//		WebDriver x=new ChromeDriver(op);
//		x.get("https://www.netflix.com");
//		Thread.sleep(2000);
//		System.out.println(x.getCurrentUrl());
//	}
//}



//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.netflix.com");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		TakesScreenshot t=(TakesScreenshot)x;
//		File s=t.getScreenshotAs(OutputType.FILE);
//		File d=new File("C:\\Users\\CSC\\Desktop\\html\\a2n\\defect.jpeg");
//		org.openqa.selenium.io.FileHandler.copy(s, d);
//		
//	}
//}


//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.netflix.com");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		TakesScreenshot t=(TakesScreenshot)x;
//		File s=t.getScreenshotAs(OutputType.FILE);
//		File d=new File(".\\Stackandchecked\\img\\defect.jpeg");
//		org.openqa.selenium.io.FileHandler.copy(s, d);	
//	}
//}



//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.bewakoof.com/p/mens-white-rebel-droid-graphic-printed-oversized-t-shirt");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		List<WebElement> li=x.findElements(By.xpath("//div[@class='selectSize']//span"));
//		for(WebElement w:li) {
//			String s=w.getText();
//			System.out.println(s);
//		}
//	}
//}



//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.bewakoof.com/p/mens-white-rebel-droid-graphic-printed-oversized-t-shirt");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		List<WebElement> li=x.findElements(By.xpath("//div[@class='selectSize']//span"));
//		for(WebElement w:li) {
//			String s=w.getText();
//			System.out.println(s);
//		}
//	}
//}


//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.bewakoof.com/p/mens-white-rebel-droid-graphic-printed-oversized-t-shirt");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		List<WebElement> li=x.findElements(By.xpath("//div[@class='selectSize']//span"));
//		for(WebElement w:li) {
//			String s=w.getText();
//			System.out.println(s);
//		}
//	}
//}


//public class march15th {
//	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.flipkart.com");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		x.findElement(By.xpath("//input[@type='text']")).sendKeys("puma");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		List<WebElement> w=x.findElements(By.xpath("//a[@class='oleBil']"));
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		String s="";
//		for(WebElement g:w) {
//			s=g.getText();
//			System.out.println(s);
//		}	
//		x.findElement(By.xpath("(//span[.='puma'])[5]")).click();
//	}
//}


//public class march15th{
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//iframe[@class='w-full h-96']"));
////		x.switchTo().frame(y);
//		x.switchTo().frame(0);
//		x.findElement(By.xpath("//input[@id='username']")).sendKeys("gmailcom");
//	}
//}

//
//public class march15th{
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement w= x.findElement(By.xpath("//select[@id='select2']"));
//		Select g=new Select(w);
//		ArrayList<String> h=new ArrayList<String>();
//		List<WebElement> t=g.getOptions();
//		for(WebElement b:t) {
//			String j=b.getText();
//			h.add(j);
//		}
//		Collections.sort(h);
//		Collections.reverse(h);
//		System.out.println(h);
//	}
//}


//public class march15th {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	utili
//	x.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	WebElement p= x.findElement(By.xpath("//iframe[@class='w-full h-96']"));
//	x.switchTo().frame(p);
//	WebElement y= x.findElement(By.xpath("//p[.='Admin@gmail.com']"));
//	String s=y.getText();
//	WebElement u=x.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
//	x.switchTo().frame(u);
//	WebElement m= x.findElement(By.xpath("//input[@name='email']"));
//	m.sendKeys(s);
//}
//}




//public class march15th{
//public static void main(String[] args) throws InterruptedException {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	x.findElement(By.xpath("//button[@id='buttonAlert5']")).click();
//	Thread.sleep(2000);
//	Alert a=x.switchTo().alert();
//	Thread.sleep(2000);
//	a.accept();
//	Thread.sleep(2000);
//	x.findElement(By.xpath("//button[@id='buttonAlert5']")).click();
//}
//}



//public class march15th {
//	public static void main(String[] args) throws AWTException, IOException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		Runtime r=Runtime.getRuntime();
//		Process p=r.exec("taskkill /im firefox.exe /f /t");
//	}
//}





public class march15th {
public static void main(String[] args) {
	WebDriver x=new ChromeDriver();
	x.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	WebElement y= x.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
	x.switchTo().frame(y);
	WebElement w=  x.findElement(By.xpath("//input[@id='email']"));
	w.sendKeys("roopak@gmail.com");
	w.sendKeys(Keys.CONTROL+"ac");
	x.switchTo().defaultContent();
	WebElement y1= x.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
	x.switchTo().frame(y1);
	x.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.CONTROL+"v");
}
}

















