import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;

//When you serialize - you convert Object to Stream
//When you de-serialize - you convert Stream to Object
public class App {
public static void main(String[] args) {

			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			
			FileInputStream fi=null;
			ObjectInputStream oi=null;
					
			
			try{
				ArrayList<Employee> li1  = new ArrayList<Employee>();
				
				li1.add(new Employee (101,"Rohan",45000));
				li1.add(new Employee (102,"Nikhil",50000));
				fos=new FileOutputStream ("stud.txt");
		
				oos=new ObjectOutputStream (fos);
		
			
				oos.writeObject (li1);
				oos.writeObject (li1);
		
				System.out.println("Employee object is serialized successfully");
				
				fi=new FileInputStream("stud.txt");
				oi=new ObjectInputStream(fi);
				
				Employee ob=null;
				
				ArrayList<Employee> li  = new ArrayList<Employee>();
				
				
				
					
			
			    li=(ArrayList<Employee>)oi.readObject();
			   
			    
				
				System.out.println("Deserialized output for Employee:"+li);
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