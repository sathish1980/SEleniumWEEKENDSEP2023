package Testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.ExcelfileRead;

public class DataProviderClass {
	@DataProvider(name ="Search")
	public Object[][] GetValidSearchdata() throws IOException
	{
		return ExcelfileRead.ReadData("MakeMyTrip.xls","ValidSearch");
	}

	@DataProvider(name ="invalidSearch")
	public Object[][] GetinValidSearchdata() throws IOException
	{
		return ExcelfileRead.ReadData("MakeMyTrip.xls","ValidSearch");
	}
}
