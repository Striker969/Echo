package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import gen_utilities.BASE_CLASS;

public class Sample1Test {
	@Test
	public void one() {
		System.out.println("bugaati");
	}
	@Test
	public void two() {
		System.out.println("maseratti");
	}
	@Test
	public void three() {
		System.out.println("lotus");
	}
//	@Test(enabled = true)
//	public void one() {
////		WebDriver web=new FirefoxDriver();
////		web.get("https://www.netflix.com/in/");
////		String act=web.getTitle();
//		String exp="Netflix";
//		String yy="Netflix";
//		Assert.assertSame(yy, exp,"i dont have it");
//		System.out.println("thogo guru");
//		Assert.fail();
//		int a=99;
//		Assert.assertNull(a);
//		System.out.println("hogappa hogu");
//	}
//	@Test(enabled = false)
//	public void soft() {
//		SoftAssert sa=new SoftAssert();
//		System.out.println("ee");
//		boolean a=true;
//		sa.assertFalse(a);
//		sa.assertAll();
//		sa.assertSame("a", "b","he dont have iiiiiiiiiiiiiiiiiiiit");
//		System.out.println("tommy");
	}






























