package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//	File src= new File("C:/Users/TYSS/Downloads/B.xlsx");
		FileInputStream fis= new FileInputStream("C:/Users/TYSS/Downloads/B.xlsx");
		//xsss load complete xl sheet(workbook)
	
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);// load the first sheet 0index
		//row count 
		int rowCount = sheet1.getLastRowNum();
		System.out.println(rowCount);
		
		for(int i=0;i<=rowCount;i++){
			String expected = sheet1.getRow(i).getCell(0).getStringCellValue();
			String actual = sheet1.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println("Row No"+i+"is:"+expected);
			System.out.println("Row No"+i+"is:"+actual);
			
			
		}
		
		
		
//		//which row u want to use
//		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
//		System.out.println("data from excel sheet: "+data);
//		String data1 = sheet1.getRow(1).getCell(0).getStringCellValue();
//		System.out.println("data from excel sheet: "+data1);
//		
		wb.close();
		

	}

}
