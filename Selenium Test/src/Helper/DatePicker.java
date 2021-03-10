package Helper;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePicker {

	WebDriver driver;
	@FindBy(xpath = "//tr/th[@class='datepicker-switch' and @colspan='5']")
	WebElement datepicker;

	@FindBy(xpath = "//tr/th[@class='datepicker-switch' and @colspan='5']")
	List<WebElement> datepicker1;

	@FindBy(id = "lblButton_D")
	WebElement daily;

	@FindBy(xpath = "//th[@class='prev']")
	List<WebElement> previous;

	@FindBy(xpath = "//th[@class='next']")
	WebElement next;

	@FindBy(xpath = "//td[@colspan='7']/span[@class='month']")
	List<WebElement> month;

	@FindBy(xpath = "//td[@colspan='7']/span[@class='year']")
	List<WebElement> year;

	@FindBy(xpath = "//td[@class='day']")
	List<WebElement> day;

	public void prev(int index) {

		WebElement ele = previous.get(index);

		ele.click();
	}

	public void select_date(String yearnum) {

		int count = datepicker1.size();
		for (int i = 0; i < count; i++) {

			WebElement ele = datepicker1.get(i);
			String DS = ele.getAttribute("innerHTML");
			if (DS.contentEquals(yearnum)) {

				ele.click();
				break;

			}
		}

	}

	public void select_year(String yearnum) throws Throwable

	{

		select_date("February 2020");
		Thread.sleep(100);
		select_date("2020");
		System.out.println("Cool blue");
		Thread.sleep(1000);
		prev(2);
		Thread.sleep(1000);

		int count = year.size();
		for (int i = 0; i < count; i++) {
			WebElement element = year.get(i);
			String DS = element.getAttribute("innerHTML");
			if (DS.contentEquals(yearnum)) {
				element.click();
				break;

			}

		}

	}
	public void select_month(String monthname)
	{
		int count=month.size();
		
		for(int i=0;i<count;i++)
		{
			WebElement ele=month.get(i);
			String DS=ele.getAttribute("innerHTML");
			
			if(DS.contentEquals(monthname))
			{
				ele.click();
				break;
				
			}
			
			
		}
		
		
		
	}
	
	public void select_day(String day1)
	{
		int count=day.size();
		
		for(int i=0;i<count;i++)
		{
			WebElement ele=day.get(i);
			String DS=ele.getAttribute("innerHTML");
			
			if(DS.contentEquals(day1))
			{
				ele.click();
				break;
				
			}
			
			
		}
		
		
		
	}

}
