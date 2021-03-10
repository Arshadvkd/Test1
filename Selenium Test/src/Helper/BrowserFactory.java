package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory 

{ static  WebDriver driver;
	
	public static WebDriver StartBrowser(String BrowserName,String url) 
	{
		if(BrowserName.equalsIgnoreCase("Chomedriver"))
		{
			
		System.setProperty("webdriver.chrome.driver","D:\\Nahala\\FUN\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		
	}

}
