package genericScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class captureScreenshot implements ApplicationConstants {
	
public static void GetDefect(WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File perm=new File(Screenshoot_path);
	FileHandler.copy(temp, perm);
	
}
}
