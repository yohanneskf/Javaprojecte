package assignment2;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table1 {
	public void displayfile() {
		
		JFrame frame = new JFrame();
		frame.setBounds(410,100,790,600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground(Color.CYAN);
		//sframe.setLayout(null);
		frame.setVisible(true);
		
		String file = "text1.txt";
		String line1 = "";
		int row = 0;
		try { 
			BufferedReader reader1 = new BufferedReader(new FileReader(file));
			while((line1 = reader1.readLine()) != null) {
				row = row + 1;
			}
			reader1.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		String[][] data =new String[row][4];
		String[] header = {"First Name","Last Name","UserName","Departement"};
		String line2 = "";
		
		try { 
			BufferedReader reader2 = new BufferedReader(new FileReader(file));
			int found = 0;
			for(int i = 0;i < row;i++) {
				
					String[] rowline = reader2.readLine().split(",");
					
					for(int j = 0;j < 4; j++) {
						data[i][j] = rowline[j];
						found = found + 1;
					}
					
				}
			
		reader2.close();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		JTable jt = new JTable(data,header);
		jt.setBounds(400,200,400,350);
		JScrollPane js = new JScrollPane(jt);
		frame.add(js);
		
	}

}
