package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Syncronizationconcepts {

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

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Syncronizationconcepts s = new Syncronizationconcepts();
		s.launch();
	}

}
