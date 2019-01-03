package generic;

public class ReadXlDataCon {
	
public static void main(String[] args) {
	
	ReadXLData ob =new  ReadXLData("C:/Users/TYSS/Downloads/B.xlsx");
      
	
	String data = ob.getXLData(0, 1, 0);
	System.out.println(data);

}

}
