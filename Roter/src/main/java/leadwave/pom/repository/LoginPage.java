package leadwave.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import gen_utilities.Webdriver_utility;

public class LoginPage {
	
	//declaration
	@FindBy(name="user_name")private WebElement usernameedttext;
	
	@FindBys(@FindBy(name="user_password"))private WebElement passwordedttext;
	
	@FindAll({@FindBy(id="submitButton"),@FindBy(xpath="//input[@value='Login']")})private WebElement loginbutton;
	
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
//	public WebElement getusernameedttext(){
//		return usernameedttext;
//	}
//	public WebElement getpassword() {
//		return passwordedttext;
//	}
//	public WebElement getloginbutton() {
//		return passwordedttext;
//	}
	
	
	//business libraries
	/**
	 * to login to crm by username and password and click on login
	 */
	public void logintoApp(String username, String password) {
		usernameedttext.sendKeys(username);
		passwordedttext.sendKeys(password);
		loginbutton.click();
	}
	
}























