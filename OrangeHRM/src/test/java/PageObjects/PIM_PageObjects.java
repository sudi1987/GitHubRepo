package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_PageObjects {

	@FindBy(xpath="//a[.='Add Employee']")
	private WebElement Add_emp;
	@FindBy(name="firstName")
	private WebElement F_name;
	@FindBy(name="lastName")
	private WebElement L_name;
	@FindBy(xpath="//button[.=' Save ']")
	private WebElement save;
	@FindBy(xpath="//label[.='Employee Id']/../following-sibling::div[1]/input[1]")
	private WebElement empid;
	public PIM_PageObjects(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement Add_employee()
{
	return Add_emp;
}
public WebElement FirstName()
{
	return F_name;
}
public WebElement LastName()
{
	return L_name;
}
public void save()
{
	save.click();
}
public WebElement Empid()
{
	return empid;
}
}
