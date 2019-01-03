package exceptionHandle;

public class Demo {

	public static void main(String[] args) {
		int a[]=new int [2];
		try{
			int b=9/0;
		}
		
		catch (ArithmeticException e) {
			System.out.println("exception 1");
		}
		
		try{
			a[3]=6;
			
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception 2");
		}
		
		
		System.out.println("hello exception handled");

	}

}
