package stringOperation;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rahul kumar";
		Map<Character, Integer> charCount= new HashMap<>();
		for(int i=0;i<s.length();i++){
			char c= s.charAt(i);
			if(charCount.containsKey(c)){
				int count=charCount.get(c);//give key
				charCount.put(c, ++count);
			}//if
			else
				charCount.put(c, 1);
		}//for

		System.out.println(charCount.entrySet());
		
	}//main

}
