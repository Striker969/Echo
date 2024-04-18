package organization3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
import leadwave.pom.repository.Organization_page;

public class Create_org_with_ind_typeTestPOM {
	public static void main(String[] args) throws IOException, InterruptedException {
		DB_data da=new DB_data();
		Excel_data ex=new Excel_data();
		Javautility ja=new Javautility();
		Property_data pros=new Property_data();
		Javautility uti=new Javautility();
		Webdriver_utility wu=new Webdriver_utility();
		WebDriver driver =new FirefoxDriver();
		
		wu.maximizewin(driver);
		wu.waittillpageload(driver, 5);
		

		String browser=pros.readdatafrompropfile("url");
		String UN=pros.readdatafrompropfile("username");
		String PWD=pros.readdatafrompropfile("password");
		driver.get(browser);
		Homepage hom=new Homepage(driver);
		LoginPage lp=new LoginPage(driver);
		lp.logintoApp(UN, PWD);
		ex.readdatafromexcel("sheet7", 1, 1);

		Organization_page org= new Organization_page(driver);
		hom.clickonorg();
		org.clickorgbtn();
		org.sendtosearchfield(PWD);

		org.dropdownselect();

		org.savebutton();
		Thread.sleep(4000);
		hom.clickadministrator(driver);
//		hom.clicksignouts();

	}
}
