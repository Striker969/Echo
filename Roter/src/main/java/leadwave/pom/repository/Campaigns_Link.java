package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaigns_Link {
	@FindBy(xpath="//a[.='Campaigns' and @name='Campaigns']") private WebElement camp;
	
	public Campaigns_Link(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickoncamp() {
		camp.click();
	}
}
