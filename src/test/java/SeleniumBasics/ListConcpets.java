package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListConcpets {

	public void listImplementation(String expectedCountry)
	{
		WebDriver browser = new EdgeDriver();
		browser.get("https://leafground.com/select.xhtml;");
		browser.manage().window().maximize();
		browser.findElement(By.xpath("//*[@id='j_idt87:country']//div[contains(@class,'ui-selectonemenu-trigger')]")).click();
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt87:country_items']//li[last()]")));
		List<WebElement> allCountries = browser.findElements(By.xpath("//*[@id='j_idt87:country_items']//following-sibling::li"));
		for(WebElement eachcountry :  allCountries)
		{
			String actualCountry = eachcountry.getText();
			if(expectedCountry.equalsIgnoreCase(actualCountry))
			{
				eachcountry.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListConcpets L = new ListConcpets();
		L.listImplementation("Germany");
	}

}
