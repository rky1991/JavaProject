package constructor;
//constructor overloading 
 public class A {
	  
	 int i=1;
	   
	 A(){
		System.out.println("NO-Argument Constructor");
	    }
	
      A(int i){
    	  System.out.println("One -Argument constructor");
    	  System.out.println("i="+i);
		
	     }
      A(String name, int age ){
  		System.out.println("Two- Argument Constructor");
  		System.out.println("Name is :"+name);
  		System.out.println("Age is :"+age);
       	}
	
}

    class B {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		System.out.println(ob.i);
		A ob1=new A(10);
		System.out.println(ob1.i);
		A ob2=new A("rahul",28);
		System.out.println(ob2.i);
		

	}

}
