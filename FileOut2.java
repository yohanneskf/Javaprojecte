package assignment2;

import java.io.*;


import javax.swing.*;
import java.awt.*;

public class FileOut2 {
	
	public void fout(String uname,String psword) throws IOException {
		String file = "text2.txt";
		String line = "";
	
		try { 
			BufferedReader reader = new BufferedReader(new FileReader(file));
			int found = 0;
			while((line = reader.readLine()) != null) {
				String[] row = line.split(",");
				
				String x = row[2];
				String y = row[4];
				
				if(x.equals(uname) && y.equals(psword)) {
					Menubare mn = new Menubare();
					
					found = 1;
			
				}
			}
			if(found == 0) {
				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f,"wrong informatio.","Error",JOptionPane.ERROR_MESSAGE);
				Login2 l2 = new Login2();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
}
