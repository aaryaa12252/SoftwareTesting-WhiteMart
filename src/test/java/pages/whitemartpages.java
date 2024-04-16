package pages;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class whitemartpages {
	public WebDriver driver;

	
	//inspected elements
	By logoElement=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[1]/a/img");
	By searchBar=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/div/div/div/div/form/div[1]/span/span[1]/input");
	
	By atag=By.tagName("a");
	By emailElement=By.xpath("//*[@id=\"root\"]/main/footer/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div/form/div/span/span[1]/input");
	By allcategories=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/ul/li/div");
	
	By tv=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[1]/a");
	By refrigerator=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[2]/a");
	By airconditoners=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[3]/a");
	By washingmachine=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[4]/a");
	By homeappliance=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[5]/a");
	By kitchenappliance=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[6]/a");
	
	
	
	By offers=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[7]/a");
	
	By airconditioner=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/ul/li/ul/li[2]/a");
	
	By filters=By.xpath("//*[@id=\"root\"]/main/div[2]/div/div[3]/div[1]/div/div[1]/div/h2");
	
	By loginicon=By.xpath("/html/body/div/main/header/nav/div[1]/div/div/div[2]/ul/li[3]");
	By usernamefield=By.xpath("//*[@id=\"email\"]");
	By passwordfield=By.xpath("//*[@id=\"root\"]/aside/div/div/div/div/div[2]/form/div[3]/div/span/span[1]/input");
	By loginbutton=By.xpath("//*[@id=\"root\"]/aside/div/div/div/div/div[2]/form/div[6]/button[1]");
	
	
	//Constructor
	public whitemartpages(WebDriver driver)
	{
		this.driver=driver;
	}

	public void browserhandle()
	{
		//Browser issue handling
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	}
	
	public void notificationhandle()
	{
		//Notification handling
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.manage().window().maximize();
	}
	
	
	
	
	
	
	public void title() throws InterruptedException
	
	{
		//Title getting and verification
		System.out.println(".......................TITLE VERIFICATION......................................");
		Thread.sleep(10000);
		String actualtitle = driver.getTitle();
		System.out.println("TITLE:"+actualtitle);
		if(actualtitle.equalsIgnoreCase("Buy Home Appliances Online Kerala | Best Electronics Store | White Mart"))
		{
			System.out.println("Title is as expected");
		}
		else
		{
			System.out.println("Title is not as expected");
		}
		
		
	}
	
	
	public void text()
	{
		//alternate text getting of logo
		System.out.println(".......................TEXT VERIFICATION......................................");
		 String altText = driver.findElement(logoElement).getAttribute("alt");
	        if (altText != null && !altText.isEmpty())
	        {
	            System.out.println("ALTERNATE TEXT FOR LOGO :" + altText);
	        } else
	        {
	            System.out.println("NO ALTERNATE TEXT FOR LOGO !");
	        }
	        
	}
	
	
	
	public void content()
	{
		//Content getting and verification
		System.out.println(".......................CONTENT VERIFICATION......................................");
		String content=driver.getPageSource();
		if(content.contains("home appliances kerala"))
		{
			System.out.println("The content -home appliances kerala is present in the website");
		}
		else	
		{
			System.out.println("The content -home appliances kerala is absent in the website");
		}
		 
	}
	
	
	
	public void text_entering()
	{
		//Entering text in the search field and clicking
		System.out.println(".......................TEXT ENTERING & CLICKING......................................");
		
    	driver.findElement(searchBar).sendKeys("LG",Keys.ENTER);
    	driver.navigate().back();
    	
    
	}
	
	
	
	
	public void link_display()
	{
		//Displaying links
		System.out.println(".......................ALL LINKS AND TEXTS......................................");
		List<WebElement> li = driver.findElements(atag);
		System.out.println("No:of Links:"+li.size());
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			String text=s.getText();
			System.out.println("all links are here");
			System.out.println(link+"-*-*-*-"+text);
					
		}
		
	}
	
	
	
	public void link_validation()
	{
		//Link validation
		System.out.println(".......................VALIDATION OF LINK......................................");
		String Link="https://www.whitemart.in/";
		try
		{
			URL ob=new URL (Link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("valid:"+Link);
			}
			else
			{
				System.out.println("INvalid:"+Link);
			

			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public void logoDisplayAlt()
    {
        // presence  of the logo
		System.out.println(".......................LOGO PRESENCE VERIFICATION......................................");
    	boolean logo = driver.findElement(logoElement).isDisplayed();
        if (logo) 
        {
            System.out.println("Logo is displayed.");
        }
        else 
        {
            System.out.println("Logo is not displayed.");
        }
        
    }
	
	
	
	public void scrolldown() throws InterruptedException
	{
		
		//scrolling down 

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)", " ");
		

		
	}
	
	
	public void screenshot(String elocation,String plocation) throws IOException 
	{
		//Element Screenshot
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement elmntsst = driver.findElement(emailElement);
		File esrc=elmntsst.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(esrc,new File(elocation));
	
		
		
		//Page Screenshot
		File psrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(psrc,new File(plocation));
		
		
	}
	
	
	

	 public void hoveringoncategories()
	    {
		 Actions act=new Actions(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    	//Hovering on All categories
	    	WebElement movetoallcategory = driver.findElement(allcategories);
	    	act.moveToElement(movetoallcategory).perform();
	    	
	    	//Hover on tv
	    	
	    	WebElement movetotv = driver.findElement(tv);
	    	act.moveToElement(movetotv).perform();
	    	

	    	//Hover on refrigerator
	    	
	    	WebElement movetorefrigerator = driver.findElement(refrigerator);
	    	act.moveToElement(movetorefrigerator).perform();
	    	

	    	//Hover on airconditoners
	    	
	    	WebElement movetoairconditoners = driver.findElement(airconditoners);
	    	act.moveToElement(movetoairconditoners).perform();
	    	

	    	//Hover on washingmachine
	    	
	    	WebElement movetowashingmachine = driver.findElement(washingmachine);
	    	act.moveToElement(movetowashingmachine).perform();
	    	

	    	//Hover on homeappliance
	    	
	    	WebElement movetohomeappliance = driver.findElement(homeappliance);
	    	act.moveToElement(movetohomeappliance).perform();
	    	

	    	//Hover on kitchenappliance
	    	
	    	WebElement movetokitchenappliance = driver.findElement(kitchenappliance);
	    	act.moveToElement(movetokitchenappliance).perform();
	    	
	    	
	    }
	 
	
	 public void refreshing()
	 {
		 //refreshing page
		 driver.navigate().refresh();
	 }
	 
	 public void doubleclicking() throws InterruptedException	
		{
		

		 Actions act=new Actions(driver);
			//double clicking action on offers
			WebElement offerclick = driver.findElement(offers);
			act.doubleClick(offerclick).perform();
			
			Thread.sleep(10000);
			
			
		}
	 
	 
	 
	 
	 
	 public void backward()
	 {
		 //go backward
		 driver.navigate().back();
		 
	 }
	 
	 
	 public void waiting() throws InterruptedException
	 {
		 Actions act=new Actions(driver);
		 
		 //Hover on All Category
		 WebElement hoveronallcategory = driver.findElement(allcategories);
	    	act.moveToElement(hoveronallcategory).perform();
	    	
	    	
	    	//Click on airconditioner
	    	Thread.sleep(20000);
	    	driver.findElement(airconditioner).click();
	    	
	    	//waiting
	    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(80));
			wait.until(ExpectedConditions.visibilityOfElementLocated(filters));
	    	
	 }
	 
	 
		public void login(String username,String password) throws InterruptedException
		
		{
			//login using data driven framework
	  
		driver.findElement(loginicon).click();//clicking on login icon
		Thread.sleep(5000);
		//driver.findElement(usernamefield).clear();
		driver.findElement(usernamefield).sendKeys(username);
		//driver.findElement(passwordfield).clear();
		driver.findElement(passwordfield).sendKeys(password);
		driver.findElement(loginbutton).click();
		}
		
		
		
		
		
		public void scrollupanddown()
		{
			
			//scrolling up to bottom of page
			JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			   js.executeScript("window.scrollBy(0,-600)");
				
		}
		
		
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

