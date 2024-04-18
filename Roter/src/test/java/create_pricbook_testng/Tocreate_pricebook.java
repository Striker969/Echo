package create_pricbook_testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import gen_utilities.BASE_CLASS;
import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;
import leadwave.pom.repository.Createprice_addbtn;
import leadwave.pom.repository.Homepage;
import leadwave.pom.repository.LoginPage;
import leadwave.pom.repository.Price_page;
//import test.BASE_CLASS;
@Listeners(gen_utilities.Itest.class)
public class Tocreate_pricebook extends BASE_CLASS {
	@Test
	public void tom() throws IOException, InterruptedException {
//		Excel_data ex=new Excel_data();

	
//		SoftAssert sa=new SoftAssert();
//		sa.assertNotEquals(driver.getTitle(), "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM","invalid");
//		LoginPage lo=new LoginPage(driver);
//		String browser=prop.readdatafrompropfile("url");
//		driver.get(browser);
//		String UN=prop.readdatafrompropfile("username");
//		String PWD=prop.readdatafrompropfile("password");
//		lo.logintoApp(UN, PWD);



		Homepage hom=new Homepage(driver);
		hom.clickonmore(driver, web);
		hom.clickprice();
		Price_page pa=new Price_page(driver);
		pa.clickaddtheprice();
		String str=excel.readdatafromexcel("Sheet1", 0, 1);

		Createprice_addbtn ca=new Createprice_addbtn(driver);
		ca.clickaddprice(str);
		Thread.sleep(2000);
//		SoftAssert sa=new SoftAssert();
//		sa.assertAll();
		Assert.fail();
		
		hom.clickadministrator(driver);
//		hom.clicksignouts();
	}
}
