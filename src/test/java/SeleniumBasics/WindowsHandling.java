package SeleniumBasics;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandling {
	WebDriver browser;
	public void WindowsImplementation()
	{
		browser = new ChromeDriver();
		browser.get("https://leafground.com/window.xhtml");
		browser.manage().window().maximize();
		String ParentWindow = browser.getWindowHandle();
		browser.findElement(By.id("j_idt88:new")).click();
		Set<String> allbrowser= browser.getWindowHandles();
		for(String eachwindow : allbrowser)
		{
			if(!eachwindow.equalsIgnoreCase(ParentWindow))
			{
				browser.switchTo().window(eachwindow);
				List<WebElement> elementExist = browser.findElements(By.id("menuform:j_idt40"));
				if(elementExist.size()>0)
				{
					browser.findElement(By.id("menuform:j_idt40")).click();
					WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
					wait.until(ExpectedConditions.elementToBeClickable(By.id("menuform:m_input")));

					browser.findElement(By.id("menuform:m_input")).click();
					wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("j_idt88:name")));

					browser.findElement(By.id("j_idt88:name")).sendKeys("satish");

				}
			}
		}
		browser.switchTo().window(ParentWindow);
		browser.quit();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowsHandling WH = new WindowsHandling();
		WH.WindowsImplementation();
	}

}
