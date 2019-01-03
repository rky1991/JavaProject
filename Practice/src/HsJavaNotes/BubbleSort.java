package HsJavaNotes;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[]={10,2,70,5,19};
		int temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
//		System.out.println("Orginal Array Before Sort: "+Arrays.toString(a));
		

	}

}
