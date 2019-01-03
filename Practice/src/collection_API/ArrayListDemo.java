package collection_API;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		System.out.println(ls);
		ls.add(10);//boxing happen(Integer.valueOf(10);
		ls.add("rahul");
		System.out.println(ls);
		System.out.println(ls.size());
		
		//add new object at the last position of list
		ls.add(20);
		ls.add(40);
		ls.add(50);
		System.out.println(ls);
		System.out.println(ls.size());
		
		//add element at desired index
		ls.add(2,"yadav");
		ls.add(5,300);
		System.out.println(ls);
		System.out.println(ls.size());
		
		
		

	}

}
