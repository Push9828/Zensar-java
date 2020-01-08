public class BasicIO {
	public static void main(String[] args)
		{
		byte b[]= new byte[256];
			try
			{
			System.out.println("Enter the Line of text");
			System.in.read(b,0,255);
			System.out.println("The line entered was...");
			String str = new String(b);
			System.out.println(str);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
}