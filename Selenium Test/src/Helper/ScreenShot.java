package Helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShot 
{

	public static void takescreenshot(WebDriver driver,String filename)
	{
		
		try {
			TakesScreenshot ts	=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src,new File("./screenshots/"+filename+".png"));
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}
	
	
	
	
}
