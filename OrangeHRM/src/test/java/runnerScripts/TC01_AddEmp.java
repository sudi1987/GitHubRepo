package runnerScripts;

import org.testng.annotations.Test;

import genericScripts.ApplicationConstants;
import genericScripts.BasePage;
import genericScripts.DataSupplier;

public class TC01_AddEmp extends BasePage implements ApplicationConstants
	{
		@Test(dataProvider = "Employeeinfo",dataProviderClass = DataSupplier.class)
		public void AddEmpFeature(String FN,String LN) throws Exception
		{
			
			dbo.PIM();
			ppo.Add_employee().click();
			ppo.FirstName().sendKeys(FN);
			ppo.LastName().sendKeys(LN);
			ppo.save();
		}
//		@DataProvider(name = "TestData")
//		public String[][] TestDataSupplier() throws Exception
//		{
//			ReadExcel.AccessSheet("Sheet1",ExcelPath);
//			int LastRow = ReadExcel.GetLastRow();
//			int LastCell = ReadExcel.GetLastCell();
//			String [][] values = new String[LastRow+1][LastCell];
//			for(int r=0;r<=LastRow;r++)
//			{
//				XSSFRow currentRow = ReadExcel.AccessRow(r);
//				for(int c=0;c<LastCell;c++)
//				{
//					XSSFCell currentCell = currentRow.getCell(c);
//					values[r][c] = currentCell.getStringCellValue();	
//				}
//			}
//			return values;
		}
		
		



