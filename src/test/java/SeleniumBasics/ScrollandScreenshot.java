package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollandScreenshot {

	WebDriver browser;
	public void ScrollImplementation() throws InterruptedException, IOException
	{
		browser = new ChromeDriver();
		browser.get("https://leafground.com/drag.xhtml");
		browser.manage().window().maximize();
		screenshot("landing");
		JavascriptExecutor js= (JavascriptExecutor)browser;
		//vertical scroll down
		js.executeScript("window.scrollBy(0,50)", "");
		Thread.sleep(2000);
		screenshot("scrolldown");
		//vertical scroll up
		js.executeScript("window.scrollBy(0,-50)", "");
		Thread.sleep(2000);

		//Horizontaly scroll right
		js.executeScript("window.scrollBy(50,0)", "");
		Thread.sleep(2000);

		//Horizontaly scroll left
		js.executeScript("window.scrollBy(-50,0)", "");
		Thread.sleep(2000);

		//towards end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);
		screenshot("completlyend");
		//towards top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		Thread.sleep(2000);

		WebElement startbutton=browser.findElement(By.xpath("//*[text()='Start']//parent::button"));
		js.executeScript("arguments[0].scrollIntoView();", startbutton);

	}

	public void screenshot(String filename) throws IOException
	{
		TakesScreenshot scren = (TakesScreenshot)browser;
		File sourceFile = scren.getScreenshotAs(OutputType.FILE);
		File DestinationFile = new File(System.getProperty("user.dir")+"//Screenshot//"+filename+".png");
		FileUtils.copyFile(sourceFile, DestinationFile);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ScrollandScreenshot S = new ScrollandScreenshot();
		S.ScrollImplementation();

	}

}
