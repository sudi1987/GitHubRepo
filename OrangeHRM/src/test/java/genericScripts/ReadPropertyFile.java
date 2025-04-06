package genericScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile
{Properties pro;
	ReadPropertyFile() throws IOException
	{
		FileInputStream fis=new FileInputStream("./PropertyFiles/TestUrl.properties");
		   pro=new Properties();
		pro.load(fis);
	}
	
	public String QA_Url()
	{ 
		String QA = pro.getProperty("QA_Server");
		return QA;
	}
	public String Staging_Url()
	{
		String Staging = pro.getProperty("Staging_Server");
		return Staging;
	}
}
