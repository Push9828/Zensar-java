//Read operation
import java.io.FileInputStream;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) {
	
		FileInputStream fin=null;
		
			try{
				fin=new FileInputStream ("abc.txt");
				int data=0;
				
				while((data=fin.read())!=-1)
				System.out.print((char)data);
				}catch (Exception e){
				e.printStackTrace ();
				}
				finally{
				try {
				fin.close();
				} catch (IOException e) {
				
				e.printStackTrace();
				}
				}

}

}