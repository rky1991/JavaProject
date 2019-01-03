package classes;


class A{
	int i=10;
	static int j=20;
	void test(){
		System.out.println("From class A non static method :");
		
	}
	static void test1(){
		System.out.println("From class A static method :");
	}
	
}

class B{
	int x=90;
	static int y=18;
	void test(){
		System.out.println("From class B non static method :");
	}
	static void test1(){
		System.out.println("From class B static method :");
	}
	
}

public class MultipleClasses {

	int h=89;
	static int i=80;
	void test(){
		System.out.println("From MAIN class non static method :");
	}
	static void test1(){
		System.out.println("From MAIN class static method :");
	}
	public static void main(String[] args) {
	  	
		MultipleClasses ob=new MultipleClasses();
		System.out.println(ob.h);
		System.out.println("static i call using obj--> "+ob.i);
		System.out.println("static i-->"+i);
		ob.test();
		test1();
		ob.test1();
		
		System.out.println("******************************");
		
		A ob1=new A();
		System.out.println(ob1.i);
		System.out.println("static i call using obj-> "+ob1.j);
		System.out.println("static i->"+A.j);
		ob1.test();
		test1();
		ob.test1();
		
        System.out.println("******************************");
		
		B ob2=new B();
		System.out.println(ob2.x);
		System.out.println("static i call using obj-> "+ob2.y);
		System.out.println("static i ->"+B.y);
		ob2.test();
		test1();
		ob.test1();
		
		

	}

}
