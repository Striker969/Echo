package product3;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;
import leadwave.pom.repository.Homepage;
import leadwave.pom.repository.LoginPage;
import leadwave.pom.repository.Products_page;

public class Search_productpomTest {
	public static void main(String[] args) throws IOException, AWTException {
		DB_data da=new DB_data();
		Excel_data ex=new Excel_data();
		Javautility ja=new Javautility();
		Property_data pros=new Property_data();
		Javautility uti=new Javautility();
		Webdriver_utility wu=new Webdriver_utility();
		WebDriver driver =new FirefoxDriver();
		
		wu.waittillpageload(driver, 5);
		
		
		String s = pros.readdatafrompropfile("url");
		String s2=pros.readdatafrompropfile("username");
		String s3=pros.readdatafrompropfile("password");
		String y=ex.readdatafromexcel("Sheet3", 1, 1);
		String y1=ex.readdatafromexcel("Sheet3", 2, 1);
		

		driver.get(s);

		LoginPage log=new LoginPage(driver);
		log.logintoApp(s2, s3);
		
		
		Homepage hom=new Homepage(driver);
		hom.clicktheproduct();

		 Products_page pro=new Products_page(driver);
		 pro.selectfromdropdown(y, wu);
			pro.sendkeystosearchfield(y1);
			wu.robotpress();
			wu.robotrelease();
			hom.clickadministrator(driver);
//			hom.clicksignouts();

			ex.closeexcel();
	}
}
