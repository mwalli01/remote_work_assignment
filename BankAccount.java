package assignments;


// A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.
public class BankAccount {
    private String id;
    private double balance;
    private int transactions;
    
    // Constructs a BankAccount object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String id){
    	this.id = id;
    	this.balance = 0;
    	this.transactions = 0;
    }
    
    // returns the field values
    public double getBalance() {
    	return balance;
    }
    public String getID() {
    	return id;
    }
    public int getTransactions() {
    	return transactions;
    }
    
    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount) {
    	if(amount <= 500) {
    		balance += amount;
    		transactions++;
    	}
    	else {
    		System.out.println("deposit too high. go somewhere else");
    	}
    }
    
    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount) {
    	if(balance >= amount) {
    		balance -= amount;
    		transactions++;
    	}
    }
    
    public boolean transactionFee(double feeAmount) {
    	//create initial variable to store the total fee
    	double totalFee = 0;
    	//add the fee amount to itself for however many transactions there were
    	for(int i = 1; i <= transactions; i++) {
    		totalFee = totalFee + (feeAmount * i);
    	}
    	//if fee is greater than balance, subtract the remainder and return false
    	//otherwise, subtract the fee and return true.
    	if(totalFee >= balance) {
    		balance = balance - balance;
    		return false;
    	}
    	else if (totalFee < balance) {
    		balance = balance - totalFee;
    		return true;
    	}
    	else return false;
    	
    }
}