package constructor;

public class Demo {
	
	int i=10;// non static variable
	Demo(int i){
		System.out.println("Paramatrize constructor");
		System.out.println(i);//200
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method :");
		int i=200;
		Demo ob=new Demo(i);
		System.out.println(ob.i);//10

	}

}
