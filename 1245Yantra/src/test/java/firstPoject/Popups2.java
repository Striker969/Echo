package firstPoject;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//public class Popups2 {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.manage().window().maximize();
//		x.get("https://demoapps.qspiders.com/ui/download?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		x.findElement(By.xpath("//textarea[@name='textarea']")).sendKeys("hello");
//		x.findElement(By.xpath("//button[.='Download']")).click();	
//	}
//}


//public class Popups2 {
//	public static void main(String[] args) {
//		ChromeOptions c=new ChromeOptions();
//		HashMap<String, Object> h=new HashMap<String, Object>();
//		h.put("download.default_directory", "C:\\Users\\CSC\\Desktop\\html\\a2n");
//		c.setExperimentalOption("prefs", h);
//		WebDriver x=new ChromeDriver(c);
//		x.manage().window().maximize();
//		x.get("https://demoapps.qspiders.com/ui/download?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		x.findElement(By.xpath("//textarea[@name='textarea']")).sendKeys("hello");
//		x.findElement(By.xpath("//button[.='Download']")).click();	
//	}
//}




//public class Popups2 {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.manage().window().maximize();
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		String un="admin";
//		String pwd="admin";
//		String url="https://"+un+":"+pwd+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
//		x.get(url);
//	}
//}



//public class Popups2 {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x=new ChromeDriver();
//		x.manage().window().maximize();
//		x.get("https://demoapps.qspiders.com/ui/modal?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		x.findElement(By.xpath("//button[.='Open Modal']")).click();
//		Thread.sleep(1000);
//		x.findElement(By.xpath("//button[.='close']")).click();	
//	}
//}

//public class Popups2 {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x=new ChromeDriver();
//		x.manage().window().maximize();
//		x.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		x.findElement(By.xpath("//button[.='Open Modal']")).click();
//		Thread.sleep(1000);
//		x.findElement(By.xpath("//section[@class='flex justify-end py-2']//button[.='Open Modal']")).click();
//		Thread.sleep(1000);
//		WebElement s=x.findElement(By.xpath("//p[.='This is the secondary modal']"));
//		String t=s.getText();
//		System.out.println(t);
//		x.findElement(By.xpath("//button[.='close']")).click();	
//		Thread.sleep(1000);
//		x.findElement(By.xpath("//section[@class='flex justify-end pt-2']//button[@id='multiclose2']")).click();	
//	}
//}


//public class Popups2 {
//	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions op=new ChromeOptions();
//		op.addArguments("--use-fake-ui-for-media-stream");
//		WebDriver x=new ChromeDriver(op);
//		x.manage().window().maximize();
//		x.get("https://mictests.com/");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		x.findElement(By.xpath("//button[.='Test my mic']")).click();
//	}
//}


//public class Popups2 {
//public static void main(String[] args) throws InterruptedException {
//	ChromeOptions op=new ChromeOptions();
//	op.addArguments("--use-fake-ui-for-media-stream");
//	WebDriver x=new ChromeDriver(op);
//	x.manage().window().maximize();
//	x.get("https://www.thesouledstore.com");
//	x.get("https://www.nike.com");
//	x.get("https://www.hotstar.com");
//
//}
//}



//public class Popups2 {
//public static void main(String[] args) throws InterruptedException {
//	WebDriver x=new ChromeDriver();
//	x.manage().window().maximize();
//	x.get("https://www.thesouledstore.com");
//	x.switchTo().newWindow(WindowType.TAB);
//	x.get("https://www.nike.com");
//	x.switchTo().newWindow(WindowType.TAB);
//	x.get("https://www.hotstar.com");
//	x.switchTo().newWindow(WindowType.TAB);
//}
//}



//public class Popups2 {
//public static void main(String[] args) throws InterruptedException {
//	WebDriver x=new ChromeDriver();
//	WebDriverWait w=new WebDriverWait(x, Duration.ofSeconds(10));
//	w.until(ExpectedConditions.)
	
	
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	x.manage().window().maximize();
//	for(int i=0;i<5;i++){
//	x.switchTo().newWindow(WindowType.TAB);
//	}
//}
//}



//public class Popups2 {
//public static void main(String[] args) throws InterruptedException {
//	WebDriver x=new ChromeDriver();
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	x.manage().window().maximize();
//	JavascriptExecutor js=(JavascriptExecutor)x;
//	js.executeScript("window.location=arguments[0]","https://demoapps.qspiders.com/ui/button?sublist=0");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	Thread.sleep(1000);
//	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//	
//	WebElement tt = x.findElement(By.xpath("//h5[.='NEED HELP']"));
//	Thread.sleep(1000);
//	js.executeScript("arguments[0].scrollIntoView()",tt);
//	
//	WebElement g1=x.findElement(By.xpath("//input[@id='name']"));
//	Thread.sleep(1000);
//	js.executeScript("arguments[0].value=arguments[1]", g1,"hello");
//	
//	WebElement g12=x.findElement(By.xpath("//button[@id='btn']"));
//	Thread.sleep(1000);
//	js.executeScript("arguments[0].click()", g12);
//	
//	WebElement g13=x.findElement(By.xpath("//p[.='1. Are you satisfied with the registration process?']"));
//	String s=g13.getText();
//	System.out.println(s);
//}
//}



















