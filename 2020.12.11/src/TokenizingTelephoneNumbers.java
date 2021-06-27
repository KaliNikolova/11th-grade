import java.util.Scanner;

public class TokenizingTelephoneNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] splited = str.split(" ");
		String area = splited[0].substring(1,splited[0].length()-1);
		String[] splited2 = str.split("-");
		area+=splited2[splited2.length-1];
		System.out.println("area code: "+area+"\nphone number: "+str);
		sc.close();
	}

}
