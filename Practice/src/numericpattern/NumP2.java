package numericpattern;

public class NumP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=i;j++){
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}

	}

}
