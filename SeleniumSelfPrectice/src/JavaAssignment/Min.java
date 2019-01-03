package JavaAssignment;

import java.util.Scanner;
class LeastNo 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array [?] :");
		int size = s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Numbers into Array to find Least No :");
		int len=a.length;
		for (int i=0;i<len ;i++ )
		{
			a[i]=s.nextInt();
					
		
		}
		System.out.println("*********************");
		System.out.println("Entered numbers By you :");
		for (int i=0;i<len ;i++ )
		{
			System.out.println(a[i]);
		}
		System.out.println("*********************");
		System.out.println("Sorting under process ...!!!");
		System.out.println("*********************");
		int max=a[0];// supose 1st element is highest;
		int pos=1;// position of the highest no
		for (int i=1;(i<len)&&(pos==0) ;i++ )
		{
			if (a[i]<max)
			{
				max=a[i];
			}
			else if(a[i]==max)
			{
				pos=i;
			
			}
		}
		System.out.println("Least Number in your given number is :"+max);
		System.out.println("Position of that number is: "+pos);





	}
}
