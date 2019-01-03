package array;

public class CopyNReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,30,50,60,70};
		int b[]=new int[a.length];
		for(int i=0,j=0;i<a.length; i++,j++){
			b[j]=a[i];
		}
		for(int i=0;i<a.length;i++){
			System.out.println(b[i]);
		}
		
		System.out.println("in reverser= order");
		
		//for reverse 
		for(int i=a.length-1;i>=0;i--){
			System.out.println(b[i]);
		}

	}

}
