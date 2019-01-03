package classes;

 class Login{
	 private String userName;
	 private String password;
	 
	  void clickLogin(){
		 
		 System.out.println("Home page should be display :");
	 }
	 
	  public void setUserName(String userName){
		  this.userName=userName;
		  
	  }
	  public void setPassword(String password){
		  this.password=password;
		  
	  }
	  
	  public String getUserName(){
		  return userName;
		  
	  }
	  public String getPassword(){
		  return password;
		  
	  }
	 
	
}


public class DataHiding {
	public static void main(String arg[]){
		Login ob=new Login();
		
		ob.setUserName("rahul123");
		ob.setPassword("rahul@1234");
		
		String un = ob.getUserName();
		String pw = ob.getPassword();
		
				System.out.println(un);
		        System.out.println(pw);
		        ob.clickLogin();
		
	}

}
