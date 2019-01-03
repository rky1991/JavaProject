package qsp;
import java.awt.Robot;
public class MyRobot {
	
	public static void main(String [] arg) throws Exception {
		Robot r=new Robot();
		for(int i=1;i<=500;i=i+10) {
			r.mouseMove(200+i, 150);
			Thread.sleep(1000);
			
			
			
		}
		
		
	}

}
