import java.util.*;

public class LLST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> lls = new LinkedList<String>();
		
		lls.add("Pushkar");
		lls.add("Hello");
		lls.add("World");
		lls.add("Sahil");
		lls.add("hello pushkar");
		lls.add("Pushkar");
		
		Iterator<String> itr = lls.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}