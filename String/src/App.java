
public class App {

	public static void main(String[] args) {
		
		 //String is immutable
		String info = "";
		info += "This is java.";
		info += " ";
		info += "Welcome to Programming";
		System.out.println(info);
		
		//To have a mutable string we make use of StringBuilder class
		StringBuilder sb = new StringBuilder();
		sb.append("This is Programming").append(", ");
		sb.append("Welcome to Java.");
		System.out.println(sb);

	}

}
