package test;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import gen_utilities.BASE_CLASS;
import gen_utilities.Excel_data;
import leadwave.pom.repository.Createprice_addbtn;
import leadwave.pom.repository.Homepage;
import leadwave.pom.repository.Organization_page;
import leadwave.pom.repository.Price_page;
import leadwave.pom.repository.Products_page;

public class Groupexec1 extends BASE_CLASS {
////		@Test(groups="functional")
////		public void India() {
////			System.out.println("karnataka");
////		}
////		@Test
////		public void ty() {
////			System.out.println("prakash");
////		}
////		@Test
////		public void qsp() {
////			System.out.println("pradeep");
////		}

	
	
//	@Test
//	public void abc() throws IOException, InterruptedException {
//
//		
//		web.maximizewin(driver);
//		web.waittillpageload(driver, 5);
//		
//		Homepage hom=new Homepage(driver);
//		excel.readdatafromexcel("sheet7", 1, 1);
//
//		Organization_page org= new Organization_page(driver);
//		hom.clickonorg();
//		org.clickorgbtn();
//		String ty="mnn";
//		org.sendtosearchfield(ty);
//
//		org.dropdownselect();
//
//		org.savebutton();
//		Thread.sleep(4000);
//		hom.clickadministrator();
//	}
	
	@Test
	public void def() throws EncryptedDocumentException, IOException {
	web.maximizewin(driver);
	web.waittillpageload(driver, 5);


	Homepage hom=new Homepage(driver);
	hom.clickonmore(driver, web);

	hom.clickprice();
	Price_page pa=new Price_page(driver);
	pa.clickaddtheprice();
	String str=excel.readdatafromexcel("Sheet1", 0, 1);

	Createprice_addbtn ca=new Createprice_addbtn(driver);
	ca.clickaddprice(str);
	
	hom.clickadministrator(driver);
	excel.closeexcel();
	}
	
	
	
	
	@Test
	public void hell() throws IOException, AWTException {
		
		String y=excel.readdatafromexcel("Sheet3", 1, 1);
		String y1=excel.readdatafromexcel("Sheet3", 2, 1);

		Homepage hom=new Homepage(driver);
		hom.clicktheproduct();

		 Products_page pro=new Products_page(driver);
		 pro.selectfromdropdown(y, web);
			pro.sendkeystosearchfield(y1);
			web.robotpress();
			web.robotrelease();
			hom.clickadministrator(driver);
			excel.closeexcel();
	}
}
