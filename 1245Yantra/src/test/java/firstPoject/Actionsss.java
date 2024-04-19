package firstPoject;

import java.awt.Desktop.Action;
import java.awt.Point;
import java.time.Duration;
import java.util.List;

import javax.tools.DocumentationTool.Location;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


//public class Actionsss {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//div[.='Mobile Charger']"));
//		WebElement t= x.findElement(By.xpath("//div[.='Mobile Accessories']"));
//		Actions tp=new Actions(x);
//		tp.dragAndDrop(y,t).perform();
//	}
//}
//
//
//public class Actionsss {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//div[.='Mobile Charger']"));
//		WebElement t= x.findElement(By.xpath("//div[.='Mobile Accessories']"));
//		Actions tp=new Actions(x);
//		tp.dragAndDrop(y,t).perform();
//		WebElement t1= x.findElement(By.xpath("//div[.='Mobile Cover']"));
//		WebElement y1= x.findElement(By.xpath("//div[.='Mobile Accessories']"));
//		tp.dragAndDrop(t1,y1).perform();
//		WebElement t11= x.findElement(By.xpath("//div[.='Laptop Charger']"));
//		WebElement y11= x.findElement(By.xpath("//div[.='Laptop Accessories']"));
//		tp.dragAndDrop(t11,y11).perform();
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement t12= x.findElement(By.xpath("//div[.='Laptop Cover']"));
//		WebElement y12= x.findElement(By.xpath("//div[.='Mobile Accessories']"));
//		tp.dragAndDrop(t12,y12).perform();
//	}
//}


//public class Actionsss {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//div[.='Mobile Charger']"));
//		y.click();
//		WebElement t= x.findElement(By.xpath("//div[.='Laptop Cover']"));
//		t.click();
//		Actions tp=new Actions(x);
//		tp.dragAndDrop(y,t).perform();
//	}
//}



//public class Actionsss {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement i=x.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
//		Actions tp=new Actions(x);
//		tp.moveToElement(i).perform();
//		List<WebElement> ty=x.findElements(By.xpath("//div[@class='w-[30vw] absolute left-80 bg-white rounded-2xl shadow-md']//li"));
//		for(WebElement u:ty) {
//			System.out.println(u.getText());
//		}
//		
//	}
//}


//public class Actionsss {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//div[@id='circle']"));
//		Actions tp=new Actions(x);
//		tp.clickAndHold(y).pause(3000).perform();
//		tp.release().perform();
//	}
//}


//public class Actionsss {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui?scenario=1");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//input[@id='name']"));
//		Actions tp=new Actions(x);
//		tp.sendKeys(y,"hello").perform();
//	}
//}

//public class Actionsss {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.thesouledstore.com");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//div[@class='dinline']"));
//		
////		org.openqa.selenium.Point loc=y.getLocation();
////		int x1=loc.getX();
////		int y1 = loc.getY();
//		Actions tp=new Actions(x);
////		tp.scrollByAmount(x1, y1).perform();
//		tp.scrollToElement(y).perform();
//	}
//}





//public class Actionsss {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//iframe[@class='w-full h-96']"));
//		x.switchTo().frame(y);
//		x.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
//	}
//}

//public class Actionsss {
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//iframe[@class='w-full h-96']"));
//		x.switchTo().frame(y);
//		x.switchTo().frame(0);
//		x.findElement(By.xpath("//input[@id='email']")).sendKeys("@gmail.com");
//	}
//}


//public class Actionsss {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	WebElement y= x.findElement(By.xpath("//iframe[@class='w-full h-96']"));
//	x.switchTo().frame(y);
//	WebElement u=x.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
//	x.switchTo().frame(u);
//	x.findElement(By.xpath("//input[@id='email']")).sendKeys("@gmail.com");
//}
//}



//public class Actionsss {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	WebElement y= x.findElement(By.xpath("//iframe[@class='w-full h-96']"));
//	x.switchTo().frame(y);
//	WebElement u=x.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
//	x.switchTo().frame(u);
//	x.findElement(By.xpath("//input[@id='email']")).sendKeys("@gmail.com");
//}
//}



//public class Actionsss {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
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


//public class Actionsss {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	WebElement y= x.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
//	x.switchTo().frame(y);
//	x.findElement(By.xpath("//input[@id='email']")).sendKeys("roopak@gmail.com");
//	x.switchTo().defaultContent();
//	WebElement y1= x.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
//	x.switchTo().frame(y1);
//	x.findElement(By.xpath("//input[@id='username']")).sendKeys("roopak");
//}
//}

//
//public class Actionsss {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	WebElement y= x.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
//	x.switchTo().frame(y);
//	x.findElement(By.xpath("//input[@id='email']")).sendKeys("roopak@gmail.com");
//	x.switchTo().defaultContent();
//	WebElement y1= x.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
//	x.switchTo().frame(y1);
//	x.findElement(By.xpath("//input[@id='username']")).sendKeys("roopak");
//}
//}




//public class Actionsss {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demo.automationtesting.in/Frames.html");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	WebElement w=x.findElement(By.xpath("//iframe[@id='singleframe']"));
//	x.switchTo().frame(w);
//	x.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
//}
//}



//public class Actionsss {
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



//public class Actionsss {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//div[.='Laptop Charger']"));
//		WebElement y1= x.findElement(By.xpath("//div[.='Mobile Cover']"));
//		WebElement d= x.findElement(By.xpath("//div[.='Mobile Accessories']"));
//		Actions a=new Actions(x);
//		a.dragAndDrop(y, d).keyDown(Keys.CONTROL).click(y1).keyUp(Keys.CONTROL).release().perform();
//	}
//}



//public class Actionsss {
//
//	public static void main(String[] args) {
//		WebDriver x=new ChromeDriver();
//		x.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		WebElement y= x.findElement(By.xpath("//div[.='Laptop Charger']"));
//		WebElement y1= x.findElement(By.xpath("//div[.='Mobile Cover']"));
//		WebElement d= x.findElement(By.xpath("//div[.='Mobile Accessories']"));
//		Actions a=new Actions(x);
//		a.dragAndDrop(y, d).keyDown(Keys.CONTROL).click(y1).keyUp(Keys.CONTROL).release().perform();
//		Select s=new Select(y);
//		Actions b=new Actions(x);
//		
//	}
//}


//public class Actionsss {
//public static void main(String[] args) {
//	WebDriver x=new FirefoxDriver();
//	x.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	WebElement i = x.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
//	Select s=new Select(i);
//	List<WebElement> w=s.getOptions();
//	for(WebElement a:w) {
//		System.out.println(a.getText());
//	}
//  }
//}

















