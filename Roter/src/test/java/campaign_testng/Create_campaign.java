package campaign_testng;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import gen_utilities.BASE_CLASS;
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
//import test.BASE_CLASS;

public class Create_campaign extends BASE_CLASS {
	@Test()
	public void testingng() throws EncryptedDocumentException, IOException, InterruptedException {

	    web.maximizewin(driver);
		web.waittillpageload(driver, 5);
//		SoftAssert sa=new SoftAssert();
//		sa.assertEquals(driver.getTitle(), "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM","validation success");
		Homepage hp=new Homepage(driver);
		hp.clickonmore(driver, web);	
		Campaigns_Link cam=new Campaigns_Link(driver);
		cam.clickoncamp();
		System.out.println(driver.getTitle());
		Campaigns_page pa=new Campaigns_page(driver);
		pa.checkcamp();
		pa.deletecamp();
	    web.acceptalert(driver);
		pa.createcamp();
		web.waittillpageload(driver, 5);
		web.acceptalert(driver);
		String y1=excel.readdatafromexcel("Sheet5", 1, 1);
		Createnew_campaign cc=new Createnew_campaign(driver);
		cc.tocreatenewcamp(y1);
		web.switchtowindow(driver, "Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM");
		Thread.sleep(2000);
		web.waittillpageload(driver, 5);
		Products_popup_window window=new Products_popup_window(driver);
		window.productwindow();
		hp.clickhomelink();
		hp.clickadministrator(driver);
	}
}
