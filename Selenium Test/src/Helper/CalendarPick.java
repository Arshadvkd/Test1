package Helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarPick 
{
	 WebDriver driver;
	
	
	public CalendarPick(WebDriver ldriver)
	{
		this.driver= ldriver;
		
		
	}
	
	
	
	public  void select_date(String monthyear,String date)
	{
		
		
		WebElement month=driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		while(true)
		{
			
			if(month.getText().equalsIgnoreCase(monthyear))
			{
				break;
				
				
			}
			
			else
			{
				
				driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]")).click();
				
			}
			
		}
		
		
		List<WebElement> elements=driver.findElements(By.xpath("//table[@class=' table-condensed']//td"));
		
		int count=elements.size();
		for(int i=0;i<count;i++)
		{
		WebElement ele=elements.get(i);
		String DS=ele.getText();
		
		if(DS.contentEquals(date))
		{
			ele.click();
			break;
			
		}
			
			
		}
		
		
		
	}
	
	
	
	
	

}
