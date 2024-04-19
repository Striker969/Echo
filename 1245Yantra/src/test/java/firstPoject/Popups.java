package firstPoject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import generic.utilities;

//public class Popups {
//
//	public static void main(String[] args) {
//		WebDriver x=new FirefoxDriver();
//		x.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		x.findElement(By.xpath("//button[@id='buttonAlert2']")).click();
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		Alert a=x.switchTo().alert();
//		System.out.println(a.getText());
//		a.accept();
//	}
//
//}


//public class Popups {
//
//	public static void main(String[] args) {
//		WebDriver x=new FirefoxDriver();
//		x.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		x.findElement(By.xpath("//a[.='Confirm']")).click();
//		x.findElement(By.xpath("//button[@id='buttonAlert5']")).click();
//		Alert a=x.switchTo().alert();
//		a.accept();
//		x.switchTo().defaultContent();
//		x.findElement(By.xpath("//button[@id='buttonAlert5']")).click();	
//		Alert a1=x.switchTo().alert();
//		a1.dismiss();	
//	}
//}



//public class Popups {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x=new FirefoxDriver();
//		x.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		x.findElement(By.xpath("//a[.='Prompt']")).click();
//		x.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
//		Alert a=x.switchTo().alert();
//		a.sendKeys("yes");
//		a.accept();
//		String s=x.findElement(By.xpath("//p[.='You selected yes']")).getText();
//		if(s.contains("yes")) {
//			System.out.println("you selected yes");
//		}
//		else {
//			System.out.println("you selected no");
//		}
//	}
//}



//public class Popups {
//	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions op=new ChromeOptions();
//		op.addArguments("--disable-notifications");
//		WebDriver x=new ChromeDriver(op);
//		x.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		x.findElement(By.xpath("//button[@id='browNotButton']")).click();
//	}
//}


//public class Popups {
//	public static void main(String[] args) throws InterruptedException {
////		ChromeOptions op=new ChromeOptions();
////		op.addArguments("--disable-notifications");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.bus.irctc.co.in/home");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		x.findElement(By.xpath("//span[.='Bus Tickets']")).click();
//		x.findElement(By.xpath("//input[@id='goingTo']")).sendKeys("Darra");
//		x.findElement(By.xpath("//input[@id='departFrom']")).sendKeys("Bangalore");
//		WebElement h = x.findElement(By.xpath("//input[@id='departFrom']"));
//		Select s=new Select(h);
//		s.selectByIndex(1);
////		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//	}
//}



//public class Popups {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		x.findElement(By.xpath("//a[@id='browserLink1']")).click();
//		Set<String> s=x.getWindowHandles();
//		for(String t:s) {
//			x.switchTo().window(t);
//			String title=x.getCurrentUrl();
//			if(title.contains("SignUpPage")) {
//				break;
//			}
//		}
//		x.findElement(By.xpath("//input[@id='email']")).sendKeys("@gmail.com");
//		System.out.println(s);
//	}
//}



//public class Popups {
//	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions u=new ChromeOptions();
//		u.addArguments("--disable-notifications");
//		WebDriver x=new ChromeDriver(u);
//		x.get("https://www.irctc.co.in/nget/train-search");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		x.findElement(By.xpath("//span[@class='railDrishti fa fa-bus']")).click();
//		Set<String> y=x.getWindowHandles();
//		for(String z:y) {
//			x.switchTo().window(z);
//			String j=x.getCurrentUrl();
//			System.out.println(j);
//			if(j.contains("bus"));{
//				break;
//			}
//		}
//		x.findElement(By.xpath("//input[@id='goingTo']")).sendKeys("man");
//		x.findElement(By.xpath("//div[.='Mangalore']")).click();
//	}
//}



//public class Popups {
//	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions u=new ChromeOptions();
//		u.addArguments("--disable-notifications");
//		WebDriver x=new ChromeDriver(u);
//		x.get("https://www.irctc.co.in/nget/train-search");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		x.findElement(By.xpath("//span[@class='railDrishti fa fa-bus']")).click();
//		Set<String> y=x.getWindowHandles();
//		for(String z:y) {
//			x.switchTo().window(z);
//			String j=x.getCurrentUrl();
//			System.out.println(j);
//			if(j.contains("bus")){
//				break;
//			}
//		}
//		x.findElement(By.xpath("//input[@id='goingTo']")).sendKeys("man");
//		x.findElement(By.xpath("//div[.='Mangalore']")).click();
//	}
//}



//public class Popups {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x=new ChromeDriver();
//		x.manage().window().maximize();
//		utilities u=new utilities();
//		x.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		x.findElement(By.xpath("//button[@id='browserButton3']")).click();
//		u.switchwin(x,"SignUp");
//		x.findElement(By.xpath("//input[@id='username']")).sendKeys("hkdj");
//		u.switchwin(x, "SignUpPage");
//		x.findElement(By.xpath("//input[@id='email']")).sendKeys("hkdj");
//		u.switchwin(x, "Login");
//		x.findElement(By.xpath("//input[@id='password']")).sendKeys("hkdj");
//	}
//}




//public class Popups {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x=new ChromeDriver();
//		x.manage().window().maximize();
//		x.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement w=x.findElement(By.xpath("//input[@id='fileInput']"));
//		w.sendKeys("C:\\Users\\CSC\\Desktop\\html\\end to end.txt");
//		WebElement t=x.findElement(By.xpath("//p[.='end to end.txt']"));
//		String a=t.getText();
//		System.out.println(a);		
//	}
//}



//public class Popups {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver x=new ChromeDriver();
//		x.manage().window().maximize();
//		x.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement w=x.findElement(By.xpath("//div[.='Upload File']"));
////		w.click();
//		w.sendKeys("C:\\Users\\CSC\\Desktop\\html\\end to end.txt");
////		WebElement t=x.findElement(By.xpath("//p[.='end to end.txt']"));
////		String a=t.getText();
////		System.out.println(a);		
//	}
//}




public class Popups {
	public static void main(String[] args)  {
		WebDriver x=new ChromeDriver();
		x.manage().window().maximize();
		x.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement w=x.findElement(By.xpath("//input[@id='fileInput']"));
		w.sendKeys(System.getProperty("user.dir")+"/src/test/resources/Untitled 2");

	}
}






















