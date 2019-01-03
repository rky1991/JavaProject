package collection_API;

import java.util.ArrayList;

public class Get_ArrayList {

	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(100);
		ls.add(30);
		ls.add("rahul");
		ls.add("yadav");
		System.out.println(ls);
		
		// get the object of specific position
		String ob_data = (String)ls.get(2);
		Object ob_data1 = ls.get(3);
		System.out.println(ob_data);
		System.out.println(ob_data1);
		int a = (Integer)ls.get(1);
		System.out.println(a);
		
		
		

	}

}
