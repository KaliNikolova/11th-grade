package problem1;

import java.util.Scanner;

public class ATM {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		Account[] accounts = new Account[10];
		for(int i=0;i<accounts.length;i++) {
			accounts[i] = new Account(i, 100);
		}
		int id;
		int choice;
		do {
			id = enterId();
			if(id==-1) {
				System.out.println("Closed");
				break;
			}
			mainMenu();
			System.out.print("Enter a choice: ");
			choice = sc.nextInt();
			do {
				if(choice>0&&choice<5) {
					choice(choice,accounts[id]);
					System.out.print("Enter a choice: ");
				}
				else {
					System.out.print("Enter a valid choice: ");
				}
				choice = sc.nextInt();
			}while(choice!=4);
			
		}while(id!=-1);
	}
	
	public static void choice(int choice, Account account) {
		switch (choice) {
		case 1:
			System.out.println("The balance is "+account.getBalance());
			break;

		case 2:
			System.out.print("Enter an amount to withdraw: ");
			account.withdraw(sc.nextInt());
			break;
			
		case 3:
			System.out.print("Enter an amount to deposit: ");
			account.deposit(sc.nextInt());
			break;
			
		default:
			break;
		}
	}
	
	public static void mainMenu() {
		System.out.println("Main menu\r\n" + 
				"1: check balance\r\n" + 
				"2: withdraw\r\n" + "3: deposit\r\n" + "4: exit");
	}
	
	public static int enterId() {
		int id;
		int br=0;
		do {
			if(br==0) System.out.print("Enter an id: ");
			else System.out.print("Please enter a valid id (between 0 and 9): ");
			br++;
			id = sc.nextInt();
			if(id==-1) {
				return id;
			}
		}while(id>9||id<0);
		return id;
	}

}
