import java.util.Scanner;

public class App {
	public static void main (String arg[]) throws InterruptedException{
		final Processor processor = new Processor();
		
		Thread t1 = new Thread (new Runnable () {
			public void run() {
				try {
					processor.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread (new Runnable () {
			public void run() {
				try {
					processor.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}


     

class Processor {
	public void produce () throws InterruptedException {
		synchronized(this) {
			System.out.println("Producer thread running...");
			wait();
			System.out.println("Producer thread Resumed :)");
		}
	}
	
	public void consume() throws InterruptedException{
		Scanner s = new Scanner(System.in);
		Thread .sleep(2000);
		
		synchronized (this) {
			System.out.println("Waiting for the return key :(");
			s.nextLine();
			System.out.println("Return key pressed :)");
			s.close();
			notify();
			Thread.sleep(5000);
		}
	}
}





