package test;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import gen_utilities.BASE_CLASS;
import gen_utilities.Excel_data;
import leadwave.pom.repository.Campaigns_Link;
import leadwave.pom.repository.Campaigns_page;
import leadwave.pom.repository.Createnew_campaign;
import leadwave.pom.repository.Createprice_addbtn;
import leadwave.pom.repository.Homepage;
import leadwave.pom.repository.Orgwin_pop;
import leadwave.pom.repository.Price_page;
import leadwave.pom.repository.Products_page;
import leadwave.pom.repository.Products_popup_window;
import leadwave.pom.repository.Quote_addnewone;
import leadwave.pom.repository.Quote_page;

public class Groupexec2 extends BASE_CLASS{
//		@Test(groups="compatibility")
//		public void one() {
//			System.out.println("bugaati");
//		}
//		@Test
//		public void two() {
//			System.out.println("maseratti");
//		}
//		@Test(groups="integration")
//		public void three() {
//			System.out.println("lotus");
////		}
	@Test(groups = "regression")
	public void tom() throws IOException, AWTException, InterruptedException {
		web.waittillpageload(driver, 5);
		Homepage hom=new Homepage(driver);
		hom.clickonmore(driver, web);
		hom.clickthequote();
		Quote_page quo=new Quote_page(driver);
		Quote_addnewone add=new Quote_addnewone(driver);
		quo.clickaddnewquote();
		String st=excel.readdatafromexcel("Sheet2", 0, 1);
		add.clicksub(st);
		String str2=excel.readdatafromexcel("Sheet2", 2, 1);
		add.selectfromdrop(str2, web);
		add.addtheorg();	
		Set<String> win=driver.getWindowHandles();
		for(String u:win) {
			driver.switchTo().window(u);
		}
		Orgwin_pop opo=new Orgwin_pop(driver);
		String ty=excel.readdatafromexcel("Sheet2", 3, 1);
		opo.selectorgs(ty);
		web.robotpress();
		web.robotrelease();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[.='"+ty+"']")).click();
		web.acceptalert(driver);
		Thread.sleep(2000);
		web.switchtowindow(driver, "Administrator - Quotes - vtiger CRM 5 - Commercial Open Source CRM");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		hom.clicktheproduct();
		Products_page pg=new Products_page(driver);
		String y=excel.readdatafromexcel("Sheet2", 4, 0);
		pg.selectprodno(web, y);
		String y1=excel.readdatafromexcel("Sheet2", 4, 1);
		pg.sendkeystosearchfield(y1);
		web.robotpress();
		web.robotrelease();		
		Thread.sleep(2000);
		pg.clicktheprod();
		String jj=excel.readdatafromexcel("Sheet2", 5, 1);
		pg.clicktheedit(jj);
		hom.clickadministrator(driver);
		
	}
	
//	@Test
//	public void z() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {
//
//	    web.maximizewin(driver);
//		web.waittillpageload(driver, 5);
//		Homepage hp=new Homepage(driver);
//		hp.clickonmore(driver, web);	
//		Campaigns_Link cam=new Campaigns_Link(driver);
//		cam.clickoncamp();
//		System.out.println(driver.getTitle());
//		Campaigns_page pa=new Campaigns_page(driver);
//		pa.checkcamp();
//		pa.deletecamp();
//	    web.acceptalert(driver);
//		pa.createcamp();
//		web.waittillpageload(driver, 5);
//		web.acceptalert(driver);
//		String y1=excel.readdatafromexcel("Sheet5", 1, 1);
//		Createnew_campaign cc=new Createnew_campaign(driver);
//		cc.tocreatenewcamp(y1);
//		web.switchtowindow(driver, "Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM");
//		Thread.sleep(2000);
//		web.waittillpageload(driver, 5);
//		Products_popup_window window=new Products_popup_window(driver);
//		window.productwindow();
//		hp.clickhomelink();
//		hp.clickadministrator(driver);	
//	}
}

