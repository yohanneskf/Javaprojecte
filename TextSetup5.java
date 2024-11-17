package assignment2;

import java.io.FileWriter;
import java.io.IOException;

public class TextSetup5 {
	public void main(String subject1,String subject2,String subject3,String subject4,String subject5,String subject6) {
		try {
			FileWriter file = new FileWriter("text5.txt");
			file.write(subject1);
			file.append(",");
			file.append(subject2);
			file.append(",");
			file.append(subject3);
			file.append(",");
			file.append(subject4);
			file.append(",");
			file.append(subject5);
			file.append(",");
			file.append(subject6);
			
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}