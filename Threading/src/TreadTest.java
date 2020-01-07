// Extending from Thread class



	class A extends Thread
		{
			public void run()
			{
				for(int i=0;i<=5;i++)
				{
					System.out.println("t From Thread A : i = "+i);
				}
				System.out.println("Exit from A");
			}
		}
	class B extends Thread
	{
		public void run()
		{
			for(int j=0;j<=5;j++)
			{
				System.out.println("t From Thread B : j = "+j);
			}
			System.out.println("Exit from B");
		}
	}

		class C extends Thread
		{
			public void run()
			{
				for(int k=0;k<=5;k++)
				{		
				System.out.println("t From Thread C : k = "+k);
				}
				System.out.println("Exit from C");
			}
		}
		public class TreadTest
		{
			public static void main(String[] args)
			{
				A threadA = new A();
				threadA.start();
				B threadB = new B();
				threadB.start();
				C threadC = new C();
				threadC.start();
			}

		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			