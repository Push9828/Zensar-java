import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<String> vs = new Vector<String>();
		
		vs.add("Pushkar ka vektor");
		vs.add("Hello");
		vs.add("World");
		vs.add("Sahil");
		vs.add("hello pushkar");
		vs.add("Pushkar");
		
		Iterator<String> itr = vs.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}