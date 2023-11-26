package TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeSuite(alwaysRun=true)
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}

	@AfterSuite(alwaysRun=true)
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}

	@BeforeTest(alwaysRun=true)
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}

	@AfterTest(alwaysRun=true)
	public void AfterTest()
	{
		System.out.println("After Test");
	}

	@BeforeClass(alwaysRun=true)
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}

	@AfterClass(alwaysRun=true)
	public void AfterClass()
	{
		System.out.println("After Class");
	}

	@BeforeMethod(alwaysRun=true)
	public void BeforeMethod()
	{
		System.out.println("Before method");
	}

	@AfterMethod(alwaysRun=true)
	public void AfterMethod()
	{
		System.out.println("After method");
	}

	@Test(groups="SIT")
	public void Testcase1()
	{
		System.out.println("Testcase 1");
	}

}
