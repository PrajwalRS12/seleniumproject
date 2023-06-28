package apache_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//program to write the data into a new cell//
public class p3 {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream f1=new FileInputStream("./data/myexcel.xlsx");
		
		Workbook book = WorkbookFactory.create(f1);
		
		//read the data from the  specified sheet,row,cell//
		 book.getSheet("demo").createRow(0).createCell(1).setCellValue("njgf");
		
		
		
		
		//writes the data into the excel//
		FileOutputStream f2 = new FileOutputStream("./data/myexcel.xlsx");
		
		
		book.write(f2);
	}
}
