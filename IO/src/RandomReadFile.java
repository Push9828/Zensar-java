////Random read file

//import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomReadFile {

		public static void main(String[] args) {
		
				RandomAccessFile rin=null;
					try{
						rin=new RandomAccessFile ("abc.txt","r");
				
						rin.seek(19);
						System.out.println("File pointer position:"+ rin.getFilePointer() + "\n");
				
						int data=0;
						while((data=rin.read())!=-1)
							System.out.print((char)data);
				
						System.out.println("\n\nEnd File pointer position: " + rin.getFilePointer());
						}catch (Exception e){
							e.printStackTrace ();
						}finally{
							try {
								rin.close();
							} catch (IOException e) {
				
								e.printStackTrace();
							} // closes the stream in any case
						}
				}

}