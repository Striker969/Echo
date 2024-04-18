package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * to click on checkbox
 */
public class Campaigns_page {
	@FindBy(xpath="//td[.='CAM94 ']/preceding-sibling::td/input")
	private WebElement campcheck;
	@FindBy(xpath="(//input[@type='button' and @value='Delete'])[1]")
	private WebElement todelete;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement clickcreatecamp;
	
	
	public Campaigns_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	public void checkcamp() {
		campcheck.click();
	}
	public void deletecamp() {
		todelete.click();
	}
	public void createcamp() {
		clickcreatecamp.click();
	}
}
