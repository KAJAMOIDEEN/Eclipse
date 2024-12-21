package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileReading {

	static void type1() {
		try {
			FileReader myReader = new FileReader("myNewFile.txt");
			int i;
			while ((i = myReader.read()) != -1)
				System.out.print((char) i);
			myReader.close();
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	static void type2() {
		try {
			File file = new File("myNewFile.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				System.out.println(myReader.next());
			}
			myReader.close();
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		type1();

	}
}
