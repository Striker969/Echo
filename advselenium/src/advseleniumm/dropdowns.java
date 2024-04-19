package advseleniumm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//public class dropdowns {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("file:///C:/Users/CSC/Desktop/html/ddot.html");
//		WebElement t=x.findElement(By.name("boiis"));
//		Select s=new Select(t);
//		Thread.sleep(1000);
////		s.selectByValue("b");
////		s.deselectByValue("b");
////		s.selectByIndex(1);
////		s.deselectByIndex(1);
//		s.selectByVisibleText("Iran");
//		s.deselectByVisibleText("Iran");
//		boolean b=s.isMultiple();
//		System.out.println(b);
//	}
//
//}

//public class dropdowns {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("file:///C:/Users/CSC/Desktop/html/ddot.html");
//		WebElement t=x.findElement(By.name("boiis"));
//		Select s=new Select(t);
//		List<WebElement> z=s.getOptions();
//		Thread.sleep(1000);
//		int count=z.size();
//		for(WebElement u:z) {
//			System.out.println(u.getText());
//		}
//		s.selectByVisibleText("Iran");
//		s.selectByVisibleText("Japan");
////		boolean b=s.isMultiple();
////		System.out.println(b);
//	}
//}



//public class dropdowns {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("file:///C:/Users/CSC/Desktop/html/ddot.html");
//	 WebElement y = x.findElement(By.name("boiis"));
//		Select S=new Select(y);
//		ArrayList<String> l=new ArrayList<String>();
//		List<WebElement> op=S.getOptions();
//		for(WebElement h:op) {
//			String t=h.getText();
//			l.add(t);
//		}
//		Collections.sort(l);
//		for(String l1:l) {
//			System.out.println(l1);
//		}
//	}
//}

public class dropdowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.get("file:///C:/Users/CSC/Desktop/html/ddot.html");
	 WebElement y = x.findElement(By.name("boiis"));
		Select S=new Select(y);
		ArrayList<String> l=new ArrayList<String>();
		List<WebElement> op=S.getOptions();
		for(WebElement h:op) {
			String t=h.getText();
			l.add(t);
		}
		Collections.reverse(op);
		for(String l1:l) {
			System.out.println(l1);
		}
	}
}
