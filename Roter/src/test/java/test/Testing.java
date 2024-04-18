package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import gen_utilities.Sites_and_data;

public class Testing {
	@DataProvider()
	public Object[][] login() {
		Object[][] c=new Object[2][2];
		c[0][0]="admin";
		c[0][1]="password";
		
		c[1][0]="admin";
		c[1][1]="admin";
		return c;
	}
}


//public class Testing {
//	@DataProvider(name="takethedata")
//	public Object[][] login() throws EncryptedDocumentException, IOException {
//		FileInputStream fis=new FileInputStream(Sites_and_data.pathtotestngexcel);
//		Workbook w=WorkbookFactory.create(fis);
//	    Sheet sh=w.getSheet("Sheet1");
////	    int rowcount= sh.getPhysicalNumberOfRows();
////	    int cellcount=sh.getRow(0).getPhysicalNumberOfCells();
//	    
//	    //OR
//	    
//	    int rowcount= sh.getLastRowNum()+1;
//	    int cellcount=sh.getRow(0).getLastCellNum();
//	    sh.getRow(0).getLastCellNum();
//	    Object[][] obj=new Object[rowcount][cellcount];
//	    for(int i=0;i<rowcount;i++) {
//	    	for(int j=0;j<cellcount;j++) {
//	    		obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
//	    	}
//	    }
//		return obj;
//	}
//}
















