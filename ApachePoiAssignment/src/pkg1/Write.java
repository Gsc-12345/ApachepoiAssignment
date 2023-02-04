package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("../ApachePoiAssignment/Public Name.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook(fi);
		XSSFSheet xt=xs.getSheetAt(0);
		
		File f1=new File("../ApachePoiAssignment/Public Name2.xlsx");
		FileOutputStream fo=new FileOutputStream(f1);
		XSSFWorkbook xk=new XSSFWorkbook();
		XSSFSheet xt1=xk.createSheet("Radhye");
		
		int r=xt.getPhysicalNumberOfRows();
		for(int i=0;i<r;i++)
		{
			XSSFRow xr=xt.getRow(i);
			XSSFRow xr1=xt1.createRow(i);
			int c=xr.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++)
			{
				XSSFCell xc=xr.getCell(j);
				XSSFCell xc1=xr1.createCell(1);       //when we want write any Particular cell then give cell Number
				String xc2=xc.getStringCellValue();
				xc1.setCellValue(xc2);
			}
		}
		xk.write(fo);
		fo.flush();
		fo.close();
		
		
	}

}
