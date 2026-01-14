package EncapsulationAssesment;

public class BankAccount {
	String accountNum="123456789";
	private long balance;
	
	BankAccount(){
		
	}
	BankAccount(String accountNum,long balance){
		this.accountNum=accountNum;
		this.balance=balance;
	}
	public void deposit(int amount) {
		if(amount>0) {
			balance+=amount;
		}
	}
	public void withdraw(int amount) {
		if(amount>0&&balance != 0) {
			balance-=amount;
		}
	}
	public long getBalance() {
		if(accountNum.equals(this.accountNum)) {	
		return balance;
		}
			return 0;
	}
	
	public static void main(String[] args) {
		BankAccount bank = new BankAccount("123456789",200);
		bank.deposit(250);
		bank.withdraw(100);
		System.out.print(bank.getBalance());
	}
}
