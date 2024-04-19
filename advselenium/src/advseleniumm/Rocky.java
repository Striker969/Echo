package advseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class Rocky {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://www.instagram.com");
//		x.manage().window().maximize();
//		Thread.sleep(2000);
//		x.findElement(By.cssSelector("input[name='username']")).sendKeys("7785632333");
//		Thread.sleep(2000);
//		x.findElement(By.cssSelector("input[name='password']")).sendKeys("ieoerupg");
//		Thread.sleep(2000);
//		x.findElement(By.cssSelector("button[type='submit']")).click();
//	}
//}




//public class Rocky {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://www.youtube.com");
//		x.manage().window().maximize();
//		Thread.sleep(2000);
//		x.findElement(By.cssSelector("input#search")).sendKeys("bhale bhale chandada chandulli hennu neenu song");
//		Thread.sleep(2000);
//		x.findElement(By.cssSelector("button#search-icon-legacy")).click();
//		Thread.sleep(2000);
//		x.findElement(By.cssSelector("a[title='Bhale Bhale Chandadha Lyrical Video Song - Amruthavarshini | Ramesh, Suhasini | Kannada Old Songs']")).click();
//	}
//}

//public class Rocky {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://www.facebook.com");
//		x.manage().window().maximize();
//		Thread.sleep(2000);
//		x.findElement(By.xpath("//input[@type='text']")).sendKeys("bhale bhale chandada chandulli hennu neenu song");
//		Thread.sleep(2000);
//		x.findElement(By.xpath("//input[@type='password']")).sendKeys("bhale bhale ");
//		Thread.sleep(2000);
//		x.findElement(By.xpath("//button[@name='login']")).click();
//	}
//}


//public class Rocky {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://www.facebook.com");
//		x.manage().window().maximize();
//		Thread.sleep(2000);
//		x.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("bhale bhale chandada chandulli hennu neenu song");
//		Thread.sleep(2000);
//		x.findElement(By.xpath("//input[@type='password']")).sendKeys("bhale bhale ");
//		Thread.sleep(2000);
//		x.findElement(By.xpath("//button[@name='login']")).click();
//	}
//}


public class Rocky {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
		WebDriver x=new FirefoxDriver();
		x.get("https://demoapps.qspiders.com/ui?scenario=1");
		x.manage().window().maximize();
		Thread.sleep(2000);
//		x.findElement(By.xpath("//section[@class='poppins text-[14px]']")).click();
//		Thread.sleep(2000);
//		x.findElement(By.xpath("//a[@class='poppins ps-1 pe-3 py-1 font-semibold flex items-center justify-between w-full text-[14px] text-orange-500 active']")).click();
//		Thread.sleep(2000);
		x.findElement(By.xpath("//input[@id='name']")).sendKeys("Roopak Balu");
		Thread.sleep(2000);
		x.findElement(By.xpath("//input[@id='email']")).sendKeys("roopakbalu206@gmail.com");
		Thread.sleep(2000);
		x.findElement(By.xpath("//input[@id='password']")).sendKeys("tango397");
		Thread.sleep(12000);
		x.findElement(By.xpath("//button[@type='submit']")).click();
	}
}







//public class Rocky {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://www.youtube.com");
//		x.manage().window().maximize();
//		Thread.sleep(2000);
//		x.findElement(By.cssSelector("input[name='username']")).sendKeys("7785632333");
//		Thread.sleep(2000);
//		x.findElement(By.cssSelector("input[name='password']")).sendKeys("ieoerupg");
//		Thread.sleep(2000);
//		x.findElement(By.cssSelector("button[type='submit']")).click();
//	}
//}
