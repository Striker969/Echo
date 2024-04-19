package advseleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//public class hover {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://www.hotstar.com");
//		WebElement y= x.findElement(By.xpath("//button[@type='button']"));
//		Actions t=new Actions(x);
//		t.moveToElement(y).perform();
//	}
//}

//public class hover {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		WebElement y= x.findElement(By.xpath("//div[@id='box2']"));
//		WebElement v = x.findElement(By.xpath("//div[@id='box102']"));
//		Actions t=new Actions(x);
//		t.dragAndDrop(y,v).perform();
//	}
//}

//public class hover {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement y= x.findElement(By.xpath("//span[.='right click me']"));
//		Actions t=new Actions(x);
//		t.contextClick(y).perform();
//	}
//}

//public class hover {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement y= x.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
//		Actions t=new Actions(x);
//		t.doubleClick(y).perform();
//	}
//}

public class hover {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
		WebDriver x=new FirefoxDriver();
		x.get("https://www.google.com");
		WebElement y= x.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions t=new Actions(x);
		t.contextClick(y).click();
	}
}

