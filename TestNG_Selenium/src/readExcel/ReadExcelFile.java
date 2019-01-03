package readExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {
	
	public static void main(String arg[]) throws Exception{
		// write script to print the content of excel sheet
		Workbook w = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		int rc = w.getSheet("sheet1").getLastRowNum();
		for(int i=0;i<=rc;i++) {
			int cc=w.getSheet("sheet1").getRow(i).getLastCellNum();
			for(int j=0;j<cc;j++) {
				String v=w.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
	}

}
