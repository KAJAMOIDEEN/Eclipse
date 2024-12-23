package files;

import java.io.File;
import java.io.IOException;

public class filehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj = new File("myNewFileee.txt");

		if (obj.createNewFile())
			System.out.println("File is Created...");

		else
			System.out.println(obj.getName() + "File is already created.." + obj.getAbsolutePath() + obj.length());
	}

}
