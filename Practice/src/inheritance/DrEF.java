package inheritance;

public class DrEF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E ob=new F();//converting F (sub) class ref variable in to E(super)
		System.out.println(ob.i);//super class access
		//System.out.println(ob.x); //can not access F class members
		System.out.println(ob.j);
		ob.test();
		ob.test1();
		

	}

}
