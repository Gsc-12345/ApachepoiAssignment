package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataParticularColumns 
{
	public static void main(String[] args) throws IOException
	{
	File f=new File("../ApachePoiAssignment/Public Name.xlsx");
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook xs=new XSSFWorkbook(fi);
	XSSFSheet xt=xs.getSheetAt(0);
	
	int r=xt.getPhysicalNumberOfRows();
	for(int i=0;i<r;i++)
	{
		XSSFRow xr=xt.getRow(i);
		int c=xr.getPhysicalNumberOfCells();
		XSSFCell xc=xr.getCell(4);                      //ParticularCell
	    System.out.println(xc.getStringCellValue());     // particular cell=type cell No-1
		}
	}
}
