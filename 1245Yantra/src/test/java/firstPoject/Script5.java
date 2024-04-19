package firstPoject;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script5 {
	public static void main(String[] args) throws InterruptedException {
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
