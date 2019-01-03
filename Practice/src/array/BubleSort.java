package array;

import java.util.Arrays;

public class BubleSort {
	// suppose size of an array is 'n', we required n-1 pass to sort an array;
	public static void bSort(int ar[]){
		int size=ar.length;
		int temp;
		for(int i=0;i<size;i++){
			for(int j=1;j<size-i;j++){
				if(ar[j-1]>ar[j]){
				temp=ar[j-1];
				ar[j-1]=ar[j];
				ar[j]=temp;
				}
			}//nfor
		}//fort5
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={3,5,1,6,3,88,98,32};
		bSort(ar);
		System.out.println(Arrays.toString(ar));
		for(int i=0;i<ar.length;i++){
		System.out.println(ar[i]);
		}

	}

}
