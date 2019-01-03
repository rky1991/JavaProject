package readExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadBook2Data {
	
	
	public static void main(String arg [])throws Exception {
		FileInputStream fis=new FileInputStream("./data/Book2.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		 int rc = w.getSheet("sheet2").getLastRowNum();
		for(int i=0;i<=rc;i++) {
			
			int cc = w.getSheet("sheet2").getRow(i).getLastCellNum();
			
			for(int j=0;j<cc;j++) {
				Cell value = w.getSheet("sheet2").getRow(i).getCell(j);
				System.out.print(value +"  ");
				
			}
			System.out.println();
			
		}
		
	}

}
