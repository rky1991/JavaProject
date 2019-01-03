package number;

import java.util.Scanner;

public class RevereseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to Reverse Operetion:");
		int num = sc.nextInt();
		int lastNo=0;
		int revNo=0;
		while(num!=0){       // or (num>0)
			lastNo=num%10;   //--> num%10--> give last digit
			revNo= revNo*10+lastNo;//-->revrse the num;
			num=num/10;//remove the last digit from given num;
		}
		System.out.println(revNo);
		

	}

}
