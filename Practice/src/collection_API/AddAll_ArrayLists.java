package collection_API;

import java.util.ArrayList;

public class AddAll_ArrayLists {

	public static void main(String[] args) {
	//addAll() simply add two lists 
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(50);
		System.out.println(ls);
		
		ArrayList ls1=new ArrayList();
		ls1.add(44);
		ls1.add(23);
		ls1.add(54);
		System.out.println(ls1);
		
		//add two lists ls1+ls
		ls1.addAll(ls);
		System.out.println(ls);
		System.out.println(ls1);
		
		
		

	}

}
