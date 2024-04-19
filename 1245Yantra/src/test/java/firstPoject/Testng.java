package firstPoject;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng {
//	@Test(invocationCount=0)
//	public void one()
//	{
//		System.out.println("cars");
//	}
//	@Test(dependsOnMethods="one")
//	public void two()
//	{
//		System.out.println("thi");
//	}
//	@Test(invocationCount=0)
//	public void three()
//	{
//		System.out.println("boiiis");
//		Reporter.log("hello",true);
//		
//	}
	@Test(dataProvider = "data")
	public void getdata(String str, String two,String three) {
		System.out.println(str+"----->"+two+"<-----"+three);
	}
	
	@DataProvider()
	public Object[][] data(){
		Object[][] one=new Object[3][3];
		
		one[0][0] ="possible";
		one[1][1]="not possible";
		one[2][2]="ondhu";
		
		return one;
	}
}





























