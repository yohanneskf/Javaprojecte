package assignment2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;



public class Menubare implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	JPanel panel1;
	JButton m1,m2,m3,m4;
	
	Menubare() {
		
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
		
		
		
		
		m1 = new JButton("Student info");
		m2 = new JButton("Grade submit");
		m3 = new JButton("Log out");
		m4 = new JButton("Exit");
		m1.setForeground(Color.DARK_GRAY);
		m2.setForeground(Color.DARK_GRAY);
		m3.setForeground(Color.DARK_GRAY);
		m4.setForeground(Color.DARK_GRAY);
		m1.setFont(new Font("sarif",Font.BOLD,15));
		m2.setFont(new Font("sarif",Font.BOLD,15));
		m3.setFont(new Font("sarif",Font.BOLD,15));
		m4.setFont(new Font("sarif",Font.BOLD,15));
		m1.setBounds(40,96,130,30);
		m2.setBounds(40,222,130,30);
		m3.setBounds(40,348,130,30);
		m4.setBounds(40,474,130,30);
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
		
		panel.add(m1);
		panel.add(m2);
		panel.add(m3);
		panel.add(m4);
		

		frame.add(panel1);
		frame.add(panel);
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == m1) {
			
			Table1 tb1 = new Table1();
			tb1.displayfile();
		}
		else if(e.getSource() == m2) {
	
			GradeIn gi = new GradeIn();
		}
		else if(e.getSource() == m3) {
			frame.dispose();
			Login2 backwardwindow = new Login2();
		}
		else if(e.getSource() == m4) {
			System.exit(0);
			
			
		}
	}

}
