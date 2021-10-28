package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamExample {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream foutPipe = new FileOutputStream("C:\\Users\\admin\\Desktop"); 
	
			foutPipe.write(65);    
            foutPipe.close();   //closing the pipe
            System.out.println("success...");    


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//   \\ is escape sequence \"    

	}

}
		
	


