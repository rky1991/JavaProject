package frame;

public class A {
	String s;
	void test() {
		System.out.println(s);
	}
	A(){
	B.testB(this);
	}

}
