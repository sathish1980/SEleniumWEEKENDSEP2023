package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import BrowserDriver.Browser;
import CommonElements.DriverElements;
import Utils.Propertiesclass;
import pages.MakeMyTripSearchPage;
import pages.MakeMyTripSearchResultPage;


public class MakeMyTripSearchTestcase  extends Browser{
	DriverElements c = new DriverElements();


	@BeforeSuite
	public void LaunchBrowsers() throws IOException
	{
		LaunchBrowser();
		String applicationURL =Propertiesclass.Readdata().getProperty("url");
		driver.get(applicationURL);

	}

	@BeforeTest
	public void CloseADDs() throws InterruptedException
	{
		Thread.sleep(3000);
		c.ClickIfElementExist(driver,"//*[@data-cy='closeModal']");
		Thread.sleep(1000);
		c.ClickIfElementExist(driver,"//*[@class='close']");
		Thread.sleep(2000);
		c.CloseCreateAccountPopup(driver.findElement(By.xpath("//*[@data-cy='closeModal']")));
		Thread.sleep(2000);
	}

	@Test(dataProvider ="Search",dataProviderClass=DataProviderClass.class)
	public void ValidSearch(String from, String to ,String date)
	{
		/*
		 * Select From location
		 * SElect To location
		 * Select Date
		 * Click Search
		 * Validate Search result as per search
		 */
		/*String from = "MAA";
		String to = "BLR";
		String date = "25";*/
		MakeMyTripSearchPage sp =new MakeMyTripSearchPage(driver);
		test.log(LogStatus.INFO, "We are in the Search home page");

		String getFromLocation = sp.SelectFromLocation(from);
		String fromlocationScreenshot = sp.takescreenshot(driver);
		test.log(LogStatus.INFO, "Select the From Location as: "+from,test.addScreenCapture(fromlocationScreenshot));

		String getToLocation = sp.SelectToLocation(to);
		String tolocationScreenshot = sp.takescreenshot(driver);
		test.log(LogStatus.INFO, "Select the To Location as: "+to,test.addScreenCapture(tolocationScreenshot));

		sp.SelectDeptaureDate(date);
		test.log(LogStatus.INFO, "Select the date as: "+date);
		String dateScreenshot = sp.takescreenshot(driver);
		test.log(LogStatus.INFO, "Select the date as: "+date,test.addScreenCapture(dateScreenshot));

		sp.ClickOnSearchButton();
		test.log(LogStatus.INFO, "Search button is clicked");

		MakeMyTripSearchResultPage srp = new MakeMyTripSearchResultPage(driver);
		srp.WaitAndSelectOkGotItPopup();
		test.log(LogStatus.INFO, "OK Got it popup button is clicked");

		Assert.assertEquals(srp.GetSearchText(),srp.ExpectedSearchText(getFromLocation, getToLocation));
		String finalScreenshot = sp.takescreenshot(driver);
		test.log(LogStatus.INFO, test.addScreenCapture(finalScreenshot));
		driver.navigate().back();
	}



	@AfterMethod
	public void GetTestcaseStatus(ITestResult result)
	{
		if (result.getStatus() == 1) {
			test.log(LogStatus.PASS, result.getMethod().getMethodName() +" Test Passed");  // new
		} else if (result.getStatus() == 2) {
			String screenshotPath = c.takescreenshot(driver);
			test.log(LogStatus.INFO, result.getMethod().getMethodName() +" Test Error info",test.addScreenCapture(screenshotPath));
			test.log(LogStatus.FAIL, result.getMethod().getMethodName() +" Test Error");  // new
		} else if (result.getStatus() == 3) {
			test.log(LogStatus.SKIP, result.getMethod().getMethodName()+" Test Skipped");  // new
		}
	}

	@AfterSuite
	public void quitTheBrowser()
	{
		CloseBrowser();
	}
}
