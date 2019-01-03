package array;

public class ReverseAtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,30,40,50,79};
		int b[]=new int[a.length];
		for(int i=0, j=a.length-1;i<a.length;i++,j--){
			b[j]=a[i];
		}
		System.out.println("stored in reverse order");
		for(int i=0;i<a.length;i++){
			System.out.println(b[i]);
		}

	}

}
