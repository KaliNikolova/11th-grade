package problem2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account(1001, 245.00);
		CheckingAccount checkingAccount = new CheckingAccount(1201, 1400, 250);
		SavingAccount savingAccount = new SavingAccount(1231, 1200);
		account.withdraw(12000);
		System.out.println(account.toString());
		checkingAccount.withdraw(500);
		checkingAccount.withdraw(200);
		System.out.println(checkingAccount.toString());
		savingAccount.withdraw(1500);
		savingAccount.withdraw(500);
		System.out.println(savingAccount.toString());
	}

}
