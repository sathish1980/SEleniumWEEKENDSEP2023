package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxAndRadiobutton {

	WebDriver browser;
	public void checkboxImplementation()
	{
		browser = new ChromeDriver();
		browser.get("https://leafground.com/checkbox.xhtml;");
		browser.manage().window().maximize();
		browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//div[starts-with(@class,'ui-chkbox-box')]")).click();
		String classAttribute = browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//div[starts-with(@class,'ui-chkbox-box')]")).getAttribute("class");
		if(classAttribute.contains("ui-state-active"))
		{
			System.out.println("Yes ! its checked");
			browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//div[starts-with(@class,'ui-chkbox-box')]")).click();
			String classAttribute1 = browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//div[starts-with(@class,'ui-chkbox-box')]")).getAttribute("class");
			if(!classAttribute1.contains("ui-state-active"))
			{
				System.out.println("Yes ! its unchecked sucessfully ");

			}
		}
	}

	public void Toggle()
	{
		browser.findElement(By.className("ui-toggleswitch-slider")).click();
		System.out.println(WaitAndGetTextFromToast());
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ui-growl-title")));
		browser.findElement(By.className("ui-toggleswitch-slider")).click();
		System.out.println(WaitAndGetTextFromToast());
	}

	public String WaitAndGetTextFromToast()
	{
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-growl-title")));
		String toastMessage = browser.findElement(By.className("ui-growl-title")).getText();
		return toastMessage;
	}

	public void RadioButton()
	{
		browser.get("https://leafground.com/radio.xhtml;");
		browser.findElement(By.xpath("//*[@id='j_idt87:console1']//td[4]//div[starts-with(@class,'ui-radiobutton-box')]")).click();
		String classAttribute = browser.findElement(By.xpath("//*[@id='j_idt87:console1']//td[4]//div[starts-with(@class,'ui-radiobutton-box')]")).getAttribute("class");
		if(classAttribute.contains("ui-state-active"))
		{
			System.out.println("Yes ! its checked");
		}
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		CheckboxAndRadiobutton c=  new CheckboxAndRadiobutton();
		c.checkboxImplementation();
		c.Toggle();
		c.RadioButton();

	}

}
