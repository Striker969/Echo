package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gen_utilities.Webdriver_utility;

public class Orgwin_pop {
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement selectorgfrompopup;
	
	public Orgwin_pop(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void selectorgs(String svj) {
		selectorgfrompopup.sendKeys(svj);
	}
}
