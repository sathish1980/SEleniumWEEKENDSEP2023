package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationandValidation {

	WebDriver browser;

	public void checkboxImplementation()
	{
		browser = new ChromeDriver();
		browser.get("https://leafground.com/checkbox.xhtml;");
		browser.manage().window().maximize();
		System.out.println(browser.getTitle());
		System.out.println(browser.getCurrentUrl());
		System.out.println(browser.getPageSource());
		String name = browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//span[@class='ui-chkbox-label']")).getText();
		System.out.println(name);
		String classname = browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']")).getAttribute("class");
		System.out.println(classname);
		System.out.println(browser.getWindowHandle());
		System.out.println(browser.getWindowHandles());
		String cssvl = browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//span[@class='ui-chkbox-label']")).getCssValue("vertical-align");
		System.out.println(cssvl);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerificationandValidation VV =new VerificationandValidation();
		VV.checkboxImplementation();
	}

}
