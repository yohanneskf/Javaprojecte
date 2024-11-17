package assignment2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;



import java.io.IOException;


import javax.swing.*;

public class GradeOut  {
	
	JFrame frame;
	JTextField a1,a2,a3,a4,a5,a6,a7,a8,b1,b2,b3,b4,b5,b6,b7,b8,c1,c2,c3,c4,c5,c6,c7,c8;
	JTextField d1,d2,d3,d4,d5,d6,d7,d8,e1,e2,e3,e4,e5,e6,e7,e8,f1,f2,f3,f4,f5,f6,f7,f8,gpa1;
	JLabel subject1,quiz1,tast1,assignment1,mid1,fina1,total,grade,gpa;
	JButton submmit;
	String aa1,bb1,cc1,dd1,ee1,ff1,aa8,bb8,cc8,dd8,ee8,ff8,gp,username,sub1,sub2,sub3,sub4,sub5,sub6;
	int aa2,bb2,cc2,dd2,ee2,ff2,aa3,bb3,cc3,dd3,ee3,ff3,aa4,bb4,cc4,dd4,ee4,ff4;
	int aa5,bb5,cc5,dd5,ee5,ff5,aa6,bb6,cc6,dd6,ee6,ff6,aa7,bb7,cc7,dd7,ee7,ff7;
	
