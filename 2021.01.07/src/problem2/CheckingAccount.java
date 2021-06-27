package problem2;

public class CheckingAccount extends Account {

	double overdraftLimit;
	public CheckingAccount() {
		super();
		overdraftLimit = 100.0;
	}
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(int sum) {
		if(sum>overdraftLimit) {
			System.out.println("The sum is too big. The overdraft limit is: "+overdraftLimit);
		}else if(sum<0) {
			System.out.println("Enter a valid sum.");
		}else {
			super.withdraw(sum);
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+"Overdraft limit:\t"+overdraftLimit+"\n";
	}
}
