//Random WriteFile
//import java.io.FileOutputStream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomWriteFile {

		public static void main(String[] args) {
		
		RandomAccessFile rout=null;
				try{
					rout=new RandomAccessFile("abc.txt","rw");
					rout.seek(5);
					String s = "I Love Indian Cricket Team";
					for(int i=0;i<s.length();i++)
						rout.write(s.charAt(i));
					System.out.println("data is written successfully");
					}catch (Exception e){
						e.printStackTrace ();
					}finally{
						try {
							rout.close();
						} catch (IOException e) {
				
							e.printStackTrace();
						} // closes the stream in any case
					}
		
			}

}