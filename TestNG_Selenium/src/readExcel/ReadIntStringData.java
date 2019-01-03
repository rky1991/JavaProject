package readExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadIntStringData {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		  Workbook w=WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		  Cell c1 = w.getSheet("sheet1").getRow(1).getCell(0);
		  Cell c2 = w.getSheet("sheet1").getRow(1).getCell(1);
		  String v=c1.toString();
		  String v2=c2.toString();
		  System.out.println(v);
		  System.out.println(v2);
		  
	//Note: To read data from cell of xl sheet we can use toString(),it works on 
    // any type of cell (i.e cell may contain string, number,date..)
		  //to get number from cell without .0specify 'at the begning
		 

	}

}
