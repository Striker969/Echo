package create_quote2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
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
import org.openqa.selenium.support.ui.Select;

import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;

public class quoteTest2 {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		DB_data da=new DB_data();
		Excel_data ex=new Excel_data();
		Javautility ja=new Javautility();
		Property_data pros=new Property_data();
		Javautility uti=new Javautility();
		Webdriver_utility wu=new Webdriver_utility();
		
		WebDriver driver =new FirefoxDriver();
		
		
		
//		WebDriver x=new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wu.waittillpageload(driver, 5);
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\roter.properties");
		FileInputStream fis2=new FileInputStream(".\\src\\test\\resources\\Roter.xlsx");
//		Properties pro=new Properties();
//		pro.load(fis);
		String s = pros.readdatafrompropfile("url");
		String s2=pros.readdatafrompropfile("username");
		String s3=pros.readdatafrompropfile("password");
		driver.get(s);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(s2);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(s3);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
//		Actions act=new Actions(driver);
	    WebElement web= driver.findElement(By.xpath("//a[.='More']"));
//		act.moveToElement(web).perform();
		wu.tomousehover(driver, web);
		driver.findElement(By.xpath("//a[.='Quotes' and @id='more']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		Workbook w=WorkbookFactory.create(fis2);
//		Sheet ss=w.getSheet("Sheet2");
//		int rowc=ss.getLastRowNum();
//		HashMap<String, String> hm=new HashMap<String, String>();
//		for(int i=0;i<=rowc;i++) {
//			
//		}
//		String str=ss.getRow(0).getCell(1).getStringCellValue();
		String str=ex.readdatafromexcel("Sheet2", 0, 1);
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(str);
//		String str2=ss.getRow(2).getCell(1).getStringCellValue();
		String str2=ex.readdatafromexcel("Sheet2", 2, 1);

	    WebElement web2= driver.findElement(By.xpath("//select[@name='quotestage']"));
//		Select sel=new Select(web2);
//		sel.selectByVisibleText(str2);
		wu.forvisibletext(web2, str2);
		driver.findElement(By.xpath("//input[@name='account_id']/following-sibling::img[@src='themes/softed/images/select.gif']")).click();
//		String vv=x.getTitle();
//		System.out.println(vv);
		Set<String> win=driver.getWindowHandles();
		for(String u:win) {
			driver.switchTo().window(u);
		}
//		String ty=ss.getRow(3).getCell(1).getStringCellValue();
		String ty=ex.readdatafromexcel("Sheet2", 3, 1);
		driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(ty);
//		Robot ro=new Robot();
//		ro.keyPress(KeyEvent.VK_ENTER);
		wu.robotpress();
		wu.robotrelease();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[.='"+ty+"']")).click();
//		Alert al=driver.switchTo().alert();
//		al.accept();
		wu.acceptalert(driver);
		Thread.sleep(2000);
		
		
//		for(String u:win) {
//			driver.switchTo().window(u);
//			if(driver.getTitle().equals("Administrator - Quotes - vtiger CRM 5 - Commercial Open Source CRM")) {
//				break;
//			}
//		}
		wu.switchtowindow(driver, "Administrator - Quotes - vtiger CRM 5 - Commercial Open Source CRM");
		Thread.sleep(2000);

////		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//td[@class='tabUnSelected']//a[.='Products']")).click();
	    WebElement web3= driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']"));
//		Select se=new Select(web3);
//		String y=ss.getRow(4).getCell(0).getStringCellValue();
		String y=ex.readdatafromexcel("Sheet2", 4, 0);
		wu.forvisibletext(web3, y);
//		se.selectByVisibleText(y);
//		String y1=ss.getRow(4).getCell(1).getStringCellValue();
		String y1=ex.readdatafromexcel("Sheet2", 4, 1);
		driver.findElement(By.xpath("//input[@type='text' and @class='txtBox']")).sendKeys(y1);
		wu.robotpress();
		wu.robotrelease();
		driver.findElement(By.xpath("//a[.='product123' and @title='Products']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@id='mouseArea_Qty/Unit']")).click();
		driver.findElement(By.xpath("//a[.='Edit']")).click();
//		String jj=ss.getRow(5).getCell(1).getStringCellValue();
		String jj=ex.readdatafromexcel("Sheet2", 5, 1);
		driver.findElement(By.xpath("//input[@id='txtbox_Qty/Unit']")).sendKeys(jj);
		driver.findElement(By.xpath("//input[@name='button_Qty/Unit']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}
}
