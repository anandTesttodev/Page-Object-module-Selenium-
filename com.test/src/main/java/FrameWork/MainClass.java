package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement Submit;
	
	public MainClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}
	
}
