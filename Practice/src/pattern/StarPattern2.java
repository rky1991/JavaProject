package pattern;

public class StarPattern2 {
	public static void main(String arg[]){
		
	
	for(int i=1; i<=4;i++){

		for(int j=1;j<=i;j++){
			System.out.print("*");
			
		}
		System.out.println();
	}
	// this for loop for reverse the star pattern
	for(int i=1; i<=4;i++){

		for(int j=3;j>=i;j--){
			System.out.print("*");
			
		}
		System.out.println();
	}

}
}