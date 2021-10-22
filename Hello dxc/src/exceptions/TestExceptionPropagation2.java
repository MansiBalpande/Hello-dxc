package exceptions;

import java.io.IOException;

public class TestExceptionPropagation2 {
   public void m() throws IOException {
	   throw new  IOException();
   }
   
   /**
    * n() is the consumer m()
    * @throws IOException
    */
   public void n() throws IOException {
	   m();
		   
   }
   public void p() {
	   
	   try {
		   n();
		   
	   } catch (IOException e) {
		   //TODO Auto-generated catch block
		   e.printStackTrace();
	   }
   }
}