	GradeOut() {
		
		
		frame = new JFrame();
		frame.setBounds(410,100,790,600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setLayout(null);
		frame.setVisible(true);
		a1= new JTextField();
		a2 = new JTextField();
		a3 = new JTextField();
		a4= new JTextField();
		a5 = new JTextField();
		a6 = new JTextField();
		a7 = new JTextField();
		a8 = new JTextField();
		b1= new JTextField();
		b2 = new JTextField();
		b3 = new JTextField();
		b4= new JTextField();
		b5 = new JTextField();
		b6 = new JTextField();
		b7 = new JTextField();
		b8 = new JTextField();
		c1= new JTextField();
		c2 = new JTextField();
		c3 = new JTextField();
		c4= new JTextField();
		c5 = new JTextField();
		c6 = new JTextField();
		c7 = new JTextField();
		c8 = new JTextField();
		d1= new JTextField();
		d2 = new JTextField();
		d3 = new JTextField();
		d4= new JTextField();
		d5 = new JTextField();
		d6 = new JTextField();
		d7 = new JTextField();
		d8 = new JTextField();
		e1= new JTextField();
		e2 = new JTextField();
		e3 = new JTextField();
		e4= new JTextField();
		e5 = new JTextField();
		e6 = new JTextField();
		e7 = new JTextField();
		e8 = new JTextField();
		f1= new JTextField();
		f2 = new JTextField();
		f3 = new JTextField();
		f4= new JTextField();
		f5 = new JTextField();
		f6 = new JTextField();
		f7 = new JTextField();
		f8 = new JTextField();
		gpa1 = new JTextField();
		
		

		
		grade = new JLabel();
		total = new JLabel();
		quiz1 = new JLabel();
		tast1 = new JLabel();
		assignment1 = new JLabel();
		mid1 = new JLabel();
		fina1 = new JLabel();
		subject1 = new JLabel();
		subject1 = new JLabel();
		gpa = new JLabel();
		
		
		
		
		grade.setText("Grade");
		total.setText("Total");
		quiz1.setText("Quiz");
		tast1.setText("Tast");
		assignment1.setText("Assignment");
		mid1.setText("Mid");
		fina1.setText("Final ");
		subject1.setText("Subject ");
		gpa.setText("GPA ");
		
		grade.setBounds(50,260,90,30);
		total.setBounds(50,230,90,30);
		subject1.setBounds(50,50,90,30);
		quiz1.setBounds(50,80,90,30);
		tast1.setBounds(50,110,90,30);
		assignment1.setBounds(50,140,90,30);
		mid1.setBounds(50,170,90,30);
		fina1.setBounds(50,200,90,30);
		gpa.setBounds(50,320,90,30);
		
		
		a1.setBounds(140,50,90,30);
		a2.setBounds(140,80,90,30);
		a3.setBounds(140,110,90,30);
		a4.setBounds(140,140,90,30);
		a5.setBounds(140,170,90,30);
		a6.setBounds(140,200,90,30);
		a7.setBounds(140,230,90,30);
		a8.setBounds(140,260,90,30);
		b1.setBounds(230,50,90,30);
		b2.setBounds(230,80,90,30);
		b3.setBounds(230,110,90,30);
		b4.setBounds(230,140,90,30);
		b5.setBounds(230,170,90,30);
		b6.setBounds(230,200,90,30);
		b7.setBounds(230,230,90,30);
		b8.setBounds(230,260,90,30);
		c1.setBounds(320,50,90,30);
		c2.setBounds(320,80,90,30);
		c3.setBounds(320,110,90,30);
		c4.setBounds(320,140,90,30);
		c5.setBounds(320,170,90,30);
		c6.setBounds(320,200,90,30);
		c7.setBounds(320,230,90,30);
		c8.setBounds(320,260,90,30);
		d1.setBounds(410,50,90,30);
		d2.setBounds(410,80,90,30);
		d3.setBounds(410,110,90,30);
		d4.setBounds(410,140,90,30);
		d5.setBounds(410,170,90,30);
		d6.setBounds(410,200,90,30);
		d7.setBounds(410,230,90,30);
		d8.setBounds(410,260,90,30);
		e1.setBounds(500,50,90,30);
		e2.setBounds(500,80,90,30);
		e3.setBounds(500,110,90,30);
		e4.setBounds(500,140,90,30);
		e5.setBounds(500,170,90,30);
		e6.setBounds(500,200,90,30);
		e7.setBounds(500,230,90,30);
		e8.setBounds(500,260,90,30);
		f1.setBounds(590,50,90,30);
		f2.setBounds(590,80,90,30);
		f3.setBounds(590,110,90,30);
		f4.setBounds(590,140,90,30);
		f5.setBounds(590,170,90,30);
		f6.setBounds(590,200,90,30);
		f7.setBounds(590,230,90,30);
		f8.setBounds(590,260,90,30);
		gpa1.setBounds(140,320,90,30);
		
		
		//username reading from the file
		
		String file2 = "text4.txt";
		
		try { 
			BufferedReader reader = new BufferedReader(new FileReader(file2));
			
			this.username = reader.readLine();
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
     
		
		
		//subject reading from the file
		String file3 = "text5.txt";
		
		try { 
			BufferedReader reader3 = new BufferedReader(new FileReader(file3));
			
			
			String[] row2 = reader3.readLine().split(",");
			sub1 = row2[0];
			sub2 = row2[1];
			sub3 = row2[2];
			sub4 = row2[3];
			sub5 = row2[4];
			sub6 = row2[5];
			reader3.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	//file reading from the file	
		
		String file = "text3.txt";
		String line1 = "";
		int rowcount = 0;
		try { 
			BufferedReader reader1 = new BufferedReader(new FileReader(file));
			while((line1 = reader1.readLine()) != null) {
				rowcount = rowcount + 1;
			}
			reader1.close();
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		try { 
			BufferedReader reader2 = new BufferedReader(new FileReader(file));
			
			for(int i = 0;i < rowcount;i++) {
				
				String[] row = reader2.readLine().split(",");
				String x = row[1];
				String y = row[2];
				
				if(username.equals(x) && sub1.equals(y)) {
					aa1 = sub1;
					aa2 = Integer.parseInt(row[3]);
					aa3 = Integer.parseInt(row[4]);
					aa4 = Integer.parseInt(row[5]);
					aa5 = Integer.parseInt(row[6]);
					aa6 = Integer.parseInt(row[7]);
					aa7 = aa2 + aa3 + aa4 + aa5 + aa6;
					GradeCalculator gc = new GradeCalculator();
					aa8 = gc.calculat(aa7);
				
				}
				else if(username.equals(x) && sub2.equals(y)) {
					this.bb1 = sub2;
					this.bb2 = Integer.parseInt(row[3]);
					this.bb3 = Integer.parseInt(row[4]);
					this.bb4 = Integer.parseInt(row[5]);
					this.bb5 = Integer.parseInt(row[6]);
					this.bb6 = Integer.parseInt(row[7]);
					bb7 = bb2 + bb3 + bb4 + bb5 + bb6;
					GradeCalculator gc = new GradeCalculator();
					bb8 = gc.calculat(bb7);
				
				}
				else if(username.equals(x) && sub3.equals(y)) {
					cc1 = sub3;
					cc2 = Integer.parseInt(row[3]);
					cc3 = Integer.parseInt(row[4]);
					cc4 = Integer.parseInt(row[5]);
					cc5 = Integer.parseInt(row[6]);
					cc6 = Integer.parseInt(row[7]);
					cc7 = cc2 + cc3 + cc4 +cc5 + cc6;
					GradeCalculator gc = new GradeCalculator();
					cc8 = gc.calculat(cc7);
					
				}
				else if(username.equals(x) && sub4.equals(y)) {
					dd1 = sub4;
					dd2 = Integer.parseInt(row[3]);
					dd3 = Integer.parseInt(row[4]);
					dd4 = Integer.parseInt(row[5]);
					dd5 = Integer.parseInt(row[6]);
					dd6 = Integer.parseInt(row[7]);
					dd7 = dd2 + dd3 +dd4 + dd5 + dd6;
					GradeCalculator gc = new GradeCalculator();
					dd8 = gc.calculat(dd7);
					
				}
				else if(username.equals(x) && sub5.equals(y)) {
					ee1 = sub5;
					ee2 = Integer.parseInt(row[3]);
					ee3 = Integer.parseInt(row[4]);
					ee4 = Integer.parseInt(row[5]);
					ee5 = Integer.parseInt(row[6]);
					ee6 = Integer.parseInt(row[7]);
					ee7 = ee2 + ee3 + ee4 + ee5 + ee6;
					GradeCalculator gc = new GradeCalculator();
					ee8 = gc.calculat(ee7);
					
				}

				else if(username.equals(x) && sub6.equals(y)) {
					ff1 = sub6;
					ff2 = Integer.parseInt(row[3]);
					ff3 = Integer.parseInt(row[4]);
					ff4 = Integer.parseInt(row[5]);
					ff5 = Integer.parseInt(row[6]);
					ff6 = Integer.parseInt(row[7]);
					ff7 = ff2 + ff3 + ff4 + ff5 + ff6;
					GradeCalculator gc = new GradeCalculator();
					ff8 = gc.calculat(ff7);				
				}
				
		 	}
			reader2.close();
			
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		
		
		
		if(aa1 == null) {
			Gpa p =new Gpa();
			gp = p.getGpa2( bb8, cc8, dd8, ee8, ff8);
		}
		else {
			Gpa g =new Gpa();
			gp = g.getGpa1(aa8, bb8, cc8, dd8, ee8, ff8);
		}
		
		
		a1.setText(aa1);
		a2.setText(Integer.toString(aa2));
		a3.setText(Integer.toString(aa3));
		a4.setText(Integer.toString(aa4));
		a5.setText(Integer.toString(aa5));
		a6.setText(Integer.toString(aa6));
		a7.setText(Integer.toString(aa7));
		a8.setText(aa8);
		b1.setText(bb1);
		b2.setText(Integer.toString(bb2));
		b3.setText(Integer.toString(bb3));
		b4.setText(Integer.toString(bb4));
		b5.setText(Integer.toString(bb5));
		b6.setText(Integer.toString(bb6));
		b7.setText(Integer.toString(bb7));
		b8.setText(bb8);
		c1.setText(cc1);
		c2.setText(Integer.toString(cc2));
		c3.setText(Integer.toString(cc3));
		c4.setText(Integer.toString(cc4));
		c5.setText(Integer.toString(cc5));
		c6.setText(Integer.toString(cc6));
		c7.setText(Integer.toString(cc7));
		c8.setText(cc8);
		d1.setText(dd1);
		d2.setText(Integer.toString(dd2));
		d3.setText(Integer.toString(dd3));
		d4.setText(Integer.toString(dd4));
		d5.setText(Integer.toString(dd5));
		d6.setText(Integer.toString(dd6));
		d7.setText(Integer.toString(dd7));
		d8.setText(dd8);
		e1.setText(ee1);
		e2.setText(Integer.toString(ee2));
		e3.setText(Integer.toString(ee3));
		e4.setText(Integer.toString(ee4));
		e5.setText(Integer.toString(ee5));
		e6.setText(Integer.toString(ee6));
		e7.setText(Integer.toString(ee7));
		e8.setText(ee8);
		f1.setText(ff1);
		f2.setText(Integer.toString(ff2));
		f3.setText(Integer.toString(ff3));
		f4.setText(Integer.toString(ff4));
		f5.setText(Integer.toString(ff5));
		f6.setText(Integer.toString(ff6));
		f7.setText(Integer.toString(ff7));
		f8.setText(ff8);
		gpa1.setText(gp);
		
		
		//submmit.setBounds(400,500,100,30);
		//submmit.addActionListener(this);
		frame.add(grade);
		frame.add(total);
		frame.add(subject1);
		frame.add(quiz1);
		frame.add(tast1);
		frame.add(assignment1);
		frame.add(mid1);
		frame.add(fina1);
		frame.add(gpa);
		frame.add(a1);
		frame.add(a2);
		frame.add(a3);
		frame.add(a4);
		frame.add(a5);
		frame.add(a6);
		frame.add(a7);
		frame.add(a8);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(c1);
		frame.add(c2);
		frame.add(c3);
		frame.add(c4);
		frame.add(c5);
		frame.add(c6);
		frame.add(c7);
		frame.add(c8);
		frame.add(d1);
		frame.add(d2);
		frame.add(d3);
		frame.add(d4);
		frame.add(d5);
		frame.add(d6);
		frame.add(d7);
		frame.add(d8);
		frame.add(e1);
		frame.add(e2);
		frame.add(e3);
		frame.add(e4);
		frame.add(e5);
		frame.add(e6);
		frame.add(e7);
		frame.add(e8);
		frame.add(f1);
		frame.add(f2);
		frame.add(f3);
		frame.add(f4);
		frame.add(f5);
		frame.add(f6);
		frame.add(f7);
		frame.add(f8);
		frame.add(gpa1);
		
	}

	
	

	
}