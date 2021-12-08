/*Simple Banking Application
 * Sidney Freeborn*/


import java.util.Scanner;


public class BankingApp {

	public static void main(String args[]) {
		
		BankAccount obj = new BankAccount("ABC", "12345");
		obj.showMenu();
	}
	
}

 class BankAccount {
	 int Balance;
	 int previousTransaction;
	 String customername;
	 String customerid;
	 
	 BankAccount(String cname, String cid){
		 customername = cname;
		 customerid = cid;
	 }
	 
	 void Deposit(int amount) {
		 if(amount !=0) {
			 Balance = Balance + amount;
			 previousTransaction = amount;
		 }
	 }
	 
	 void Withdraw(int amount) {
		 if(amount != 0) {
			 Balance = Balance - amount;
			 previousTransaction = -amount;
		 }
	 }
	 
	 void getprevioustransaction() {
		 if(previousTransaction > 0) {
			 System.out.println("deposited:" +previousTransaction);
			 
		 }
		 
		 else if(previousTransaction <0) {
			 System.out.println("withdrawn:" +Math.abs(previousTransaction));
			 
		 }
		 else {
			 System.out.println("no transaction occured");
		 }
	 }
	 
	 
	 void showMenu() {
		 
		 char option = '\0';
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Welcome" +customername);
		 System.out.println("Your ID is" +customerid);
		 System.out.println("\n");
		 System.out.println("A. Check Balance");
		 System.out.println("B. Deposit");
		 System.out.println("C. Withdraw");
		 System.out.println("D. Previous transaction");
		 System.out.println("E. Exit");
		 
		 do {
			 System.out.println("===============================================");
			 System.out.println("Enter an option");
			 System.out.println("===============================================");
			 option = scanner.next().charAt(0);
			 System.out.println("\n");
			 
			 
			 switch(option) {
			 case 'A':
				 System.out.println("---------------------------------");
				 System.out.println("Balance = " +Balance);
				 System.out.println("---------------------------------");
				 System.out.println("\n");
				 break;
				 
			 case 'B':
				 System.out.println("---------------------------------");
				 System.out.println("Enter an amount to deposit:");
				 System.out.println("---------------------------------");
				 int amount = scanner.nextInt();
				 Deposit(amount);
				 System.out.println("\n");
				 break;
				 
			 case 'C':
				 System.out.println("---------------------------------");
				 System.out.println("Enter an amount to withdraw:");
				 System.out.println("---------------------------------");
				 System.out.println("\n");
				 int amount2 = scanner.nextInt();
				 Withdraw(amount2);
				 System.out.println("\n");
				 break;
			 
			 case 'D':
				 System.out.println("---------------------------------");
				 getprevioustransaction();
				 System.out.println("---------------------------------");
				 System.out.println("\n");
				 break;
				 
				 
			 case 'E':
				 System.out.println("---------------------------------");
				 break;
				 
			 default:
				 System.out.println("Invalid option! Enter again.");
				 break;
			 }
		 }while(option != 'E');
		 
		 
		 System.out.println("Thank you! Come again!");
	 
	 }
	 
 }