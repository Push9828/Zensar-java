import java.util.*;

public class TressSet {

	public static void main(String[] args) {
		
		TreeSet<String> al = new TreeSet<String>();
		al.add("Hello");
		al.add("World");
		al.add("Welcome");
		al.add("After");
		al.add("WW3");
		
		System.out.println("Initial Set: " + al);
		System.out.println("Head Set:" + al.headSet("Hello"));
		System.out.println("SubSet :" + al.subSet("After", "World"));
		System.out.println("Tail Set: " + al.tailSet("WW3"));
		
	}

}
