package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import leadwave.pom.repository.LoginPage;

public class New_test {
	@Test(dataProviderClass  = Testing.class, dataProvider="login",invocationCount = 1)
	public void logthedata(String z, String y) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://rmgtestingserver:8888/");
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(20)));
		LoginPage lo=new LoginPage(driver);
		lo.logintoApp(z, y);
	}
	
	@Test(dataProvider = "takethedata" ,dataProviderClass = Testing.class,invocationCount = 0)
	public void carss(String a,String b,String c) {
		System.out.println(a+"----"+b+"----"+c);
	}
//	
//	@Test
//	public void wom() {
//		System.out.println("trump");
//	}
//	@Test
//	public void man() {
//		System.out.println("biden");
//	}
//	@BeforeSuite
//	public void car()
//	{
//		System.out.println("this is Db");
//	}
//	@AfterSuite
//	public void bike() {
//		System.out.println("db is closed");
//	}
//	@BeforeSuite
//	public void han() {
//		System.out.println("new db");
//	}
//	@BeforeClass()
//	public void bob() {
//		System.out.println("open browser");
//	}
//	@AfterClass()
//	public void nall(){
//		System.out.println("browser closed");
//	}
//	@BeforeMethod()
//	public void nala() {
//		System.out.println("login");
//	}
//	@AfterMethod()
//	public void nalu() {
//		System.out.println("logout");
//	}
}


























	



