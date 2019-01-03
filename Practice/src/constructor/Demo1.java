package constructor;

public class Demo1 {
	
	int i=10;
	int j=20;
	static int js=90;
	
     Demo1(int i,int j){
    	 System.out.println("i="+i+"j="+j);// 30,50
    	 i=400;//re intilize constructor value 30 replace by 400
    	 j=500;//re intilize constructor value 50 replace by 500 
    	 System.out.println("i="+i+"j="+j);//print update value ,400,500
    	 this.i=1000;
    	  this.j=2000;
    	 System.out.println("i="+i+"j="+j);// updated value of non static valriable in obj
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Main begins : ");
		 int i=30;
		 int j=50;
		 Demo1 ob =new Demo1(i,j);
		 System.out.println("i="+i+"j="+j);// local main() i,j value will print 30,50
		 
		 System.out.println("i="+ob.i+"j="+ob.j);//non static variable value direct from object
		 
		 

	}

}
