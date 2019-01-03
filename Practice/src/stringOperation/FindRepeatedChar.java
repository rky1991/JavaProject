package stringOperation;

public class FindRepeatedChar {
	
	static void duplicat(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}				
			}//nFor
			System.out.println(str.charAt(i)+"-->"+count);
			String d=String.valueOf(str.charAt(i));
			
			str=str.replaceAll(d, "");
			count=0;
		}//for	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rahulkumar";
		duplicat(str);
	}
}
