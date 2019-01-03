package Asig;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class MyRobot {
	
	public static void main(String [] arg) throws Exception {
	
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_I);
		
		
	}

}
/*	Robot r=new Robot();
for(int i=1;i<=500;i=i+10) {
	r.mouseMove(200+i, 150);
	Thread.sleep(500);
	
	
	
}
*/