package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public void launch() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		//browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		browser.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		browser.findElement(By.name("firstname")).sendKeys("Sathish");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
		browser.findElement(By.name("lastname")).sendKeys("Sathish");

		Select dayDropdown = new Select(browser.findElement(By.id("day")));
		dayDropdown.selectByIndex(9);
		Select monthDropdown = new Select(browser.findElement(By.id("month")));
		monthDropdown.selectByValue("5");
		Select yearDropdown = new Select(browser.findElement(By.id("year")));
		yearDropdown.selectByVisibleText("2010");


	}

	public void multiselect() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		browser.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		browser.manage().window().maximize();
		Select food = new Select(browser.findElement(By.cssSelector("select[id='second']")));
		if(food.isMultiple())
		{
			food.selectByIndex(0);
			Thread.sleep(1000);
			food.selectByVisibleText("Bonda");
			Thread.sleep(1000);
			food.selectByValue("donut");
			Thread.sleep(1000);
			food.deselectByVisibleText("Bonda");
			Thread.sleep(1000);
			food.deselectAll();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		dropdown d = new dropdown();
		d.multiselect();
	}

}
