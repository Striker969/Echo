package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gen_utilities.Webdriver_utility;

public class Homepage extends Webdriver_utility {
	
	@FindBy(xpath="//a[.='More']")
	private WebElement clickmore;
	
	@FindBy (xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement clickhome;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement clickadmin;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signout;
	
	@FindBy(xpath="//td[@class='tabUnSelected']//a[.='Products']")
	private WebElement clickproduct;
	
	@FindBy(xpath="//td[.='Organizations']")
	private WebElement clickorg;
	
	@FindBy (xpath="//a[.='Quotes' and @id='more']")
	private WebElement clickonquote;
	
	@FindBy(xpath="//a[.='Price Books']")
	private WebElement pricebook;
	
	
	public Homepage(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}
	
	
	public void clickonmore(WebDriver driver,Webdriver_utility hov) {
		hov.tomousehover(driver, clickmore);
//		clickmore.click();
	}
	public void clickhomelink() {
		clickhome.click();
	}
	public void clickadministrator(WebDriver driver) {
		tomousehover(driver, clickadmin);
		clickadmin.click();
	}
	public void clicksignouts() {
		signout.click();
//		tomousehover(driver, signout);
		
	}
	public void clicktheproduct() 
	{
		clickproduct.click();
	}
	public void clickonorg() {
		clickorg.click();
	}
	public void clickthequote() {
		clickonquote.click();
	}
	public void clickprice() {
		pricebook.click();
	}



}











