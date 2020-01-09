//Class Serialize

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

		public static void main(String[] args) {
		
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try{
				Employee e=new Employee (1001,"Rohan",10000.00);
				fos=new FileOutputStream ("serial1.txt");
		
				oos=new ObjectOutputStream (fos);
		
				oos.writeObject (e);
		
				System.out.println("Employee object is serialized successfully");
			}
				catch (Exception e){
					e.printStackTrace();
				}
			finally{
				try {
					oos.close();
				} catch (IOException e) {
		
					e.printStackTrace();
				}
			}
		}
}