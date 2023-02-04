package pkg1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataByUsingScannerClassROwAndColumn 
{
	public static void main(String[] args) throws IOException
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Value of row no");
		int r=S.nextInt();
		System.out.println("Value of Column no");
		int c=S.nextInt();
		
		File f=new File("../ApachePoiAssignment/Public Name2.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook();
		XSSFSheet xt=xs.createSheet("Deepk");
		
		for(int i=0;i<r;i++)
		{
			XSSFRow xr=xt.createRow(i);
			for(int j=0;j<c;j++)
			{
				XSSFCell xc=xr.createCell(j);
			
					System.out.println("Please enter Data");
					String data=S.next();
					xc.setCellValue(data);
			}
		}
		xs.write(fo);
		fo.flush();
		fo.close();
		
	}

}
