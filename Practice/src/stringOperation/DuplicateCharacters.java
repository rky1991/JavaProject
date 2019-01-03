package stringOperation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// using has map;
public class DuplicateCharacters {
	static void charCount(String str){
	// creating a hasmap containing "characters" as 'KEY' and "occurance" as 'VALUE';
		HashMap<Character, Integer> charCountMap= new HashMap<>();
	//converting given string in to "CHAR ARRAY";
		char[] strArray=str.toCharArray();
    //checking  each char of strArray
		for(char c :strArray ){
			if(charCountMap.containsKey(c)){
				//if character is present in charCountMap increment char count by 1;
				charCountMap.put(c,charCountMap.get(c)+1);
			}//if
			else{
				// if char is not present in charCountMap,puting this char to charCountMap with 1 as its value
				charCountMap.put(c, 1);
			}
		}//for
	//printing the charCountMap , entrySet gives set view 
		for(Map.Entry entry: charCountMap.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}//charcount

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String to count the Duplicate Characters:");
		String str=scan.nextLine();
		charCount(str);

	}

}
