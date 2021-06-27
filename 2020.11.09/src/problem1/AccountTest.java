package problem1;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAccount s0001 = new SavingsAccount();
		System.out.print("Balance: ");
		s0001.setBalance(sc.nextDouble());
		System.out.print("Withdraw: ");
		s0001.withdraw(sc.nextDouble());
		System.out.println("The new baance is "+s0001.getBalance());
	}

}
