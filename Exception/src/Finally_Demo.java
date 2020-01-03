
public class Finally_Demo {

	 static void procA()
	 {
		 try
		 {
			 System.out.println("In procA");
		 }
		 
		 //catch(Exception e){}
		 
		 finally
		 {
			 System.out.println("In finallly bloack of procA");
		 }
		 
	 }	
	 

	 static void procB()
	 {
		 try
		 {
			 System.out.println("In procB");
		 }
		 
		 //catch(Exception e){}
		 
		 finally
		 {
			 System.out.println("In finallly block of procB");
		 }
		 
	 }	
	 static void procC()
	 {
		 try
		 {
			 System.out.println("In procC");
		 }
		 
		 //catch(Exception e){}
		 
		 finally
		 {
			 System.out.println("In finallly block of procC");
		 }
		 
	 }	
	public static void main(String[] args) {
		
			 try
			 {
				 System.out.println("Welcome In main function");
				 procA();
				 procC();
			 }
			 
			 catch(Exception e)
			 {
				 System.out.println("In the catch block of main");
			 }
			 
			 finally
			 {
				 System.out.println("In finally block of main");
			 }
			 
			 procB();
			 procC();			 
			 
		 }	
			
	}
