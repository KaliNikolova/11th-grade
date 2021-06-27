package problem2;
import java.util.Date;
public class Account {

	private int id=0;
	private static int numberOfAccounts=0;
	private double balance=0;
	private static double yearInterestRate=0;
	public static double monthInterestRate=0;
	private Date dateCreated = new Date();
	
	public Account() { 
		numberOfAccounts++;
	}
	public Account(int id, double balance) {
		this.id=id;
		this.balance=balance;
		numberOfAccounts++;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the yearInterestRate
	 */
	public static double getYearInterestRate() {
		return yearInterestRate;
	}
	/**
	 * @param yearInterestRate the yearInterestRate to set
	 */
	public static void setYearInterestRate(double yearInterestRate) {
		Account.yearInterestRate = yearInterestRate;
		Account.monthInterestRate = yearInterestRate/12;
	}
	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	public static double getMonthlyInterestRate () {
		return (yearInterestRate/12);
	}
	public double getMonthlyInterest () {
		return (balance*yearInterestRate/1200);
	}
	public void withdraw(int sum) {
		balance-=sum;
	}
	public void deposit(int sum) {
		balance+=sum;
	}
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	public String toString() {
		return "ID:\t\t\t"+id+"\nAccount number:\t\t"+numberOfAccounts+"\nBalance:\t\t"+balance+"\nAnnual interest rate:\t"+yearInterestRate+"\nDate created:\t\t"+dateCreated+"\n";
	}
}
