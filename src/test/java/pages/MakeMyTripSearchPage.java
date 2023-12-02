package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonElements.DriverElements;

public class MakeMyTripSearchPage extends DriverElements{

	WebDriver driver;

	public MakeMyTripSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public String SelectFromLocation(String fromLocation)
	{
		WaitForElementToBeClickable(driver,By.xpath("//*[@for='fromCity']"),60);
		ClickOnButton(driver.findElement(By.xpath("//*[@for='fromCity']")));

		//WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);
		WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);

		//Select From location
		SelectTheValueFromList(driver,By.xpath("//ul[@role='listbox']//li"),fromLocation);
		return GetAttributeOfelement(driver.findElement(By.xpath("//input[@id='fromCity']")),"value");
	}

	public String SelectToLocation(String toLocation)
	{
		//Select To location
		WaitForElementToBeClickable(driver,By.xpath("//*[@for='toCity']"),60);
		ClickOnButton(driver.findElement(By.xpath("//*[@for='toCity']")));

		//WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);
		WaitForElementToBeVisible(driver,By.xpath("(//ul[@role='listbox']//li)[1]"),60);

		SelectTheValueFromList(driver,By.xpath("//ul[@role='listbox']//li"),toLocation);
		return GetAttributeOfelement(driver.findElement(By.xpath("//input[@id='toCity']")),"value");
	}

	public void SelectDeptaureDate(String selectDate)
	{
		SelectValueinCalender(driver,selectDate);
	}

	public void SelectReturnDate(String selectDate)
	{
		SelectValueinCalender(driver,selectDate);
	}

	public void SelectTravellerAndClass()
	{
		SelectTraveller();
		SelectClass();
	}

	public void SelectTraveller()
	{

	}

	public void SelectClass()
	{

	}

	public void SelectAFairType()
	{

	}

	public void ClickOnSearchButton()
	{
		clickOnButton(driver.findElement(By.xpath("//*[@data-cy='submit']//a")));

	}

}
