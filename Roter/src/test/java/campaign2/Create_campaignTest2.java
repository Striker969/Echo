package campaign2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;

public class Create_campaignTest2 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
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
//		Sheet s=w.getSheet("Sheet5");
		String browser=pros.readdatafrompropfile("url");
		String UN=pros.readdatafrompropfile("username");
		String PWD=pros.readdatafrompropfile("password");
		driver.get(browser);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Actions act=new Actions(driver);
	    WebElement web= driver.findElement(By.xpath("//a[.='More']"));
	    wu.tomousehover(driver, web);
//		act.moveToElement(web).perform();
		driver.findElement(By.xpath("//a[.='Campaigns' and @name='Campaigns']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//td[.='CAM25 ']/preceding-sibling::td/input")).click();
	    driver.findElement(By.xpath("(//input[@type='button' and @value='Delete'])[1]")).click();
//	    Alert al=driver.switchTo().alert();
//		al.accept();
	    wu.acceptalert(driver);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    Alert all=driver.switchTo().alert();
//		all.accept();
		wu.acceptalert(driver);
		String y1=ex.readdatafromexcel("Sheet5", 1, 1);
//		String y1=s.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(y1);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
//		Set<String> win=driver.getWindowHandles();
//		for(String u:win) {
//			driver.switchTo().window(u);
//		}
//		driver.findElement(By.xpath("//a[.='pavillion360TY01']")).click();
//		Thread.sleep(2000);
//		for(String u:win) {
//			driver.switchTo().window(u);
//			if(driver.getTitle().equals("Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM")) {
//				break;
//			}
//		}
		wu.switchtowindow(driver, "Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM");
		Thread.sleep(2000);
		wu.waittillpageload(driver, 5);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();	
	}
}
