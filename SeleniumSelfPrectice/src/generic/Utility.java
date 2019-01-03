package generic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {

	
	public static String getXLData(String path,String sheet,int r,int c) {
		String v="";
		try {
			Workbook w=WorkbookFactory.create(new FileInputStream(path));//open xl file
			v=w.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return v;
		
	}
	
	//***********************************************************
	
	//it called in Result(Listener)class inonFinish method to update pass and fail count
		public static void writeResultToXl(String path,String Sheet,int pass,int fail) {
			try {
				Workbook w=WorkbookFactory.create(new FileInputStream(path));
				w.getSheet("sheet1").getRow(1).getCell(0).setCellValue(pass);
				w.getSheet("sheet1").getRow(1).getCell(1).setCellValue(fail);
				w.write(new FileOutputStream(path));
						
			}
			catch(Exception e) {
				e.printStackTrace();
			}	
		
		}
		
	//***********************************************************
		// this method return the row count of specific(path based) file
		public static int getXLRowCount(String path,String sheet) {

			int count =0;
			try {
				Workbook w=WorkbookFactory.create(new FileInputStream(path));
				count=w.getSheet(sheet).getPhysicalNumberOfRows();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return count;
		}
		
		
		//****************************************
		
	


	
	
	
//********************************************************************
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		String path="./Data/B.xlsx";
//		FileInputStream fs = new FileInputStream(path);
//		Workbook wb = WorkbookFactory.create(fs);
//		String data = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//		System.out.println(data);
//		Row rows = wb.getSheet("Sheet1").getRow(0);
//		

	}


