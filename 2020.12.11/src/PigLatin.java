import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] splited = str.split("\\s+");
		for (int i = 0; i < splited.length; i++) {
			printLatinWord(splited[i]);
		}
		sc.close();
	}

	public static void printLatinWord(String s) {
		s = s+s.charAt(0)+"ay";
		s=s.substring(1);
		System.out.print(s + " ");
	}
}
