package array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,20,30,49};
		int b[]=new int[a.length];
		for(int i=0,j=0;i<a.length;i++,j++){
			b[j]=a[i];	
		}
//		for(int i =0; i<a.length;i++){
//			for(int j=i;j<b.length;j++){
//				b[j]=a[i];
//			}
//		}
		for(int i=0;i<b.length;i++){
			
			System.out.println(b[i]);
		}
		System.out.println(Arrays.toString(b));

	}

}
