package inheritance;

public class B extends A{

	   B(){
		   this (10);// use to call the same class constructor, call B class (int) constructor
		   System.out.println("from class B()");
		 
	      } 
	   B(int i){
		   this(10.30);// it will call super class (int ) constructor
		   
		   System.out.println("from class B(int)"+i);
		 
	      }
	    
	   B(double d){
		   this("rahul",20);
		   
		   System.out.println("from class B(double)"+d);
		 
	      }
	    
	   B(String s ,int a){
		   //super("rahul yadav",29);
		   
		   System.out.println("from class B(String ,int)"+s+ ""+a);
		 
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main()");
		
		B ob =new B();
		
		

	}

}
