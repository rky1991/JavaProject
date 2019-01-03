package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws Exception{
		 Workbook w = WorkbookFactory.create(new FileInputStream("./data/Book3.xlsx"));
		 Cell c = w.getSheet("Sheet2").getRow(0).getCell(0);
		 c.setCellValue("Qspiders");
		 //if path is same it is save 
		 w.write(new FileOutputStream("./data/Book3.xlsx"));
		 // if path is diff it same as save as
		 System.out.println("done");

	}

}
