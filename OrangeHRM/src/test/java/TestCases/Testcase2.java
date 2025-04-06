package TestCases;

import org.testng.annotations.Test;

import genericScripts.BasePage;
import genericScripts.DataSupplier;

 
	public class Testcase2 extends BasePage {
		@Test(dataProvider = "Employeeinfo",dataProviderClass = DataSupplier.class)
		public void AddEmployee(String Fn,String Ln,String Empid)
		{
		dbo.PIM();
		ppo.Add_employee().click();
		ppo.FirstName().sendKeys(Fn);
		ppo.LastName().sendKeys(Ln);
		ppo.Empid().sendKeys(Empid);
		ppo.save();
		}

	}



