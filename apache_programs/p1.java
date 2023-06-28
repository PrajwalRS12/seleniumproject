package apache_programs;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//program to read data from excel//
public class p1 {

	public static void main(String[] args) throws Throwable
	{
		//reads the data from excel//
		FileInputStream f1=new FileInputStream("./data/myexcel.xlsx");
		//creates the workspace in the memory//
		Workbook book = WorkbookFactory.create(f1);
		
		//reads the data from specified row and columns//
		String d = book.getSheet("demo").getRow(2).getCell(0).getStringCellValue();
		
		
		System.out.println(d);
		
	}
} 
