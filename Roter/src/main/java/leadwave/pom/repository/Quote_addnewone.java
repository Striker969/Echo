package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gen_utilities.Webdriver_utility;

public class Quote_addnewone {
	@FindBy (xpath="//input[@name='subject']")
	private WebElement selectsub;
	@FindBy (xpath="//select[@name='quotestage']")
	private WebElement quotestagedropdown;
	@FindBy(xpath="//input[@name='account_id']/following-sibling::img[@src='themes/softed/images/select.gif']")
	private WebElement addorg;
	
	public Quote_addnewone(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	public void clicksub(String str) {
		selectsub.sendKeys(str);
	}
	public void selectfromdrop(String ty,Webdriver_utility web) {
		web.forvisibletext(quotestagedropdown, ty);
	}
	public void addtheorg() {
		addorg.click();
	}
	
}
