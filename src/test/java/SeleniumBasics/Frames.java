package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	WebDriver browser;
	public void FramesImplementation()
	{
		browser = new ChromeDriver();
		browser.get("https://leafground.com/frame.xhtml");
		browser.manage().window().maximize();
		//browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
		List<WebElement> allFrames = browser.findElements(By.tagName("iframe"));
		for(int i=0;i<allFrames.size();i++)
		{
			browser.switchTo().frame(i);
			List<WebElement> elementExist = browser.findElements(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]"));
			if(elementExist.size()>0)
			{
				browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
			}
			browser.switchTo().defaultContent();
		}

	}

	public void MultipleFramesImplementation()
	{
		browser = new ChromeDriver();
		browser.get("https://leafground.com/frame.xhtml");
		browser.manage().window().maximize();
		//browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'4b7ecf')]")).click();
		List<WebElement> allFrames = browser.findElements(By.tagName("iframe"));
		for(int i=0;i<allFrames.size();i++)
		{
			browser.switchTo().frame(i);
			List<WebElement> innerFrames = browser.findElements(By.tagName("iframe"));
			if(innerFrames.size()>0)
			{
				browser.switchTo().frame("frame2");
				List<WebElement> elementExist = browser.findElements(By.xpath("//*[@id='Click' and contains(@style,'4b7ecf')]"));
				if(elementExist.size()>0)
				{
					browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'4b7ecf')]")).click();
				}
			}

			browser.switchTo().defaultContent();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames F = new Frames();
		F.MultipleFramesImplementation();
	}

}
