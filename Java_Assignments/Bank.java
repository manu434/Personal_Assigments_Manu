// Abstraction: Abstract class Account
package bannking;

abstract class Account {
	protected String accountNumber;
	protected double balance;

	// Constructor
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Abstract method
	public abstract void displayAccountInfo();

	// Concrete method
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
	}
}

// Inheritance: SavingsAccount extends Account
class SavingsAccount extends Account {
	private double interestRate;

	// Constructor
	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	// Override abstract method
	@Override
	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Interest Rate: " + interestRate + "%");
	}
}

// Main class
public class Bank {
	public static void main(String[] args) {
		// Polymorphism: Account reference to SavingsAccount object
		SavingsAccount myAccount = new SavingsAccount("123456", 1000.0, 5.0);

		// Use methods
		myAccount.deposit(500.0);
		myAccount.displayAccountInfo();
	}
}