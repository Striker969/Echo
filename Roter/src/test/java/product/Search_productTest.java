package product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Search_productTest {
public static void main(String[] args) throws IOException, AWTException {
	WebDriver x=new FirefoxDriver();
	x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\roter.properties");
	FileInputStream fis2=new FileInputStream(".\\src\\test\\resources\\Roter.xlsx");
	Properties pro=new Properties();
	pro.load(fis);
	String s = pro.getProperty("url");
	String s2=pro.getProperty("username");
	String s3=pro.getProperty("password");
	x.get(s);
	x.findElement(By.xpath("//input[@type='text']")).sendKeys(s2);
	x.findElement(By.xpath("//input[@type='password']")).sendKeys(s3);
	x.findElement(By.xpath("//input[@type='submit']")).click();
	x.findElement(By.xpath("//td[@class='tabUnSelected']//a[.='Products']")).click();
	 WebElement web3= x.findElement(By.xpath("//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']"));
		Select se=new Select(web3);
		Workbook w=WorkbookFactory.create(fis2);
		Sheet ss=w.getSheet("Sheet3");
		String y=ss.getRow(1).getCell(1).getStringCellValue();
		se.selectByVisibleText(y);
		String y1=ss.getRow(2).getCell(1).getStringCellValue();
		x.findElement(By.xpath("//input[@type='text' and @class='txtBox']")).sendKeys(y1);
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
		x.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		x.findElement(By.xpath("//a[.='Sign Out']")).click();
}
}
