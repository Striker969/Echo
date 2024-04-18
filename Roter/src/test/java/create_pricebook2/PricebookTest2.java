package create_pricebook2;

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

import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;
import leadwave.pom.repository.Createprice_addbtn;
import leadwave.pom.repository.Homepage;
import leadwave.pom.repository.LoginPage;
import leadwave.pom.repository.Price_page;

public class PricebookTest2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DB_data da=new DB_data();
		Excel_data ex=new Excel_data();
		Javautility ja=new Javautility();
		Property_data pros=new Property_data();
		Javautility uti=new Javautility();
		Webdriver_utility wu=new Webdriver_utility();
		WebDriver driver =new FirefoxDriver();
		
		wu.maximizewin(driver);
		wu.waittillpageload(driver, 5);

		LoginPage lo=new LoginPage(driver);
		String browser=pros.readdatafrompropfile("url");
		driver.get(browser);
		String UN=pros.readdatafrompropfile("username");
		String PWD=pros.readdatafrompropfile("password");
		lo.logintoApp(UN, PWD);



		Homepage hom=new Homepage(driver);
		hom.clickonmore(driver, wu);

		hom.clickprice();
		Price_page pa=new Price_page(driver);
		pa.clickaddtheprice();
		String str=ex.readdatafromexcel("Sheet1", 0, 1);

		Createprice_addbtn ca=new Createprice_addbtn(driver);
		ca.clickaddprice(str);
		
		hom.clickadministrator(driver);
//		hom.clicksignouts();

	}
}
