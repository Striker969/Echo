package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gen_utilities.Webdriver_utility;

public class Organization_page {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement clickonorgbtn;
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement sendkeytosearchfield;
	@FindBy (xpath="//select[@name='industry']")
	private WebElement selectfromdropdown;
	@FindBy (xpath="(//input[@class='crmbutton small save'])[1]")
	private WebElement save;
	
	public Organization_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickorgbtn() {
		clickonorgbtn.click();
	}
	public void sendtosearchfield(String str) {
		sendkeytosearchfield.sendKeys(str);
	}
	public void dropdownselect() {
		selectfromdropdown.click();
	}
	public void savebutton() {
		save.click();
	}

}
