package assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firstwindow implements ActionListener{
	JFrame frame;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JButton bt1;
	JButton bt2;
	Firstwindow(){
		frame = new JFrame();
		frame.setBounds(200,100,1000,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setLayout(null);
		frame.setVisible(true);
		
		label1 = new JLabel();
		label1.setText("WELLCOME TO");
		label1.setFont(new Font("sarif",Font.ITALIC,30));
		label1.setForeground(Color.BLUE);
		label1.setBounds(400,150,600,50);
		
		label2 = new JLabel();
		label2.setText("ADAMA SCIENCE AND TECHENOLOGY");
		label2.setFont(new Font("sarif",Font.ITALIC,30));
		label2.setForeground(Color.BLUE);
		label2.setBounds(200,200,600,50);
		
		label3 = new JLabel();
		label3.setText("UNIVERSITY");
		label3.setFont(new Font("sarif",Font.ITALIC,30));
		label3.setForeground(Color.BLUE);
		label3.setBounds(400,250,600,50);
		
		
		
		bt1 = new JButton();
		bt2 = new JButton();
		bt1.setText("STUDENT");
		bt1.setBounds(50,450,200,50);
		bt1.addActionListener(this);
		
		bt2.setText("LECTUER");
		bt2.setBounds(750,450,200,50);
		bt2.addActionListener(this);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(bt1);
		frame.add(bt2);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt1) {
			frame.dispose();
			Login1 newwindo1 = new Login1();
		}
		
		else if(e.getSource() == bt2) {
			frame.dispose();
			Login2 newwindo2 = new Login2();
		}
		
	}
}
	
