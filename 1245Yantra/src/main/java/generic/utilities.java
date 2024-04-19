package generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class utilities {
	public void switchwin(WebDriver y,String url) {
		Set<String> s=y.getWindowHandles();
		for(String t:s) {
			y.switchTo().window(t);
			String ty=y.getCurrentUrl();
			if(ty.contains(url)) {
				break;
			}
		}
	}
}
