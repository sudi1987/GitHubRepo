package TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import genericScripts.BasePage;

public class Testcase3 extends BasePage{
	@Test
	public void AddEmployee()
	{
	dbo.PIM();
	ppo.Add_employee().click();
	ppo.FirstName().sendKeys("Anindita");
	ppo.LastName().sendKeys("Deb Roy");
	ppo.Empid().sendKeys("5678");
	ppo.save();
	}
	@Test
	public void AddEmployee1()
	{
		dbo.PIM();
		ppo.Add_employee().click();
		ppo.FirstName().sendKeys("arun");
		ppo.LastName().sendKeys("Deb");
		ppo.Empid().sendKeys("876");
		ppo.save();
	}
}
