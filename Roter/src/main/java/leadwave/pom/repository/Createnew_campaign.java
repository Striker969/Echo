package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnew_campaign {
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement createnew;
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement clickonprodicon;
	
	
	
	public Createnew_campaign(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void tocreatenewcamp(String data) {
		createnew.sendKeys(data);
		clickonprodicon.click();
	}
}
