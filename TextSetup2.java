package assignment2;

import java.io.FileWriter;
import java.io.IOException;

public class TextSetup2 {
	public void main(String fname,String lname,String uname,String subject,String psword) {
		try {
			FileWriter file = new FileWriter("text2.txt",true);
			file.write(fname);
			file.append(",");
			file.append(lname);
			file.append(",");
			file.append(uname);
			file.append(",");
			file.append(subject);
			file.append(",");
			file.append(psword);
			file.append("\n");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
