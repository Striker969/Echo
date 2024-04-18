package organization2;

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
import org.openqa.selenium.support.ui.Select;

import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;

public class Create_org_with_ind_typeTest2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		DB_data da=new DB_data();
		Excel_data ex=new Excel_data();
		Javautility ja=new Javautility();
		Property_data pros=new Property_data();
		Javautility uti=new Javautility();
		Webdriver_utility wu=new Webdriver_utility();
		WebDriver driver =new FirefoxDriver();
		
//		driver.manage().window().maximize();
		wu.maximizewin(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wu.waittillpageload(driver, 5);
		
//		FileInputStream fis2=new FileInputStream(".\\src\\test\\resources\\Roter.xlsx");
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\roter.properties");
//		Properties pro=new Properties();
//		pro.load(fis);
//		Workbook w= WorkbookFactory.create(fis2);
//		Sheet s=w.getSheet("Sheet7");
		String browser=pros.readdatafrompropfile("url");
		String UN=pros.readdatafrompropfile("username");
		String PWD=pros.readdatafrompropfile("password");
		
//		String browser=pro.getProperty("url");
//		String UN=pro.getProperty("username");
//		String PWD=pro.getProperty("password");
		ex.readdatafromexcel("sheet7", 1, 1);
		driver.get(browser);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//td[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		String kk=s.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("three");
		WebElement wel=   driver.findElement(By.xpath("//select[@name='industry']"));
		wel.click();
//		Select sel=new Select(wel);
		wu.forIndex(5, wel);
//		String hh=s.getRow(1).getCell(1).getStringCellValue();
//		sel.selectByIndex(5);
		driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}
}
