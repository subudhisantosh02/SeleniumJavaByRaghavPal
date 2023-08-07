package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath=System.getProperty("user.dir");
	
	static XSSFWorkbook wb;
	static XSSFSheet ws;
	
	public ExcelUtils(String Excelpath,String sheetName)
	{
		try {
        String projectPath=System.getProperty("user.dir");
		
		wb=new XSSFWorkbook(Excelpath);
		ws=wb.getSheet(sheetName);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		getRowCount();
		//getCellData(1,0);
	}
	
	public static int getRowCount()
	{
		int rowcount=0;
		try {
		//int rowcount=ws.getPhysicalNumberOfRows()-1;
		 rowcount=ws.getLastRowNum()-ws.getFirstRowNum();
		
		//System.out.println("no of rows:-"+rowcount);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return rowcount;
		
	}
	
	public static int getColumnCount()
	{
		int colcount=0;
		try {
		//int rowcount=ws.getPhysicalNumberOfRows()-1;
		colcount=ws.getRow(1).getPhysicalNumberOfCells();
		
		//System.out.println("no of cloumns:-"+colcount);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return colcount;
		
	}

	public static  String getCellStringData(int rownum,int colnum) {
		String username=null;
		 try {
			 
			username=ws.getRow(rownum).getCell(colnum).getStringCellValue();
			//double pwd=ws.getRow(rownum).getCell(colnum).getNumericCellValue();
			//String pwd=ws.getRow(rownum).getCell(colnum).getStringCellValue();
		//	System.out.println(username);
		//	System.out.println(pwd);
		 } catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		return username;
		
	}
	
	public static  double getCellNumericData(int rownum,int colnum) {
		double pwd=0;
		 try {
			//String Username=ws.getRow(rownum).getCell(colnum).getStringCellValue();
			pwd=ws.getRow(rownum).getCell(colnum).getNumericCellValue();
			//String pwd=ws.getRow(rownum).getCell(colnum).getStringCellValue();
			//System.out.println(Username);
		//	System.out.println(pwd);
		 } catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
		return pwd;
	}
		
	
}
