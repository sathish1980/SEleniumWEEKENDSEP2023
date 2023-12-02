package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonElements.DriverElements;

public class MakeMyTripSearchResultPage extends DriverElements {

	WebDriver driver;

	public MakeMyTripSearchResultPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void WaitAndSelectOkGotItPopup()
	{
		WaitForElementToBeClickable(driver,By.xpath("//*[text()='OKAY, GOT IT!']"),60);
		clickOnButton(driver.findElement(By.xpath("//*[text()='OKAY, GOT IT!']")));
	}

	public String GetSearchText()
	{
		WebElement getSearchText =  driver.findElement(By.xpath("(//*[@class='listingRhs']//p)[1]//span"));
		return RetriveTextFromTextbox(getSearchText,null);

	}

	public String ExpectedSearchText(String FromCityName, String ToCityName)
	{
		return "Flights from "+FromCityName+" to "+ToCityName;

	}
}
