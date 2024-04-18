package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createprice_addbtn {
	@FindBy(xpath="//input[@name='bookname']")
	private WebElement clickaddpricebtn;
	@FindBy(xpath="(//input[@class='crmbutton small save'])[2]")
	private WebElement clickonsave;
	
	public Createprice_addbtn(WebDriver drive) {
		PageFactory.initElements(drive,this);
	}
	
	public void clickaddprice(String hg) {
		clickaddpricebtn.sendKeys(hg);
		clickonsave.click();
	}
}
