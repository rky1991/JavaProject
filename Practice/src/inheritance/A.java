package inheritance;
// super class of B
public class A {

   A(){
	   
	   System.out.println("from class A()");
	 
      } 
   A(int i){
	   
	   System.out.println("from class A(int)"+i);
	 
      }
    
   A(double d){
	   
	   System.out.println("from class A(double)"+d);
	 
      }
    
   A(String s ,int a){
	   
	   System.out.println("from class A(String ,int)"+s+ ""+a);
	 
      }

}
