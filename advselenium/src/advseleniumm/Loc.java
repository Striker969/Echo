package advseleniumm;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Dimension;
//public class Loc {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.netflix.com");
//		WebElement y=x.findElement(By.xpath("//option[.='हिन्दी']"));
//		String z=y.getAttribute("lang");
//		System.out.println(z);
//	}
//
//}


//public class Loc {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.netflix.com");
//		WebElement y=x.findElement(By.xpath("//option[@label='English']"));
//		String z=y.getText();
//		System.out.println(z);
//	}
//
//}


//public class Loc {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.netflix.com");
//		WebElement y=x.findElement(By.name("email"));
////		String z=y.getText();
////		System.out.println(z);
//		Point a=y.getLocation();
//		System.out.println(a);
//		System.out.println(a.getX());
//		System.out.println(a.getY());
//
//	}
//
//}


//public class Loc {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.netflix.com");
//		WebElement y=x.findElement(By.name("email"));
//		String t=y.getCssValue("min-height");
//		System.out.println(t);
//	}
//
//}

//public class Loc {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.netflix.com");
//		WebElement y=x.findElement(By.name("email"));
//		int a=y.getSize().getHeight();
//		System.out.println(a);
//	}
//
//}

//public class Loc {
//public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//	WebDriver x=new ChromeDriver();
//	x.manage().window().maximize();
//	x.navigate().to("https://www.netflix.com");
//	x.navigate().to("https://www.hotstar.com");
//	x.navigate().back();
//	x.navigate().forward();
//	x.navigate().refresh();
//
//}
//
//}

public class Loc {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
	WebDriver x=new ChromeDriver();
	x.manage().window().maximize();
	x.navigate().to("https://www.netflix.com");
	Dimension h=new Dimension(100,100);
	x.manage().window().setSize(h);

}

}

//public class Loc {
//public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//	WebDriver x=new ChromeDriver();
//	x.manage().window().maximize();
//	x.navigate().to("https://www.netflix.com");
//	Point h=new Point(900,100);
//	x.manage().window().setPosition(h);
//}
//
//}






