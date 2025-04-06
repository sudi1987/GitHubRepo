package genericScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.DashBoardPageObject;
import PageObjects.LoginPageObjects;
import PageObjects.PIM_PageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	ReadPropertyFile rpf;
	WebDriver driver;
	LoginPageObjects lpo;
	public DashBoardPageObject dbo;
	public PIM_PageObjects ppo;
	@Parameters("Browser")
	@BeforeClass// Before every class of Test cases
	public void configureBrowser(String Browser) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		switch(Browser)
		{
		case "chrome":driver=new ChromeDriver();
		break;
		case "Fire": driver=new ChromeDriver();
		break;
		default:System.out.println("invalid parameter");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		rpf=new ReadPropertyFile();
		lpo=new LoginPageObjects(driver);
		dbo=new DashBoardPageObject(driver);
		ppo=new PIM_PageObjects(driver);
}
	@BeforeMethod //before every testcases
	public void LaunchApplication()
	{
		driver.navigate().to(rpf.QA_Url());
		lpo.EnterUsn().sendKeys("Admin");
		lpo.EnterPsw().sendKeys("admin123");
		lpo.ClickLogin();
		String DashBoardText = dbo.DashBoardText().getText();
		Assert.assertEquals(DashBoardText, "Dashboard");
		System.out.println("it is a deshboard");
		
	}
//	@Test
//	public void Test()
//	{
//		System.out.println("executed");
//	}
//	@AfterMethod
//	public void logoutApplication()
//	{
//		dbo.LogoutElement();
//		dbo.LogoutOption();
//		
//	}
//	@AfterClass
//	public void closeBrowser()
//	{
//		
//	}
}