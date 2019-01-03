package readExcel;

import java.io.FileInputStream;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelDemo {

	public static void main(String[] args)throws Exception {
		//open xl file(workbook)
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook w = WorkbookFactory.create(fis);//create space in RAM for file  
		//go to sheet1--> 1st row,1st column
		Cell c = w.getSheet("sheet1").getRow(0).getCell(0);
		
		//get value present in cell and print it
		String v = c.getStringCellValue();
		System.out.println(v);
		
		//row count - counting starts from 0
		int rc = w.getSheet("sheet1").getLastRowNum();
		System.out.println(rc);
		
		//cell count-- counting start form 0;
		int cc = w.getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(cc);
		
		//close the file
		w.close();
		
		

	}

}
