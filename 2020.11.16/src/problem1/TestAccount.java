package problem1;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account (1122, 20_000);
		Account.setYearInterestRate(4.5);
		account.withdraw(2_500);
		account.deposit(3_000);
		System.out.println("Balance: "+account.getBalance());
		System.out.println("Monthly interest: "+account.getMonthlyInterest());
		System.out.println("Data: "+account.getDateCreated());
	}
}
