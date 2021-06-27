package problem1;

public class SavingsAccount {
	private String name;
	private double balance;
	
	public void deposit(int x) {
		balance += x;
	}
	public void withdraw(double x) {
		if(x<0||x>balance) System.out.println("Error");
		else balance-=x;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double b) {
		balance = b;
	}
}
