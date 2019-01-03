package HsJavaNotes;

import java.util.Arrays;
public class BubbleSorting {
	public static void bubbleSort(int [] arr){
		int temp;// holding variable for swaping
		//for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}//if
			}//inner for
		//}//outer for
	}//bubleSort
	public static void main(String[] args) {
		int arr[]={59,54,45,78,12,10,5};
		System.out.println("Orginal Array Before Sort: "+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Modified Array After Sort: "+Arrays.toString(arr));
	

	}

}
