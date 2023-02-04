package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataBasedUponRowNoAndColumnNo 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Plase enter Value r");
		int r=S.nextInt();
		System.out.println("Please enter value c");
		int c=S.nextInt();
		
		File f=new File("../ApachePoiAssignment/Public Name.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook(fi);
		XSSFSheet xt=xs.getSheetAt(0);
		
		int r1=xt.getPhysicalNumberOfRows();
		XSSFRow xr=xt.getRow(r);
		int c1=xr.getPhysicalNumberOfCells();
		XSSFCell xc=xr.getCell(c);
		System.out.println(xc.getStringCellValue());
	}

}
