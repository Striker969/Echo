package campaign3_pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;
import leadwave.pom.repository.Campaigns_Link;
import leadwave.pom.repository.Campaigns_page;
import leadwave.pom.repository.Createnew_campaign;
import leadwave.pom.repository.Homepage;
import leadwave.pom.repository.LoginPage;
import leadwave.pom.repository.Products_popup_window;

public class Create_campaignTest3 {
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
		LoginPage page=new LoginPage(driver);
		page.logintoApp(UN, PWD);
		Homepage ho=new Homepage(driver);
		ho.clickonmore(driver, wu);
		
		Campaigns_Link cam=new Campaigns_Link(driver);
		cam.clickoncamp();
		System.out.println(driver.getTitle());
		Campaigns_page pa=new Campaigns_page(driver);
		pa.checkcamp();
		pa.deletecamp();

	    wu.acceptalert(driver);
		pa.createcamp();
		wu.waittillpageload(driver, 5);

		wu.acceptalert(driver);
		
		
		String y1=ex.readdatafromexcel("Sheet5", 1, 1);
		Createnew_campaign cc=new Createnew_campaign(driver);
		cc.tocreatenewcamp(y1);

		wu.switchtowindow(driver, "Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM");
		Thread.sleep(2000);
		wu.waittillpageload(driver, 5);
		Products_popup_window window=new Products_popup_window(driver);
		window.productwindow();
		
		ho.clickhomelink();
		ho.clickadministrator(driver);
//		ho.clicksignouts();
	}
}
