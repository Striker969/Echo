package leadwave.pom.repository;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Price_page {
	@FindBy (xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement clickaddprice;
	
	public Price_page(WebDriver drive) {
		PageFactory.initElements(drive,this);
	}
	
	public void clickaddtheprice() {
		clickaddprice.click();
	}
}
