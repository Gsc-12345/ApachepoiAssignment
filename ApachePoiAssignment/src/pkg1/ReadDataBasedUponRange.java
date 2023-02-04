package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataBasedUponRange
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("../ApachePoiAssignment/Public Name.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook(fi);
		XSSFSheet xt=xs.getSheetAt(0);
		int initialrow=0;int endrow=5;
	
		int r=xt.getPhysicalNumberOfRows();
		for(int i=0;i<endrow;i++)
		{
			
			if(i>=initialrow)
			{
			XSSFRow xr=xt.getRow(i);
			
			int c=xr.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++)
			{
				 XSSFCell xc = xr.getCell(j);
				    System.out.println(xc.getStringCellValue());
			
			}
			}
		}
	}
}
