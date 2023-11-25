package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	WebDriver browser;
	public void WebTableImplementation(String expectedCountry) throws InterruptedException
	{
		browser = new ChromeDriver();
		browser.get("https://leafground.com/table.xhtml");
		browser.manage().window().maximize();

		List<WebElement> allPages = browser.findElements(By.xpath("//*[@class='ui-paginator-pages']//a"));
		for(int j=1;j<=allPages.size();j++)
		{
			browser.findElement(By.xpath("//*[@class='ui-paginator-pages']//a["+j+"]")).click();
			Thread.sleep(3000);
			List<WebElement> allrows = browser.findElements(By.xpath("//table//tbody[@id='form:j_idt89_data']//tr"));
			for(int i=1;i<allrows.size();i++)
			{
				String actualCountry = browser.findElement(By.xpath("//table//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[2]//span[contains(@style,'vertical-align')]")).getText();
				if(expectedCountry.equalsIgnoreCase(actualCountry))
				{
					String name = browser.findElement(By.xpath("//table//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[1]")).getText();
					System.out.println(name);
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebTable W = new WebTable();
		W.WebTableImplementation("India");
	}

}
