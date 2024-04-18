package product_testng;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import gen_utilities.BASE_CLASS;
import gen_utilities.Excel_data;
import leadwave.pom.repository.Homepage;
import leadwave.pom.repository.Products_page;
//import test.BASE_CLASS;

public class Search_prod_ng extends BASE_CLASS {
	@Test
	public void hell() throws IOException, AWTException {
		
		
		
		
//		String s = prop.readdatafrompropfile("url");
//		String s2=prop.readdatafrompropfile("username");
//		String s3=prop.readdatafrompropfile("password");
		String y=excel.readdatafromexcel("Sheet3", 1, 1);
		String y1=excel.readdatafromexcel("Sheet3", 2, 1);
		

//		driver.get(s);

//		LoginPage log=new LoginPage(driver);
//		log.logintoApp(s2, s3);
		
		
		Homepage hom=new Homepage(driver);
		hom.clicktheproduct();

		 Products_page pro=new Products_page(driver);
		 pro.selectfromdropdown(y, web);
			pro.sendkeystosearchfield(y1);
			web.robotpress();
			web.robotrelease();
			hom.clickadministrator(driver);
//			hom.clicksignouts();
			

			excel.closeexcel();
	}
}
