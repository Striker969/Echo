package firstPoject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class Script1 {
//	public static void main(String[] args) throws IOException {
//		WebDriver x=new ChromeDriver();
//		x.get("https:www.hotstar.com");
//		x.findElement(By.xpath("//a[@class='outline-none']")).click();
//		TakesScreenshot y=(TakesScreenshot)x;
//		File c=y.getScreenshotAs(OutputType.FILE);
//		File d=new File("C:\\Users\\CSC\\Desktop\\html\\a2n\\decet.jpeg");
//		org.openqa.selenium.io.FileHandler.copy(c, d);
//	}
//}

public class Script1 {
	public static void main(String[] args) throws IOException {
		WebDriver x=new ChromeDriver();
		x.get("https://demoapps.qspiders.com/ui?scenario=1");
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		x.findElement(By.xpath("//button[.='Register']")).click();
	}
}
