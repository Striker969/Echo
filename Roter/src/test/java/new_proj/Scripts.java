package new_proj;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gen_utilities.Property_data;

public class Scripts {
	public static void main(String[] args) throws IOException {
		WebDriver x=new FirefoxDriver();
		Property_data da=new Property_data();
		String str=da.readdatafrompropfile("netflixurl");
		x.get(str);
	}
}
