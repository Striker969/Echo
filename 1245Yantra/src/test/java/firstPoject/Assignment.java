package firstPoject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//public class Assignment {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement l = x.findElement(By.xpath("//select[@id='select3']"));
//		Select s=new Select(l);
//		s.selectByIndex(1);
//		s.selectByValue("India");
//		s.selectByVisibleText("China");
//	}
//}



//public class Assignment {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement l = x.findElement(By.xpath("//select[@id='select3']"));
//		Select s=new Select(l);
//		s.selectByIndex(1);
//		s.selectByValue("India");
//		s.selectByVisibleText("China");
//	}
//}


//public class Assignment {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement l = x.findElement(By.xpath("//a[.='Right Click']"));
//		l.click();
//		WebElement o = x.findElement(By.xpath("//button[@id='btn30']"));
//		Actions a=new Actions(x);
//		a.contextClick(o).perform();
//		}
//}

//public class Assignment {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement l = x.findElement(By.xpath("//a[.='Double Click']"));
//		l.click();
//		WebElement o = x.findElement(By.xpath("//button[@id='btn20']"));
//		Actions a=new Actions(x);
//		a.contextClick(o).perform();
//		}
//}


//public class Assignment {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.thesouledstore.com");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement l = x.findElement(By.xpath("//h5[.='MORE INFO']"));
//		Actions a=new Actions(x);
//		a.scrollToElement(l).perform();
//		}
//}


//public class Assignment {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demo.automationtesting.in/Frames.html");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	x.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();
//	WebElement w=x.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//	x.switchTo().frame(w);
//	WebElement w1=x.findElement(By.xpath("//div[@class='iframe-container']//iframe[@src='SingleFrame.html']"));
//	x.switchTo().frame(w1);
//	x.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
//}
//}



















