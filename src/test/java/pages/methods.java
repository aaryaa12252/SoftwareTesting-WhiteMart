package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class methods {
	WebDriver driver;
	Actions act=new Actions(driver);
	
	//inspect and store
	By logoElement=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[1]/a/img");
	By searchElement=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/div/div/div/div/form/div[1]/span/span[1]/input");
	By backspaceElement=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/div/div/div/div/form/div[1]/span/span[2]/button/span/svg/line[1]");
	By continueShopping=By.xpath("//*[@id=\"root\"]/main/div[2]/article/div/button");
	By pincode=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/ul/div[2]/button/span/div[2]");
	By pincodebar=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/ul/div[2]/div/div/form/div[1]/span/span[1]/input");
	By pincodeapply=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/ul/div[2]/div/div/form/div[1]/div/button");
	By storeicon=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/ul/li[1]/a/svg");
	By allicon=By.xpath("//*[@id=\"root\"]/main/div[2]/div/div[1]/div/div/div[2]/div/span/span");
	By place=By.xpath("//*[@id=\"root\"]/main/div[2]/div/div[1]/div/div/div[2]/div/div/ul/li[3]");
	By placesubmit=By.xpath("//*[@id=\"root\"]/main/div[2]/div/div[1]/div/div/div[2]/button");
	By loadmore=By.xpath("//*[@id=\"root\"]/main/div[2]/div/div[2]/div[2]/button");
	By allcategories=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/ul/li/div");
	By airconditioner=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/ul/li/ul/li[2]/a");
	By tv=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[1]/a");
	By refrigerator=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[2]/a");
	By airconditoners=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[3]/a");
	By washingmachine=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[4]/a");
	By homeappliance=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[5]/a");
	By kitchenappliance=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[6]/a");
	By offers=By.xpath("//*[@id=\"root\"]/main/header/nav/div[2]/div/div/div/ul/li[7]/a");
	By loginicon=By.xpath("//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/ul/li[3]");
	
	
	
	public methods(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Function 1
	
    /*public void titleVerify()
    {
    	
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
    }
    
    */
    //Function 2
    
   public void logoDisplayAlt()
    {
        // Validate presence and display of the logo
    	
    	boolean logo = driver.findElement(logoElement).isDisplayed();
        if (logo) 
        {
            System.out.println("Logo is displayed.");
        }
        else 
        {
            System.out.println("Logo is not displayed.");
        }
        
        

        // Check alt text of the logo
        
        String altText = driver.findElement(logoElement).getAttribute("alt");
        if (altText != null && !altText.isEmpty())
        {
            System.out.println("Alt text of the logo: " + altText);
        } else
        {
            System.out.println("Logo doesn't have alt text.");
        }

    }
    
    //Function 3
    public void search(String searchstring1, String searchstring2,String searchstring3)
    {
    	
    //Typing in search bar
    	
    	driver.findElement(searchElement).sendKeys(searchstring1);//tv
    	driver.findElement(backspaceElement).click();
    	driver.findElement(searchElement).sendKeys(searchstring3,Keys.ENTER);//LG
    	driver.findElement(searchElement).sendKeys(searchstring2,Keys.ENTER); //l
    	driver.findElement(continueShopping).click(); 	
    	
    }
    
    
    //Function 4
    public void pincodechange(String pincodestring)
    {
    //Pincode entering
    	driver.findElement(pincode).click();
    	driver.findElement(pincodebar).clear();
    	driver.findElement(pincodebar).sendKeys(pincodestring); //686531
    	driver.findElement(pincodeapply).click();
    
    }
    
    //Function 5
    public void store()
    {
    //store activities
    	driver.findElement(storeicon).click();
    	driver.findElement(allicon).click();
    	driver.findElement(place).click();
    	driver.findElement(placesubmit).click();
    	driver.findElement(loadmore).click();
    	driver.navigate().back();
    	driver.navigate().back();
    }
    
    //Function 5
    public void hoveringoncategories()
    {
    	//Hovering on All categories
    	WebElement movetoallcategory = driver.findElement(allcategories);
    	act.moveToElement(movetoallcategory).perform();
    	
    	
    	//Click on airconditioner
    	driver.findElement(airconditioner).click();
    	driver.navigate().back();
    	
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
    
    
    //Function 6
    public void offer()
    {
    	//click on offers
    	driver.findElement(offers).click();
    	driver.navigate().back();
    }
    
    //Function 7
   
    	
    	
    	
    	
    	
    }
    
   
