package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyPaste 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../ApachePoiAssignment/Public Name.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xw=new XSSFWorkbook(fi);
		XSSFSheet xs=xw.getSheetAt(0);
		File f1=new File("../ApachePoiAssignment/Public Name2.xlsx");
		FileOutputStream fo=new FileOutputStream(f1);
		XSSFWorkbook xk=new XSSFWorkbook();
		XSSFSheet xt=xk.createSheet("Deep");
		
	int r=xs.getPhysicalNumberOfRows();
		for(int i=0;i<r;i++)
		{
			XSSFRow xr=xs.getRow(i);
			XSSFRow xr1=xt.createRow(i);
			int c=xr.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++)
			{
				XSSFCell xc=xr.getCell(j);
				XSSFCell xc1=xr1.createCell(j);
				String Cellvalue=xc.getStringCellValue();
				xc1.setCellValue(Cellvalue);
				}
				}
		xk.write(fo);
		fo.flush();
		fo.close();
		}

}

