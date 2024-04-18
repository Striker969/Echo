package create_quote3;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import gen_utilities.BASE_CLASS;
import gen_utilities.DB_data;
import gen_utilities.Excel_data;
import gen_utilities.Javautility;
import gen_utilities.Property_data;
import gen_utilities.Webdriver_utility;
import leadwave.pom.repository.Homepage;
import leadwave.pom.repository.LoginPage;
import leadwave.pom.repository.Orgwin_pop;
import leadwave.pom.repository.Products_page;
//import leadwave.pom.repository.Quote_addnew;
import leadwave.pom.repository.Quote_addnewone;
import leadwave.pom.repository.Quote_page;
//import test.BASE_CLASS;
@Listeners(gen_utilities.Itest.class)
public class QuoteTest2pom extends BASE_CLASS {
	@Test(retryAnalyzer =gen_utilities.Retry.class)
	public void trues() throws IOException, InterruptedException, AWTException {
		web.waittillpageload(driver, 5);
		Homepage hom=new Homepage(driver);
		hom.clickonmore(driver, web);
		hom.clickthequote();
		Assert.fail();
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
		Thread.sleep(2000);
	
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
}
