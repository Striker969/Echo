package gen_utilities;

import java.io.IOException;

import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//import com.mysql.jdbc.Driver;

public class Itest implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test=report.createTest(methodname);
	
		//Reporter.log("execution starts here",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.PASS, methodname);
		Reporter.log(methodname+"----> excecuted successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
			try {
				
				String screenshot= Webdriver_utility.getscreenshot(BASE_CLASS.sdriver,methodname);
				test.log(Status.FAIL, methodname+"---failed");
				test.log(Status.FAIL, result.getThrowable());
				test.addScreenCaptureFromPath(screenshot);
				Reporter.log(methodname+"--->failed");

				
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("exception handled");
			}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+"--> skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(methodname+"--->skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		Javautility javas=new Javautility();
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./extentreport/"+javas.getsysdateformat()+"report"+javas.getrandomno(220)+".html");
		htmlreport.config().setDocumentTitle("Roter");
		htmlreport.config().setReportName("CRM1");
		htmlreport.config().setTheme(Theme.DARK);
		
		report=new ExtentReports(); 
		report.attachReporter(htmlreport);
		report.setSystemInfo("base-platform", "windows");
		report.setSystemInfo("base-browser", "chrome");
		report.setSystemInfo("base-url", "http://localhost:8888");
		report.setSystemInfo("reporter name", "Roopak");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	
}
