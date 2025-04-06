package genericScripts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener,ApplicationConstants {
	ExtentReports reports;
	ExtentSparkReporter reporter;
	ExtentTest testcase;
	public void onStart(ITestContext context)
	{
		ExtentSparkReporter reporter=new ExtentSparkReporter(Report_path+"Report.html");
		reporter.config().setDocumentTitle("Build01");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("TestReport");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("os", "win");
		reports.setSystemInfo("Browses", "chrome");
	}
	public void onTestStart(ITestResult result)
	{
		testcase=reports.createTest(result.getName());
		testcase.log(Status.INFO, "Execution is started");
		
		
	}
	public void onTestsuccess(ITestResult result)
	{
		testcase=reports.createTest(result.getName());
		testcase.log(Status.PASS, "Execution is started");
	}
	public void onTestSkip(ITestResult result)
	{
		testcase=reports.createTest(result.getName());
		testcase.log(Status.SKIP, "Execution is skipped");
		
	}
	public void onTestFailour(ITestResult result)
	{
		testcase=reports.createTest(result.getName());
		testcase.log(Status.FAIL, "Execution is failed");
	}
public void onFinish(ITestContext context)
{
	testcase=reports.createTest(context.getName());
	testcase.log(Status.FAIL, "Execution is completed");
	reports.flush();
}

}
