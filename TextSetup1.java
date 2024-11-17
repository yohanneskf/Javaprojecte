package assignment2;

import java.io.*;

public class TextSetup1 {
	

	public void main(String fname,String lname,String uname,String dept,String year,String psword) {
		try {
			FileWriter file = new FileWriter("text1.txt",true);
			file.write(fname);
			file.append(",");
			file.append(lname);
			file.append(",");
			file.append(uname);
			file.append(",");
			file.append(dept);
			file.append(",");
			file.append(year);
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
