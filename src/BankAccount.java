
public class BankAccount {
	
	String accountNumber;
	//String routingNumber;
	
	//static >> belongs to the class not the object instance
	//final >> constant (often static final)
	private static final String routingNumber = "021225";
	
	//instant variables
	String name;
	String ssn;
	String accountType;
	double balance;
	
	
	//constructors definitions unique method
	// 1. they are used to define /setup/ initialize properties of an object
	//2. constructors are implicitly called upon instantiation 
	// 3.the same name as the class itself
	// 4. Cpnstructors have no return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
		
		
	}
	//Overloading call same method name with different arguments
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		
		//initDeposit, accountType and Msg ARE ALL LOCAL VARIABLES 
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("initial deposit of: $ " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Minimum deposit must be at least $1,000";
			
		} else {
			Msg = "Thanks for the deposit of : $" + initDeposit;
			
		}
		System.out.println(Msg);
		balance = initDeposit; 
	}
	
	
	//defined methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	// private can only be called within class
	private void showActivity(String activity) {
		System.out.println("your recent transaction:" + activity);
		System.out.println("YPUR NEW BALANCE IS: $ " + balance);
		
	}
	void checkingBalance(){
		System.out.println("Balance " + balance);
		
	}
	void getStatus() {
		
	}
	@Override
		public String toString() {
			return"[NAME " + name + "ACCOUNT# " + accountNumber + "ROUTING #" + routingNumber + "BALACNE: $" + balance +"]";
		}
}
