package tests;
import pages.methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class methodcall {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	

	@BeforeMethod
	public void url()
	{
		driver.get("https://www.whitemart.in/");
	}
	
	
	@Test
	public void testing()
	{
		methods ob=new methods(driver);
		//ob.titleVerify();
		ob.logoDisplayAlt();
		
	}
	
}
