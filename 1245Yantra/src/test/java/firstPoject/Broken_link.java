package firstPoject;

import java.net.HttpURLConnection;

//import java.io.IOException;

//import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class Broken_link {
//	public static void main(String[] args)  {
//		WebDriver x= new FirefoxDriver();
//		x.get("https://www.symbolics.com");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		x.manage().window().maximize();
//		List<WebElement> L = x.findElements(By.xpath("//a"));
//		System.out.println(L.size());
//		for(WebElement each:L) {
//			String str=each.getAttribute("href");
//			try {
//				
//			URL url=new URL(str);
//			HttpURLConnection http=(HttpURLConnection) url.openConnection();
//			int code=http.getResponseCode();
//			if(code>=400 && code!=0) {
//				System.out.println(str+"-->"+code);
//			}
//			}
//			catch(Exception e) {
//			}
//			
//		}
//	}
//}

//public class Broken_link {
//	public static void main(String[] args)  {
//		WebDriver x= new FirefoxDriver();
//		x.get("https://www.symbolics.com");
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		x.manage().window().maximize();
//		List<WebElement> L = x.findElements(By.xpath("//img"));
//		System.out.println(L.size());
//		for(WebElement each:L) {
//			String str=each.getAttribute("src");
//			try {
//				
//			URL url=new URL(str);
//			HttpURLConnection http=(HttpURLConnection) url.openConnection();
//			int code=http.getResponseCode();
//			if(code>=400 && code!=0) {
//				System.out.println(str+"-->"+code);
//			}
//			}
//			catch(Exception e) {
//			}
//			
//		}
//	}
//}

//class Broken_link{
//	public static void main(String[] args) {
//		WebDriver w=new FirefoxDriver();
//		w.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
//		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		w.manage().window().maximize();
//		List<WebElement> t=w.findElements(By.xpath("//span[@class='si-fname si-text']"));
//		boolean a=false;
//		for(WebElement web:t) {
//		String s=web.getText();
//		System.out.println(s);
//		if(s.contains("ZEALAND")) {
//			a=true;
//			break;
//		}
//		}
//		if(a) {
//			System.out.println("new zealand is present");
//		}
//		else {
//			System.out.println("new zealand is not present");
//		}
//		}
//
//	}

//class Broken_link{
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver w=new FirefoxDriver();
//		w.get("https://selectorshub.com/xpath-practice-page/");
//		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		w.manage().window().maximize();
//		WebElement x=w.findElement(By.xpath("//div[@id='userName']"));
//		SearchContext sc=x.getShadowRoot();
//		sc.findElement(By.id("kils")).sendKeys("hello");
//		
//		Thread.sleep(3000);
//		
//		WebElement x1=sc.findElement(By.id("app2"));
//		SearchContext sc1=x1.getShadowRoot();
//		sc1.findElement(By.id("pizza")).sendKeys("helloooooooo");
//		
//	}
//}
//*[name()='svg' and @class='CtaOnDeck___StyledPlusIcon-sc-orwifk-12 kyqQMg']
//h3[.='Capsicum - Green (Loose)']/ancestor::h3/following-sibling::div[@class='flex flex-col false']//button[.='Add']

//class Broken_link{
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver w=new FirefoxDriver();
//		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		w.manage().window().maximize();
//		w.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-T1&gad_source=1&gclid=Cj0KCQjw2a6wBhCVARIsABPeH1u9Q9V5tKFniP4s5P4O8gWx_j3AV2-O25pgHwS86cH4RDcSgCYCk08aAuUQEALw_wcB");
//		 w.findElement(By.xpath("//h3[.='Capsicum - Green (Loose)']/ancestor::h3/following-sibling::div[@class='flex flex-col false']//button[.='Add']")).click();
//		Thread.sleep(2000);
//		for(int i=0;i<=3;i++) {
//		w.findElement(By.xpath("//button[@class='Button-sc-1dr2sn8-0 dcJzPv CtaOnDeck___StyledButton2-sc-orwifk-3 GGExL group CtaOnDeck___StyledButton2-sc-orwifk-3 GGExL group']")).click();
//		Thread.sleep(2000);
//		}
//	}
//}

class Broken_link {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.prokabaddi.com/");
		boolean flag = false;
		// driver.findElement(By.xpath("//button[.='Accept All Cookies']")).click();
		Thread.sleep(10000);
		String exp = "Bengaluru Bulls";

		List<WebElement> allteams = driver.findElements(By.xpath("//p[@class ='name']"));
		int count = allteams.size();

		// System.out.println(count);

		Thread.sleep(10000);

		for (WebElement webEle : allteams)
		{
			String teams = webEle.getText();
			if (exp.contains(teams))
			{
				flag = true;

				break;

			}

		}

		if (flag)

		{

			System.out.println(exp);

			String point = driver.findElement(
					By.xpath("//p[.='" + exp + "']/ancestor :: div[@class='table-data team']/following-sibling"

							+ " ::div[@class ='table-data matches-play']/p[@class='count']"))
					.getText();

			System.out.println(point);

			String win = driver.findElement(
					By.xpath("//p[.='" + exp + "']/ancestor :: div[@class='table-data team']/following-sibling "

							+ "::div[@class ='table-data matches-won']/p[@class='count']"))
					.getText();

			System.out.println(win);

			String lost = driver.findElement(
					By.xpath("//p[.='" + exp + "']/ancestor :: div[@class='table-data team']/following-sibling "

							+ "::div[@class ='table-data matches-lost']/p[@class='count']"))
					.getText();

			System.out.println(lost);
			String tied = driver.findElement(
					By.xpath("//p[.='" + exp + "']/ancestor :: div[@class='table-data team']/following-sibling "
							+ "::div[@class ='table-data matches-draw']/p[@class='count']"))
					.getText();
			System.out.println(tied);
			String scrorediff = driver.findElement(
					By.xpath("//p[.='" + exp + "']/ancestor :: div[@class='table-data team']/following-sibling "

							+ ":: div[@class ='table-data score-diff']/p[@class='count']"))
					.getText();

			System.out.println(scrorediff);
		} else {
			System.out.println(" no such data present ");

		}
	}
}
