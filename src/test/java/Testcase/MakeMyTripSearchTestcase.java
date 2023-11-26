package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserDriver.Browser;
import CommonElements.DriverElements;
import Utils.Propertiesclass;


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

	@Test
	public void ValidSearch()
	{
		/*
		 * Select From location
		 * SElect To location
		 * Select Date
		 * Click Search
		 * Validate Search result as per search
		 */

		c.WaitForElementToBeClickable(driver,By.xpath("//*[@for='fromCity']"),60);
		c.ClickOnButton(driver.findElement(By.xpath("//*[@for='fromCity']")));

		//WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);
		c.WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);

		//Select From location
		c.SelectTheValueFromList(driver,By.xpath("//ul[@role='listbox']//li"),"MAA");
		String FromLocation =c.GetAttributeOfelement(driver.findElement(By.xpath("//input[@id='fromCity']")),"value");
		//SElect To location
		c.WaitForElementToBeClickable(driver,By.xpath("//*[@for='toCity']"),60);
		c.ClickOnButton(driver.findElement(By.xpath("//*[@for='toCity']")));

		//WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);
		c.WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);

		c.SelectTheValueFromList(driver,By.xpath("//ul[@role='listbox']//li"),"PNQ");
		String toLocation =c.GetAttributeOfelement(driver.findElement(By.xpath("//input[@id='toCity']")),"value");

		//SElect To location
		c.SelectValueinCalender(driver,"28");
		//Click Search
		c.clickOnButton(driver.findElement(By.xpath("//*[@data-cy='submit']//a")));
		// wait for the popup
		c.WaitForElementToBeClickable(driver,By.xpath("//*[text()='OKAY, GOT IT!']"),60);
		c.clickOnButton(driver.findElement(By.xpath("//*[text()='OKAY, GOT IT!']")));
		String ActualValue = "Flights from Chennai to Bengaluru";
		// validation
		Assert.assertEquals(ActualValue,c.ExpectedSearchText(FromLocation, toLocation));

	}
	@AfterSuite
	public void quitTheBrowser()
	{
		CloseBrowser();
	}
}
