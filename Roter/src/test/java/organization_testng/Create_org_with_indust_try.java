package organization_testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import gen_utilities.BASE_CLASS;
import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;
import leadwave.pom.repository.Homepage;
import leadwave.pom.repository.LoginPage;
import leadwave.pom.repository.Organization_page;
//import test.BASE_CLASS;

public class Create_org_with_indust_try extends  BASE_CLASS {
	@Test( )
	public void anna() throws IOException, InterruptedException {

		
		

		Homepage hom=new Homepage(driver);

		excel.readdatafromexcel("sheet7", 1, 1);

		Organization_page org= new Organization_page(driver);
		hom.clickonorg();
		
		Assert.fail();

		org.clickorgbtn();
		int j=jav.getrandomno(300);
		String ty="abc"+j;
		org.sendtosearchfield(ty);

		org.dropdownselect();

		org.savebutton();
		Thread.sleep(2000);
		hom.clickadministrator(driver);
	}
}
