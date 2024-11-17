package assignment2;

import java.io.FileWriter;
import java.io.IOException;

public class TextSetup4 {
	public void main(String uname) {
		try {
			FileWriter file = new FileWriter("text4.txt");
			file.write(uname);
			file.append("\n");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
