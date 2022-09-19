package mobile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class reusepage {
	WebDriver driver;
	public actionspage actionspage;
	public WebDriver basetest()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asa.ajay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		return driver;
	}
	@BeforeMethod
	public actionspage launchapp()
	{
		driver = basetest();
		actionspage =new actionspage (driver);
		actionspage.open_mobileworld();
		return actionspage;
	}

}
