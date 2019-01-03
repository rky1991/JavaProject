package collection_API;

import java.util.ArrayList;

public class Nested_AL {

	public static void main(String[] args) {
		 
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(30);
		System.out.println(ls);
		
		ArrayList ls1=new ArrayList();
		ls1.add('b');
		ls1.add('c');
		System.out.println(ls1);
		
		ls1.add(ls);
		System.out.println(ls1);
		System.out.println(ls1.size());
		
		//passing list(ls1) as an argument in arrayList constructor(ls)
		
		ArrayList ls2=new ArrayList(ls1);
		ls2.add(90);
	    System.out.println(ls2);
		System.out.println(ls2.size());
		
		
		
		

	}

}
