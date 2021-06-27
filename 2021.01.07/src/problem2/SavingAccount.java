package problem2;

public class SavingAccount extends Account {

	public SavingAccount() {
		super();
	}
	public SavingAccount(int id, double balance) {
		super(id, balance);
	}
	
	@Override
	public void withdraw(int sum) {
		if(sum>getBalance()) {
			System.out.println("This is a saving account. Enter a sum smaller than the balance ("+getBalance()+")");
		}else {
			super.withdraw(sum);
		}
	}
}
