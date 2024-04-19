package advseleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class verify {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.instagram.com");
//		Thread.sleep(1000);
//		String a = x.getTitle();
//		System.out.println(a);
//		String b="Instagram";
//		if(a.equals(b)) {
//			System.out.println("title is matching");
//		}
//		else {
//			System.out.println("title is not matching");
//		}
//	}
//}



//public class verify {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
//		WebDriver x=new ChromeDriver();
//		x.get("https://www.instagram.com");
//		Thread.sleep(2000);
//		String a = x.getCurrentUrl();
//		String b="https://www.twinstabook.com";
//		if(a.equals(b)) {
//			System.out.println("url is matching");
//		}
//		else {
//			System.out.println("url is not matching");
//		}
//	}
//}


public class verify {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./eveningselenium/chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.get("https://www.Instagram.com");
		Thread.sleep(1000);
		String a = x.getTitle();
		System.out.println(a);
		String b="Instagram";
		if(b==a) {
			System.out.println("title is matching");
		}
		else {
			System.out.println("title is not matching");
		}
	}
}