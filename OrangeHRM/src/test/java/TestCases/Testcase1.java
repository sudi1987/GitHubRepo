package TestCases;

import org.testng.annotations.Test;

import genericScripts.BasePage;
import genericScripts.DataSupplier;

public class Testcase1 extends BasePage {
	@Test//(dataProvider = "TestData",dataProviderClass = DataSupplier.class)
	public void AddEmployee()
	{
	dbo.PIM();
	ppo.Add_employee().click();
	ppo.FirstName().sendKeys("sudipta");
	ppo.LastName().sendKeys("Deb");
	ppo.Empid().sendKeys("101");
	ppo.save();
	}

}
