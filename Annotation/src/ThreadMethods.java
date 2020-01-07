class A extends Thread{
	public void run(){
		for (int i=1;i<=5;i++){
			yield();
			System.out.println("\t From Thread A: i="+i);
		}
		System.out.println("\t Exit from Thread A");
	}
}

class B extends Thread{
	public void run(){
		for (int j=1;j<=5;j++){
			System.out.println("\n From Thread B: J="+j);
			if(j==3)
				stop();
		}
		System.out.println("\t Exit from Thread B");
	}
}

class C extends Thread{
	public void run(){
	for (int k=1;k<=5;k++){
		//yield();
		System.out.println("\t From Thread C: i="+k);
		if (k==1)
			try{
				sleep(1500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}
	
	System.out.println("\t Exit from Thread C");
	}
}

class ThreadMethods{
	public static void main(String[] args){
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
		
		System.out.println("\n Start Thread A");
		threadA.start();
		System.out.println("\n Start Thread B");
		threadB.start();
		System.out.println("\n Start Thread C");
		threadC.start();
		
		System.out.println("\n End of the Main Thread");
	}
}









