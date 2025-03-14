package FrameWork;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithFrameWork {
	
	WebDriver driver;
	String BaseUrl = "https://demo.coolincool.com/users";
	MainClass storedata;
	


	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		storedata = new MainClass(driver);

		
	}

	@After
	public void tearDown() throws Exception {
		
		driver.close();
		
	}

	@Test
	public void test() throws Exception{
		
		driver.get(BaseUrl);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(storedata.username)).sendKeys("Client");
		//storedata.username.sendKeys("Client");
		storedata.password.sendKeys("Test@1231");
		storedata.Submit.click();
		 Thread.sleep(9000);
		
	}

}
