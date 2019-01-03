package inheritance;

public class Super1Dr extends Super1 {
	int i=80;

	Super1Dr(){
		super();// super calling St. to call the super1 class no argument constructor
		System.out.println("from super1Dr constructor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main:");
		Super1Dr ob= new Super1Dr();
		System.out.println(ob.i);//80
		System.out.println(ob.j);//90
		System.out.println(ob.k);//10
		System.out.println(k);//10
		

	}

}
