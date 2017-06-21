package Multi;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class testdata {
	WebDriver driver;
	@Test(dataProvider="amazon")
	public void login(String username,String password)
	{
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.findElement(By.xpath(".//*[@id='a-autoid-0-announce']/span")).click();
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("username");
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("password");
		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		Assert.assertEquals("http://www.amazon.in/",driver.getCurrentUrl());
		driver.close();
		
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@DataProvider(name="amazon")
	public Object[][] passData() throws BiffException, IOException
	{
		File f=new File("D:\\Sample\\Sampletestdata.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("sheet1");
		int rows=s.getRows();
		int coloumns=s.getColumns();
		String inputdata[][]=new String[rows][coloumns];
		for(int i=rows;i<rows;i++)
		{
			for(int j=coloumns;j<coloumns;j++)
			{
				Cell c=s.getCell(j,i);
				inputdata [i][j]=c.getContents();
				System.out.println();
			}
		}
		return inputdata;
	}
}
