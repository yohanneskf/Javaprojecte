package assignment2;

import java.io.FileWriter;
import java.io.IOException;

public class TextSetup3 {
	public void main(String name,String uname,String subject,String quiz,String tast,String assign,String mid,String fina) {
		try {
			FileWriter file = new FileWriter("text3.txt",true);
			file.write(name);
			file.append(",");
			file.append(uname);
			file.append(",");
			file.append(subject);
			file.append(",");
			file.append(quiz);
			file.append(",");
			file.append(tast);
			file.append(",");
			file.append(assign);
			file.append(",");
			file.append(mid);
			file.append(",");
			file.append(fina);
			file.append("\n");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}