
package problem1;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[3];
		String name;
		double uspeh;
		for(int i=0;i<students.length;i++) {
			System.out.println("Uchenik "+(i+1)+": ");
			System.out.print("Ime: ");
			name = sc.next();
			System.out.print("Uspeh: ");
			uspeh = sc.nextDouble();
			students[i] = new Student(name,uspeh);
		}
		poluchavatLiStipendiq(students);
		sc.close();
	}
	public static void poluchavatLiStipendiq(Student[] students) {
		for(int i=0;i<students.length;i++) {
			if(students[i].stipendiq()==true) {
				System.out.println("Uchenikyt "+students[i].getName()+" shte poluchi stipendiq.");
			}
		}
	}

}
