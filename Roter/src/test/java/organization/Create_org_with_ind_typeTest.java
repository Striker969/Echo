package organization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Create_org_with_ind_typeTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver x=new FirefoxDriver();
		x.manage().window().maximize();
		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream fis2=new FileInputStream(".\\src\\test\\resources\\Roter.xlsx");
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\roter.properties");
		Properties pro=new Properties();
		pro.load(fis);
		Workbook w= WorkbookFactory.create(fis2);
		Sheet s=w.getSheet("Sheet7");
		String browser=pro.getProperty("url");
		String UN=pro.getProperty("username");
		String PWD=pro.getProperty("password");
		x.get(browser);
		x.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
		x.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);
		x.findElement(By.xpath("//input[@type='submit']")).click();
		x.findElement(By.xpath("//td[.='Organizations']")).click();
		x.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		String kk=s.getRow(0).getCell(1).getStringCellValue();
		x.findElement(By.xpath("//input[@name='accountname']")).sendKeys("ones");
		WebElement wel=   x.findElement(By.xpath("//select[@name='industry']"));
		wel.click();
		Select sel=new Select(wel);
		String hh=s.getRow(1).getCell(1).getStringCellValue();
		sel.selectByIndex(5);
		x.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		Thread.sleep(4000);
		x.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		x.findElement(By.xpath("//a[.='Sign Out']")).click();
//		WebElement we=  x.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		JavascriptExecutor js=(JavascriptExecutor)x;
//		js.executeScript("arguments[0].scrollIntoView(true)", we);
//		we.click();
//		x.findElement(By.xpath("//a[.='Sign Out']")).click();
	}
}
