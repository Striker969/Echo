package firstPoject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//public class Practice {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui?scenario=1");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
////	x.findElement(By.cssSelector("#name")).sendKeys("hello");
//	x.findElement(By.xpath("//label[.='Name']/following-sibling::input")).sendKeys("thogo");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	x.findElement(By.xpath("//label[.='Email Id']/following-sibling::input")).sendKeys("baro");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	x.findElement(By.xpath("//section[@class='relative']/input[@id='password']")).sendKeys("mailid");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	x.findElement(By.xpath("//button[.='Register']")).click();
//}
//}





//public class Practice {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=17633307033926395563&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062072&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	x.findElement(By.xpath("//a[contains(.,'Amaz')]")).click();
//
//}
//}



//public class Practice {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui?scenario=4");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//	WebElement w=x.findElement(By.xpath("//input[.='Enter your name']"));
//	String b=w.getAttribute("placeholder");
//	if(b.equalsIgnoreCase("Enter your name")) {
//		System.out.println("present");
//	}
//	else {
//		System.out.println("not present");
//	}
//	System.out.println("jkj");
//
//}
//}






public class Practice {
public static void main(String[] args) {
	WebDriver x=new ChromeDriver();
	x.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	WebElement w= x.findElement(By.xpath("//select[@id='select3']"));
	Select s=new Select(w);
	ArrayList<String> t= new ArrayList<String>();
	List<WebElement> p= s.getOptions();
	for(WebElement b:p) {
		System.out.println(b.getText());
	}
}
}



//public class Practice {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	WebElement w= x.findElement(By.xpath("//select[@id='select3']"));
//	Select s=new Select(w);
//	ArrayList<String> t= new ArrayList<String>();
//	List<WebElement> p= s.getOptions();
//	for(WebElement b:p) {
//		String g=b.getText();
//		t.add(g);
//	}
//	Collections.sort(t);
//	for(String j:t) {
//		System.out.println(j);
//	}
//}
//}


//public class Practice {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	WebElement w= x.findElement(By.xpath("//select[@id='select3']"));
//	Select s=new Select(w);
//	TreeSet<String> t= new TreeSet<String>();
//	List<WebElement> p= s.getOptions();
//	for(WebElement b:p) {
//		String g=b.getText();
//		t.add(g);
//	}
//	System.out.println(t);
//}
//}

//public class Practice {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	WebElement w= x.findElement(By.xpath("//select[@id='select3']"));
//	ArrayList<String> l=new ArrayList<String>();
//	Select s=new Select(w);
//	List<WebElement> h=s.getOptions();
//	for(WebElement k:h) {
//	String sq=k.getText();
//	l.add(sq);
//	}
//	if(l.equals("India")) {
//		System.out.println("present");
//	}
//	else {
//		System.out.println("not present");
//	}
//	
//	
//}
//}
//
//
//
//public class Practice {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	WebElement w= x.findElement(By.xpath("//select[@id='select3']"));
//	Select s=new Select(w);
//	List<WebElement> h=s.getOptions();
//	boolean flag=false;
//	for(WebElement b:h) {
//		String g=b.getText();
//		if(g.equals("Indiahghg")) {
//			flag=true;
//			break;
//		}
//	}
//	if(flag==true) {
//		System.out.println("present");
//	}
//	else {
//		System.out.println("not present");
//	}
//	}
//}


//
//public class Practice {
//public static void main(String[] args) {
//	WebDriver x=new ChromeDriver();
//	x.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
//	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//	WebElement z = x.findElement(By.xpath("//select/option[@value='1']"));
//	Select s=new Select(z);
//	s.selectByValue("1");
//  }
//}







	







