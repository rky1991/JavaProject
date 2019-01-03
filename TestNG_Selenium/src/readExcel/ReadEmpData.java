package readExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadEmpData {

	public static void main(String[] args) throws Exception{
		//open xl file , creating fileInputStream constructor
		FileInputStream fis=new FileInputStream("./data/Book2.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		
		//go to the excel sheet row 0 cell 0
		Cell c = w.getSheet("sheet2").getRow(0).getCell(0);
		
		
		//get the value present in cell
		String values=c.getStringCellValue();
		System.out.println(values);
		
		//row count 
		int rc = w.getSheet("sheet2").getLastRowNum();
		System.out.println(rc);
		//column count
		short cc = w.getSheet("Sheet2").getRow(0).getLastCellNum();
		System.out.println(cc);
		w.close();

	}

}
