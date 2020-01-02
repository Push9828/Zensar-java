import java.util.Scanner;
public class loops {

	public static void forLoop() {
		System.out.println("Inside For Loop");
		for(int k=0;k<=5;k++)
		{
			System.out.println(k + "");
		}
	}
	
		public static void whileLoop()
		{
			System.out.println("Inside While Loop");
			int i = 0;
			while(i<=20)
			{
				i++;
				System.out.println(i + " ");
			}
		}
		
/*		public void doWhile()
		{
			System.out.println("Inside doWhile Loop");
			int i = 0;
			do {
				 i++;
				 System.out.println(i + "");
			   }while(i>10);
			
			
		
		}*/
	
	
	public static void main(String[] args) {
		int ch;
		do {
			System.out.println("1. For Loop\n 2.While\n 3.Exit\n Enter your choice");
			
			Scanner s = new Scanner(System.in);
			ch =  s.nextInt();
			
			switch(ch) {
			case 1: forLoop();
			 		break;
			 
			case 2: whileLoop();
					break;
			
			case 3: System.out.println("Exit");
					break;
					
			default: System.out.println("Invalid Choice");
			    	break;
			  
			}
		  }while(ch != 3);
	}

}
