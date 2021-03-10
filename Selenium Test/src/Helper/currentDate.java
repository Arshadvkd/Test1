package Helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class currentDate 

{static String  date1;
	
	
	public static String getcurrentdate()
	{
		
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 
		 
		 Date date = new Date();
		 
		 
		 date1= dateFormat.format(date);
		 return date1;
		 
	}
	
	
	public static String getcurrentdatetime()
	{
		
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T00:00:00'");
		 
		 
		 Date date = new Date();
		 
		 
		 date1= dateFormat.format(date);
		 return date1;
		 
	}

}
