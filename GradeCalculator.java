package assignment2;

public class GradeCalculator {
	
	public String calculat(int x) {
		String grade = "";
		if(x >= 90) {
			grade = "A+";
		}
		else if(x >= 85 && x < 90) {
			grade = "A";
		}
		else if(x >= 80 && x < 85) {
			grade = "A-";
		}
		else if(x >= 75 && x < 80) {
			grade = "B+";
		}
		else if(x >= 70 && x < 75) {
			grade = "B";
		}
		else if(x >= 65 && x < 70) {
			grade = "B-";
		}
		else if(x >= 60 && x < 65) {
			grade = "C-";
		}
		else if(x >= 55 && x < 60) {
			grade = "C";
		}
		else if(x >= 50 && x < 55) {
			grade = "C-";
		}else if(x >= 45 && x < 50) {
			grade = "D";
		}
		else if(x < 45) {
			grade = "F";
		}
		
		
		return grade;
	}

}
