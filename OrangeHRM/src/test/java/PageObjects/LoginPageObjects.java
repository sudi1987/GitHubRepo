package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	@FindBy(name="username")
	private WebElement usnTf;
	@FindBy(name="password")
	private WebElement pswTf;
	@FindBy(xpath="//button[.=' Login ']")
	private WebElement loginBtn;
	
	public LoginPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement EnterUsn()
	{
		return usnTf;
	}
public WebElement EnterPsw()
{
	return pswTf;
	}
public void ClickLogin()
{
	loginBtn.click();
}
}