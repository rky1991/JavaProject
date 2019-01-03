package frames;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A ob=new A(4);
		int v = ob.getValue();
		System.out.println(v);
		System.out.println(ob.getValue());
		//System.out.println(ob.i);//privete member cant access directly
		A ob1=new A(5);
		System.out.println(ob1.getValue());

	}

}
