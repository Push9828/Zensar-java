import java.util.*;

public class Kyueu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> kyu = new LinkedList<>();
		
		for(int i = 0; i < 5; i++)
			kyu.add(i);
		
		System.out.println("Elements of queue: " + kyu);
		
		int removedele = kyu.remove(); //removes and returns the head of queue
		System.out.println("Removed element : " + removedele);
		
		System.out.println(kyu);
		
		System.out.println("Head of queue: " + kyu.peek()); //returns the head of the queue
		
		System.out.println("Size of queue : " + kyu.size());
		
		

	}

}
