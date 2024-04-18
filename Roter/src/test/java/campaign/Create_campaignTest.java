package campaign;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Create_campaignTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver x=new FirefoxDriver();
		x.manage().window().maximize();
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream fis2=new FileInputStream(".\\src\\test\\resources\\Roter.xlsx");
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\roter.properties");
		Properties pro=new Properties();
		pro.load(fis);
		Workbook w= WorkbookFactory.create(fis2);
		Sheet s=w.getSheet("Sheet5");
		String browser=pro.getProperty("url");
		String UN=pro.getProperty("username");
		String PWD=pro.getProperty("password");
		x.get(browser);
		x.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
		x.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);
		x.findElement(By.xpath("//input[@type='submit']")).click();
		Actions act=new Actions(x);
	    WebElement web= x.findElement(By.xpath("//a[.='More']"));
		act.moveToElement(web).perform();
		x.findElement(By.xpath("//a[.='Campaigns' and @name='Campaigns']")).click();
		System.out.println(x.getTitle());
		x.findElement(By.xpath("//td[.='CAM25 ']/preceding-sibling::td/input")).click();
	    x.findElement(By.xpath("(//input[@type='button' and @value='Delete'])[1]")).click();
	    Alert al=x.switchTo().alert();
		al.accept();
		x.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    Alert all=x.switchTo().alert();
		all.accept();
		String y1=s.getRow(1).getCell(1).getStringCellValue();
		x.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(y1);
		x.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		Set<String> win=x.getWindowHandles();
		for(String u:win) {
			x.switchTo().window(u);
		}
		x.findElement(By.xpath("//a[.='pavillion360TY01']")).click();
		Thread.sleep(2000);
		for(String u:win) {
			x.switchTo().window(u);
			if(x.getTitle().equals("Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM")) {
				break;
			}
		}
		Thread.sleep(2000);
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		x.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		x.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']")).click();
		x.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		x.findElement(By.xpath("//a[.='Sign Out']")).click();	
	}
}
