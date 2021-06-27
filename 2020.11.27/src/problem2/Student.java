package problem2;

public class Student {

	private String name;
	private int[][] grades = new int[3][5];
	
	public Student() {
		name = "Unknown";
		for(int i=0;i<grades.length;i++) {
			for(int j=0;j<grades[0].length;j++) {
				grades[i][j] = 0;
			}
		}
	}
	public Student(String name) {
		this.name = name;
		for(int i=0;i<grades.length;i++) {
			for(int j=0;j<grades[0].length;j++) {
				grades[i][j] = 0;
			}
		}
	}
	public Student (String name, int[][] grades) {
		this.name = name;
		if(grades.length == this.grades.length&&grades[0].length == this.grades[0].length) {
			for(int i=0;i<grades.length;i++) {
				for(int j=0;j<grades[0].length;j++) {
					this.grades[i][j] = grades[i][j];
				}
			}
		}else {
			System.out.println("Greshen boi ocenki ili predmeti");
			for(int i=0;i<grades.length;i++) {
				for(int j=0;j<grades[0].length;j++) {
					grades[i][j] = 0;
				}
			}
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[][] getGrades() {
		return grades;
	}
	public void setGrades(int[][] grades) {
		this.grades = grades;
	}
	public static double getAverageMath(int subjectGrades[]) {
		double sum=0;
		for(int i=0;i<subjectGrades.length;i++) {
			sum+=subjectGrades[i];
		}
		return sum/subjectGrades.length;
	}
	public static double getAverageChemistry(int subjectGrades[]) {
		double sum=0;
		for(int i=0;i<subjectGrades.length;i++) {
			sum+=subjectGrades[i];
		}
		return sum/subjectGrades.length;
	}
	public static double getAverageBiology(int subjectGrades[]) {
		double sum=0;
		for(int i=0;i<subjectGrades.length;i++) {
			sum+=subjectGrades[i];
		}
		return sum/subjectGrades.length;
	}
	
}
