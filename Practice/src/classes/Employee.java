package classes;

public class Employee {
	int empId;
	double empSalary;
	String empName;
	void work(){
		System.out.println("Emplyee"+this.empName+"should work on Automation");
	}
	
	//--------
	Employee(int empId,double empSalary,String empName){
		this.empId=empId;
		this.empSalary=empSalary;
		this.empName=empName;
	}
	

	public static void main(String[] args) {
		
		Employee ob=new Employee(101,23456.555,"Rahul");
		
		System.out.println("Emp id is :"+ob.empId);
		System.out.println("Emp Name is :"+ob.empName);
		System.out.println("Emp Salary is: "+ob.empSalary);
        
		Employee ob1=new Employee(102,26456.555,"Rahul Yadav");
		
		System.out.println("Emp id is :"+ob1.empId);
		System.out.println("Emp Name is :"+ob1.empName);
		System.out.println("Emp Salary is: "+ob1.empSalary);
		 
		

	}

}
