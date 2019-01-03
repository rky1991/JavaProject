package pattern;

public class StarPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++){
			for(int j=3;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
				
			}
			System.out.println();
		}//outer for
		
		/*   ****
		 *   -***
		 *   --**
		 *   ---*
		 * 
		 */
		System.out.println("+++++++++++++++++");
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
				
			}
			for(int k=4;k>=i;k--){
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		

	}//main

}//class
