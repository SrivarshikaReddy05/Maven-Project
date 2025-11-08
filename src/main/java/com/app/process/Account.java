package com.app.process;

public class Account {
	String accNo ,name ; 
	Double balance;
	public Account(String accNo , String name , Double balance) {
		// TODO Auto-generated constructor stub
		this.accNo =accNo;
		this.name = name;
		this.balance = balance;
		}
	public String getAccountNumber() { return accNo; }
    public String getHolderName() { return name; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean transfer(Account from, Account to, double amount) {
        if (from == null || to == null) return false;
        if (amount <= 0) return false;
        if (from.getBalance() < amount) return false;

        from.withdraw(amount);
        to.deposit(amount);
        return true;
    }

}
