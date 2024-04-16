package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import basepkg.whitemartbase;
import pages.whitemartpages;
import utilitiespkg.whitemartutilities;




public class whitemarttests extends whitemartbase {
	
	@Test
	public void methodcalling() throws Exception
	{
		whitemartpages ob=new whitemartpages(driver);
		ob.browserhandle();
		ob.notificationhandle();
		ob.title();
		ob.logoDisplayAlt();
		ob.text();
		ob.link_display();
		ob.link_validation();
		ob.content();
		
		String x1="D:\\sel/whitemartlogin.xlsx";
		String Sheet="Sheet1";
		int rowCount=whitemartutilities.getRowCount(x1, Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			Thread.sleep(3000);
			String username=whitemartutilities.getCellValue(x1, Sheet, i, 0);
			System.out.println("username==="+username);
			String password=whitemartutilities.getCellValue(x1, Sheet, i, 1);
			System.out.println("password==="+password);
			ob.login(username, password);
	   }
		
		ob.text_entering();
		ob.refreshing();
		ob.hoveringoncategories();
		ob.doubleclicking();
		ob.waiting();
		ob.backward();
		ob.scrolldown();
		ob.screenshot("D:\\sel/escreenshot.png","D:\\sel/pscreenshot.png");
		ob.scrollupanddown();
		
	}
	
	
	@AfterTest
	public void closing()
	{
		driver.quit();
	}

}
