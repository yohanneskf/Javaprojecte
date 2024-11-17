package assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Login1  implements ActionListener {
	JFrame frame1;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JTextField username;
	JTextField password;
	JPanel panel;
	JButton submmit;
	JButton register;
	JButton back;
	
	public String stud_username;
	Login1(){
		frame1 = new JFrame();
		frame1.setBounds(200,100,1000,600);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(null);
		frame1.getContentPane().setBackground(Color.CYAN );
		frame1.setVisible(true); 
		panel = new JPanel();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		username = new JTextField();
		password = new JTextField();
		submmit = new JButton();
		register = new JButton();
		back = new JButton();
		
		panel.setBounds(0,150,1000,300);
		panel.setBackground(Color.BLUE);
		panel.setLayout(null);
		
		l1.setText("User Name:");
		l1.setFont(new Font("sarif",Font.BOLD,20));
		l1.setForeground(Color.CYAN);
		l1.setBounds(100,30,200,50);
		
		l2.setText("Password :");
		l2.setFont(new Font("sarif",Font.BOLD,20));
		l2.setForeground(Color.CYAN);
		l2.setBounds(100,90,200,50);
		
		username.setBounds(300,30,200,40);
		password.setBounds(300,90,200,40);
		
		submmit.setText("Login");
		submmit.setBounds(300,150,200,40);
		submmit.addActionListener(this);
		
		l3.setText("OR");
		l3.setFont(new Font("sarif",Font.BOLD,20));
		l3.setForeground(Color.CYAN);
		l3.setBounds(400,200,200,40);
		
		register.setText("Register");
		register.setBounds(300,260,200,40);
		register.addActionListener(this);
		
		back.setText(" << Back");
		back.setBounds(20,500,200,40);
		back.addActionListener(this);
		
		panel.add(l1);
		panel.add(l2);
		panel.add(username);
		panel.add(password);
		panel.add(submmit);
		panel.add(l3);
		panel.add(register);
		frame1.add(back);
		frame1.add(panel);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == back) {
			frame1.dispose();
			Firstwindow backwindow = new Firstwindow();
		}
		else if(e.getSource() == register) {
			frame1.dispose();
			Form1 forwardwindow = new Form1();
			//Table1 tb = new Table1();
			//tb.displayfile();
		}
		else if(e.getSource() == submmit) {
			String uname = username.getText().toString();
			String psword = password.getText().toString();
			TextSetup4 ts4 = new TextSetup4();
			ts4.main(uname);
			frame1.dispose();
			
			FileOut1 fo = new FileOut1();
			try {
				fo.fout(uname, psword);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
