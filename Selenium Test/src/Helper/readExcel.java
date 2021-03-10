package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class readExcel 

{
	
	 
	HSSFWorkbook wb;
	
	HSSFSheet sheet1;
	public readExcel(String excelpath) throws Exception 
	
	{
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		 wb = new HSSFWorkbook(fis);
	}
	
	public String readdata(int index,int row,int column)
	{
		
		sheet1 = wb.getSheetAt(index);	
	
	    String data =sheet1.getRow(row).getCell(column).getStringCellValue();
	    return data;
		
	}
	
	public int readnumber(int index,int row,int column)
	{
		
		sheet1 = wb.getSheetAt(index);	
	
	    int data =(int) sheet1.getRow(row).getCell(column).getNumericCellValue();
	    return data;
		
	}
	
	
	public int getlastrow(int index)
	{
		
	  int count= wb.getSheetAt(index).getLastRowNum();
	  return count;
		
	}
	
	

}
