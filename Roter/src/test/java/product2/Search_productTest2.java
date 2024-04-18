package product2;

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

import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;

public class Search_productTest2 {
	public static void main(String[] args) throws IOException, AWTException {
		DB_data da=new DB_data();
		Excel_data ex=new Excel_data();
		Javautility ja=new Javautility();
		Property_data pros=new Property_data();
		Javautility uti=new Javautility();
		Webdriver_utility wu=new Webdriver_utility();
		WebDriver driver =new FirefoxDriver();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wu.waittillpageload(driver, 5);
		
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\roter.properties");
		
		String s = pros.readdatafrompropfile("url");
		String s2=pros.readdatafrompropfile("username");
		String s3=pros.readdatafrompropfile("password");
		String y=ex.readdatafromexcel("Sheet3", 1, 1);
		String y1=ex.readdatafromexcel("Sheet3", 2, 1);
		
//		FileInputStream fis2=new FileInputStream(".\\src\\test\\resources\\Roter.xlsx");
//		Properties pro=new Properties();
//		pro.load(fis);
//		String s = pro.getProperty("url");
//		String s2=pro.getProperty("username");
//		String s3=pro.getProperty("password");
		driver.get(s);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(s2);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(s3);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//td[@class='tabUnSelected']//a[.='Products']")).click();
		 WebElement web3= driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']"));
		 wu.forvisibletext(web3, y);
//			Select se=new Select(web3);
//			Workbook w=WorkbookFactory.create(fis2);
//			Sheet ss=w.getSheet("Sheet3");
//			String y=ss.getRow(1).getCell(1).getStringCellValue();
//			se.selectByVisibleText(y);
//			String y1=ss.getRow(2).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//input[@type='text' and @class='txtBox']")).sendKeys(y1);
//			Robot ro=new Robot();
			wu.robotpress();
			wu.robotrelease();
//			ro.keyPress(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			driver.findElement(By.xpath("//a[.='Sign Out']")).click();
			ex.closeexcel();
	}
}
