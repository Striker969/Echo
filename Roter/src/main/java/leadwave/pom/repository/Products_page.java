package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gen_utilities.Webdriver_utility;

public class Products_page {
	@FindBy (xpath="//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']")
	private WebElement indropdown;
	@FindBy (xpath="//input[@type='text' and @class='txtBox']")
	private WebElement searchandpass;
	@FindBy (xpath="//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']")
	private WebElement selectfromprodno;
	@FindBy(xpath="//a[.='product123' and @title='Products']")
	private WebElement clicktheproduct;
	@FindBy(xpath="//td[@id='mouseArea_Qty/Unit']")
	private WebElement clickonedit;
	@FindBy (xpath="//a[.='Edit']")
	private WebElement clicktheeditbtn;
	@FindBy (xpath="//input[@id='txtbox_Qty/Unit']")
	private WebElement sendqty;
	@FindBy(xpath="//input[@name='button_Qty/Unit']")
	private WebElement clickqtysave;
	
	public Products_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void selectfromdropdown(String str,Webdriver_utility util) {
		util.forvisibletext(indropdown, str);
	}
	public void sendkeystosearchfield(String ty) {
		searchandpass.sendKeys(ty);
	}
	public void selectprodno(Webdriver_utility ut,String ji) {
		ut.forvisibletext(selectfromprodno, ji);
	}
	public void clicktheprod() {
		clicktheproduct.click();
	}
	public void clicktheedit(String gg) {
		clickonedit.click();
		clicktheeditbtn.click();
		sendqty.sendKeys(gg);
		clickqtysave.click();
	}
}
