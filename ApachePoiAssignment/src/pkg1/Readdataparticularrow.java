package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdataparticularrow
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../ApachePoiAssignment/Public Name.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook(fi);
		XSSFSheet xt=xs.getSheetAt(0);
		
		int r=xt.getPhysicalNumberOfRows();
            XSSFRow xr=xt.getRow(5);              //Particular Row
			int c=xr.getPhysicalNumberOfCells();    //particular Row=type row No-1
			for(int j=0;j<c;j++)
			{
				XSSFCell xc=xr.getCell(j);
				System.out.println(xc.getStringCellValue());
			}
	}
}
