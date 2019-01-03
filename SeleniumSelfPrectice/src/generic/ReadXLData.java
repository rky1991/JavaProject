package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLData {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ReadXLData(String excelPath){
		try {
			FileInputStream fis= new FileInputStream(excelPath);
			wb=new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(0);// load the first sheet 0index
		}//try 
		catch (Exception e) {
		
				e.printStackTrace();
		
		}//catch
		
	}// constructor
	
	
	public String getXLData(int sheetNo,int row,int column){
		
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}

}
