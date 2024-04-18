package gen_utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int lowercount=0;
	int uppercount=2;
	@Override
	public boolean retry(ITestResult result) {
		if(lowercount<uppercount) {
			lowercount++;
			return true;
		}
		return false;
	}
	
}
