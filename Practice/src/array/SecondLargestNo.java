package array;

public class SecondLargestNo {
	public static int sLargest(int a[]){
        int size=a.length;
        int temp;
		for(int i=0;i<size;i++){	
			for(int j=i+1;j<size;j++){
				if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;		
				}//if block
		  }//nested for loop
		}//outer for loop
		return a[size-2];
	}
	public static void main(String[] args) {
		int a[]={1,9,5,8,3,18};
		int slEle = sLargest(a);
		System.out.println(slEle);	
	}

}
