package create_pricebook;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PricebookTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver x=new FirefoxDriver();
		x.manage().window().maximize();
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream fis2=new FileInputStream(".\\src\\test\\resources\\Roter.xlsx");
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\roter.properties");
		Properties pro=new Properties();
		pro.load(fis);
		Workbook w= WorkbookFactory.create(fis2);
		Sheet s=w.getSheet("Sheet1");
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
		x.findElement(By.xpath("//a[.='Price Books']")).click();
		x.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		String str=s.getRow(0).getCell(1).getStringCellValue();
		x.findElement(By.xpath("//input[@name='bookname']")).sendKeys(str);
		x.findElement(By.xpath("(//input[@class='crmbutton small save'])[2]")).click();
		Actions act2=new Actions(x);
//		act2.moveToElement(web2);
		x.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		x.findElement(By.xpath("//a[.='Sign Out']")).click();
		x.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();

	}

}
