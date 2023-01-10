
public class BankAccountApp {
	
	public static void main(String[] args) {
		//Creating a new bank account
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "02323230";
		//acc1.routingNumber = "874784";
		acc1.name = "Roger Hue";
		acc1.balance = 1000;
		
		acc1.deposit(1500);
		acc1.deposit(2000);
		acc1.deposit(3000);
		acc1.deposit(4000);
		
		
		
		System.out.println(acc1.toString());
		
//		BankAccount acc2 = new BankAccount("Checking Account");
//		acc2.accountNumber = "02323230";
//		//acc2.routingNumber = "85555784";
//		
//		BankAccount acc3 = new BankAccount("Saving Account", 5000);
//		acc3.accountNumber = "02323230";
//		acc3.checkingBalance();
//		
//		
//		//Demo for inheritance
//		CDAccount cd1 = new CDAccount();
//		cd1.balance = 3000;
//		cd1.name = " juan";
//		cd1.accountType = " CD Account";
//		cd1.toString();
//		System.out.println(cd1.toString());
//		
//		
//		
//		
//		//acc3.accountNumber = "02323230";
//		//acc3.routingNumber = "877774784";
//		
//		
////		System.out.println(acc1.routingNumber);
////		System.out.println(acc2.routingNumber);
////		System.out.println(acc3.routingNumber);
	}

}
