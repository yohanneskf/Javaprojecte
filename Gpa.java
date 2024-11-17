package assignment2;

public class Gpa {
	double val1,val2,val3,val4,val5,val6,total;
	float averege, tot;
	public String getGpa1(String grade1,String grade2,String grade3,String grade4,String grade5,String grade6) {
		String gpa = "";
		double[] point = {4.0,4.0,3.75,3.5,3.0,2.75,2.5,2.0,1.5,1.0,0.0};
		String[] grade = {"A+","A","A-","B+","B","B-","C+","C","C-","D","F"};
		
		for(int i =0 ; i < 11 ; i++) {
			if(grade1 == grade[i]) {
				val1 = point[i];
			}
			if(grade2 == grade[i]) {
				val2 = point[i];
			}
			if(grade3 == grade[i]) {
				val3 = point[i];
			}
			if(grade4 == grade[i]) {
				val4 = point[i];
			}
			if(grade5 == grade[i]) {
				val5 = point[i];
			}
			if(grade6 == grade[i]) {
				val6 = point[i];
			}
		}
		total = val1 + val2 + val3 + val4 + val5 + val6;
		tot = (float)total;
		averege = tot/6;
		gpa = String.valueOf(averege);
		return gpa;
	}
	public String getGpa2(String grade1,String grade2,String grade3,String grade4,String grade5) {
		String gpa = "";
		double[] point = {4.0,4.0,3.75,3.5,3.0,2.75,2.5,2.0,1.5,1.0,0.0};
		String[] grade = {"A+","A","A-","B+","B","B-","C+","C","C-","D","F"};
		
		for(int i =0 ; i < 11 ; i++) {
			if(grade1 == grade[i]) {
				val1 = point[i];
			}
			if(grade2 == grade[i]) {
				val2 = point[i];
			}
			if(grade3 == grade[i]) {
				val3 = point[i];
			}
			if(grade4 == grade[i]) {
				val4 = point[i];
			}
			if(grade5 == grade[i]) {
				val5 = point[i];
			}
			
		}
		total = val1 + val2 + val3 + val4 + val5 ;
		tot = (float)total;
		averege = tot/5;
		gpa = String.valueOf(averege);
		return gpa;
	}

}
