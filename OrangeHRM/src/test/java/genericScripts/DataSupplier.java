package genericScripts;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplier implements ApplicationConstants{

	
	public static String[][] SupplyData() throws IOException
	{
		FileInputStream fis=new FileInputStream(Excel_Path);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet");
		int lastRow=sheet.getLastRowNum();
		short lastcell = sheet.getRow(0).getLastCellNum();
		String[][] EmpInfo=new String[lastRow][lastcell];
		for(int r=0;r<=lastRow;r++)
		{
			XSSFRow row = sheet.getRow(r);
		for(int c=0;c<=lastcell;c++)
		{
			XSSFCell cell = row.getCell(c);
			String val = cell.getStringCellValue();
			EmpInfo[r][c]=val;
			
		}
		}
		
		return EmpInfo;
		
	}
	@DataProvider(name="Employeeinfo")
	public String[][] AddEmployees()
	{
		String[][]EmpInfo=new String[1][3];
		EmpInfo[0][0]="manju";
		EmpInfo[0][1]="Deb";
		EmpInfo[0][2]="978";
		return EmpInfo;
	}
}
