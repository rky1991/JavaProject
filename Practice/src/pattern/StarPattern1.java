package pattern;
/*patter 1:
 * 
 *  1 *
 *  2 **
 *  3 ***
 *  4 ****
 */
public class StarPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------*********------------");
		for(int k=1;k<=4;k++ ){
			for(int l=4;l>=k;l--){
				System.out.print("*");
			}
			System.out.println();
			
			
		}

	}

}
