package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel 
{
	 HSSFWorkbook  wb;
	
	 HSSFSheet sheet1;
	
	 File src;
	
 public writeExcel(String excelpath) throws Exception 
	
	{
		src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
	    wb = new HSSFWorkbook(fis);
	}
    
	
	
 public  void  write(int index,int row,int column,String value) throws Throwable
	{
	   
	    sheet1 = wb.getSheetAt(index);
	    sheet1.getRow(row).createCell(column).setCellValue(value);
	    FileOutputStream fout = new FileOutputStream(src);
	    System.out.println("man"+fout); 
	    wb.write(fout);
	    wb.close();	
	  
	   
	}
	
	

}
