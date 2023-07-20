package api.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.util.Timer.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportmanager implements ITestListener {
	
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	String repName;
	
	public void onStart(ITestContext testContext) {
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		repName = "Test-Report-"+timeStamp+".html";
		
		sparkreporter = new ExtentSparkReporter(".\\reports\\"+repName);
		
		sparkreporter.config().setDocumentTitle("RestAssuredAutomationProject");
		sparkreporter.config().setReportName("pet store AAI");
		sparkreporter.config().setTheme(Theme.DARK);
		
		
		extent = new ExtentReports();
		
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("Application", "Pet store User API");
		extent.setSystemInfo("Operting System", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("user", "Dinesh");
	}
	
	
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.createNode(result.getName());
		//test.log(Status.PASS, "Test Passed");
	
		
	}

public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.createNode(result.getName());
		test.assignCategory(result.getMethod().getGroups());
	//	test.log(Status.FAIL, "Test Failed");
	//	test.log(Status.FAIL, result.getThrowable().getMessage());
	
		
	}


public void onTestSkiped(ITestResult result) {
	
	test = extent.createTest(result.getName());
	test.createNode(result.getName());
	test.assignCategory(result.getMethod().getGroups());
	//test.log(Status.SKIP, "Test skiped");
	//	test.log(Status.SKIP, result.getThrowable().getMessage());
	
}

public void onFinish(ITestContext context) {
	extent.flush();
}
}
