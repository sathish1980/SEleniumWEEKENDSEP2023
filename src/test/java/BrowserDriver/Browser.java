package BrowserDriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utils.Propertiesclass;
public class Browser {
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;

	public void LaunchBrowser() throws IOException
	{
		String browserName=Propertiesclass.Readdata().getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else
		{
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		ExtentReportStart();
	}

	public void ExtentReportStart()
	{
		report = new ExtentReports(System.getProperty("user.dir")+"//Reports//extentReport.html",true);
		test = report.startTest("Automation Report");
	}

	public void CloseBrowser()
	{
		report.flush();
		if(driver!=null)
			driver.quit();
	}
}

