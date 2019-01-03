package readExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class TestCaseCount {
	// write result in to xl sheet
	public static void  writeResultToXl(String path,int passCount,int failCount) {
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			w.getSheet("sheet1").getRow(1).getCell(0).setCellValue(passCount);
			w.getSheet("sheet1").getRow(1).getCell(1).setCellValue(failCount);
			w.write(new FileOutputStream(path));
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	@Test
	public void testA() {
		TestCaseCount.writeResultToXl("./data/Book1.xlsx", 7, 3);
		
		
	}

}
