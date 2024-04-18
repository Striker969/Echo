package leadwave.pom.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_popup_window {
	@FindBy (xpath="(//input[@type='submit'])[2]")
	private WebElement products;
//	@FindBy(xpath="//a[.='pavillion360TY01']")
//	private WebElement theproduct;
	
	public Products_popup_window(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void productwindow() {
		products.click();
	}
}
