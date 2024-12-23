package files;

import java.io.FileWriter;

public class Filewriting {
	
  public static void main(String args[]){
	  
	  try {
	  
	  FileWriter file = new FileWriter("myNewFileee.txt");
	  
	  file.write("Good MOrning....");
	  
	  file.close();
	  
	  System.out.println("Written in file ...");
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
	 
  }

}
