package utilitiespkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class whitemartutilities {

	public static String getCellValue(String x1,String Sheet,int r,int c)
	{
		try
		{
			File f=new File(x1);
			FileInputStream file=new FileInputStream(f);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFCell cell=(XSSFCell) workbook.getSheet(Sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				
				return cell.getRawValue();
			}
		}
			catch(Exception e)
			{
				return "";
			}
		
	}
	
	public static int getRowCount(String x1,String Sheet)
	{
		try
		{
			File f=new File(x1);
			FileInputStream file=new FileInputStream(f);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			return workbook.getSheet(Sheet).getLastRowNum();
			
		}
		catch(Exception e)
		{
			return 0;
		}
	}


}