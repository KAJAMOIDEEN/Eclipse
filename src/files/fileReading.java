package files;

import java.io.FileReader;
import java.io.IOException;

public class fileReading {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		 try {
		      FileReader myReader = new FileReader("myNewFile.txt");      
		      int i;    
	          while((i=myReader.read())!=-1)    
	          System.out.print((char)i);    
	          myReader.close();     
		    } 
		 catch(Exception e) 
		    {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
       
     }
}
