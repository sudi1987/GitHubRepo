package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPageObject {
	
	@FindBy(xpath="//img[@alt='profile picture' and @class='oxd-userdropdown-img']")
	private WebElement LogoutElement;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement LogoutOption;
	@FindBy(xpath="//h6[.='Dashboard']")
	private WebElement Dashboard;
	@FindBy(xpath="//span[.='PIM']")
	private WebElement PIM;
	
	public DashBoardPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void LogoutElement()
	{
		LogoutElement.click();
	}
	public void LogoutOption()
	{
		LogoutOption.click();
	}
	public WebElement DashBoardText()
	{
		return Dashboard;
	}
	public void PIM()
	{
		PIM.click();
	}
}
