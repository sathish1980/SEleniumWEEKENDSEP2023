package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass {

	public void launch()
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		//browser.close();
		browser.get("https://www.facebook.com/");
		/*browser.navigate().to("https://www.gmail.com/");
		browser.navigate().back();
		browser.navigate().forward();
		browser.navigate().refresh();
		browser.quit();*/
		//WebElement username = browser.findElement(By.id("email"));
		WebElement username = browser.findElement(By.name("email"));

		username.sendKeys("sathish");
		username.clear();
		//browser.findElement(By.linkText("Forgotten password?")).click();
		browser.findElement(By.partialLinkText("password?")).click();
		browser.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("sathish");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass F = new FirstClass();
		F.launch();
	}

}
