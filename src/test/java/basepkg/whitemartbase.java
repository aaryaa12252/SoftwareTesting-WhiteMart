package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class whitemartbase {

	public WebDriver driver;
	
	
	//setting up url
	
	@BeforeTest
	
	public void urlsetup()
	{
		
		String baseurl = "https://www.whitemart.in/";
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		
	}
}
