package assignment2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;



public class Menubar implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	JPanel panel1;
	JButton m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,logout;
	
	public void menuba() {
		
		frame = new JFrame();
		panel = new JPanel();
		panel.setBounds(0,0,210,600);
		panel.setBackground(Color.CYAN);
		panel.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setBounds(210,0,790,600);
		panel1.setBackground(Color.BLUE);
		panel1.setLayout(null);
		frame.setBounds(200,100,1000,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//frame.getContentPane().setBackground(Color.CYAN );
		frame.setVisible(true); 
		
		
		
		
		m1 = new JButton("1st year 1st sem");
		m2 = new JButton("1st year 2st sem");
		m3 = new JButton("2nd year 1st sem");
		m4 = new JButton("2nd year 2nd sem");
		m5 = new JButton("3rd year 1st sem");
		m6 = new JButton("3rd year 2nd sem");
		m7 = new JButton("4th year 1st sem");
		m8 = new JButton("4th year 2nd sem");
		m9 = new JButton("5th year 1st sem");
		m10 = new JButton("5th year 2nd sem");
		logout = new JButton("LogOut");
		m1.setForeground(Color.DARK_GRAY);
		m2.setForeground(Color.DARK_GRAY);
		m3.setForeground(Color.DARK_GRAY);
		m4.setForeground(Color.DARK_GRAY);
		m5.setForeground(Color.DARK_GRAY);
		m6.setForeground(Color.DARK_GRAY);
		m7.setForeground(Color.DARK_GRAY);
		m8.setForeground(Color.DARK_GRAY);
		m9.setForeground(Color.DARK_GRAY);
		m10.setForeground(Color.DARK_GRAY);
		m1.setFont(new Font("sarif",Font.BOLD,15));
		m2.setFont(new Font("sarif",Font.BOLD,15));
		m3.setFont(new Font("sarif",Font.BOLD,15));
		m4.setFont(new Font("sarif",Font.BOLD,15));
		m5.setFont(new Font("sarif",Font.BOLD,15));
		m6.setFont(new Font("sarif",Font.BOLD,15));
		m7.setFont(new Font("sarif",Font.BOLD,15));
		m8.setFont(new Font("sarif",Font.BOLD,15));
		m9.setFont(new Font("sarif",Font.BOLD,15));
		m10.setFont(new Font("sarif",Font.BOLD,15));
		logout.setFont(new Font("sarif",Font.BOLD,15));
		m1.setBounds(10,25,190,30);
		m2.setBounds(10,80,190,30);
		m3.setBounds(10,135,190,30);
		m4.setBounds(10,190,190,30);
		m5.setBounds(10,245,190,30);
		m6.setBounds(10,300,190,30);
		m7.setBounds(10,355,190,30);
		m8.setBounds(10,410,190,30);
		m9.setBounds(10,465,190,30);
		m10.setBounds(10,520,190,30);
		logout.setBounds(620,520,150,30);
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
		m5.addActionListener(this);
		m6.addActionListener(this);
		m7.addActionListener(this);
		m8.addActionListener(this);
		m9.addActionListener(this);
		m10.addActionListener(this);
		logout.addActionListener(this);
		
		panel.add(m1);
		panel.add(m2);
		panel.add(m3);
		panel.add(m4);
		panel.add(m5);
		panel.add(m6);
		panel.add(m7);
		panel.add(m8);
		panel.add(m9);
		panel.add(m10);
		panel1.add(logout);
		
		

		frame.add(panel1);
		frame.add(panel);
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == m1) {
			String sub1 ="Python";
			String sub2 = "Applid-I";
			String sub3 = "Chamistry";
			String sub4 = "Physices";
			String sub5 = "Civic";
			String sub6 = "English-I";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
			
		}
		else if(e.getSource() == m2) {
			String sub1 ="Emerging Technology";
			String sub2 = "Applid-II";
			String sub3 = "Logic";
			String sub4 = "c++";
			String sub5 = "Drawing";
			String sub6 = "English-II";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
		}
		else if(e.getSource() == m3) {
			String sub1 ="Electrical circuit-I";
			String sub2 = "Applid-III";
			String sub3 = "Fundamental of EE";
			String sub4 = "DSA";
			String sub5 = "Geography";
			String sub6 = "";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
		}
		else if(e.getSource() == m4) {
			String sub1 ="OOP";
			String sub2 = "Database";
			String sub3 = "Algorithm";
			String sub4 = "Discrit Maths";
			String sub5 = "Signal";
			String sub6 = "History";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
			
			
		}
		else if(e.getSource() == m5) {
			String sub1 ="Python";
			String sub2 = "Applid-I";
			String sub3 = "Chamistry";
			String sub4 = "Physices";
			String sub5 = "Civic";
			String sub6 = "English-I";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
	}
		else if(e.getSource() == m6) {
			String sub1 ="Python";
			String sub2 = "Applid-I";
			String sub3 = "Chamistry";
			String sub4 = "Physices";
			String sub5 = "Civic";
			String sub6 = "English-I";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
	}
		else if(e.getSource() == m7) {
			String sub1 ="Python";
			String sub2 = "Applid-I";
			String sub3 = "Chamistry";
			String sub4 = "Physices";
			String sub5 = "Civic";
			String sub6 = "English-I";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
	}
		else if(e.getSource() == m8) {
			String sub1 ="Python";
			String sub2 = "Applid-I";
			String sub3 = "Chamistry";
			String sub4 = "Physices";
			String sub5 = "Civic";
			String sub6 = "English-I";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
	}
		else if(e.getSource() == m9) {
			String sub1 ="Python";
			String sub2 = "Applid-I";
			String sub3 = "Chamistry";
			String sub4 = "Physices";
			String sub5 = "Civic";
			String sub6 = "English-I";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
	}
		else if(e.getSource() == m10) {
			String sub1 ="Python";
			String sub2 = "Applid-I";
			String sub3 = "Chamistry";
			String sub4 = "Physices";
			String sub5 = "Civic";
			String sub6 = "English-I";
			TextSetup5 ts5 = new TextSetup5();
			ts5.main(sub6, sub5, sub4, sub3, sub2, sub1);
			GradeOut tb1 = new GradeOut();
	}
		else if(e.getSource() == logout) {
			frame.dispose();
			Login1 l1 = new Login1();
		}
	}
	

}
