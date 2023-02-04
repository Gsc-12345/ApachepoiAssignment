package pkg1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData
{
	public static void main(String[] args) throws IOException
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Please enter data");
		String data = S.next();
		File f=new File("../ApachePoiAssignment/Public Name1.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook();
		XSSFSheet xt=xs.createSheet("Deepak");
		
		for(int i=0;i<5;i++)
		{
			XSSFRow xr=xt.createRow(i);
			for(int j=0;j<5;j++)
			{
				XSSFCell xc=xr.createCell(j);
				xc.setCellValue(data);
			}
		}
		xs.write(fo);
		fo.flush();
		fo.close();
		}

}
