package com.chungok;

public class Account {
	
	private String accountNumber;
	private	String accountHolder;
	private long date;
	private long balance;
	
	public Account() {
		
	}
	
	public Account(String accountNumber,String accountHolder, long date, long balance ) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.date = date;
		this.balance = balance;
		
		System.out.println("계좌를 개설하였습니다.");
			
		
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public boolean depasit (long money) {
		balance += money;
		System.out.printf("/%,d원이 입금되었습니다.", money);
		return true;
	}
	
	public boolean withdrawal (long money) {
		if( balance >= money ) {
			balance -= money;
			return true;
		}
		else {
			System.out.println("잔액이 모자랍니다. 출금할 수 없습니다.");
			return false;
		}
		
		
		
	}

	public void showMyBalance() {
		System.out.printf("[계좌번호 : %s, 예금주 : %s], 잔액 : %,d 원", accountNumber, accountHolder, balance);
		
	}
	
}
