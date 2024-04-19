package advseleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class fox {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "./eveningselenium/geckodriver.exe");
//		WebDriver x=new FirefoxDriver();
//		x.get("https://www.netflix.com");
//		String y=x.getTitle();
//		String t=x.getCurrentUrl();
//		System.out.println(y);
//		System.out.println(t);
//		x.quit();
//	}
//}



public class fox {
	public static void main(String[] args) {
		int a[]= {23,23,45,65,23,74};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[i]=44;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=44) {
				System.out.println(a[i]);
			}
		}
	}
}





