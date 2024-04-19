package advseleniumm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class both {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.youtube.com");
//		String y=x.getTitle();
//		String t=x.getCurrentUrl();
//		System.out.println(y);
//		System.out.println(t);
//		x.quit();
//	}
//
//}

public class both {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");

	WebDriver x=new ChromeDriver();
	x.get("https://demoapps.qspiders.com/ui?scenario=4");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	WebElement w=x.findElement(By.xpath("//input[.='Enter your name']"));
	String b=w.getAttribute("placeholder");
	if(b.equalsIgnoreCase("Enter your name")) {
		System.out.println("present");
	}
	else {
		System.out.println("not present");
	}

}
}
