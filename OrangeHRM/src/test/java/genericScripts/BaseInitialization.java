package genericScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseInitialization
{
public BaseInitialization(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
