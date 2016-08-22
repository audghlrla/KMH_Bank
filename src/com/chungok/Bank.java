package com.chungok;

import java.util.Scanner;

public class Bank {

	private Account account;

	public void print() {
		Scanner input = new Scanner(System.in);

		System.out.println("안녕하세요 외환은행 입니다.");

		System.out.println("예금주 명을 입력하세요.");
		String accountHolder = input.nextLine();

		System.out.println("계좌번호를 입력하세요.");
		String accountNumber = input.nextLine();

		System.out.println("개설 일자를 입력하세요.");
		long date = input.nextLong();

		System.out.println("입금 금액을 입력하세요.");
		long balance = input.nextLong();

		account = new Account(accountHolder, accountNumber, date, balance);

		long money = 0;
		int chooseMenu = 0;
		boolean showBalance = false;

		while (true) {
			while (true) {
				System.out.println("업무를 선택하세요.");
				System.out.println("1. 입금");
				System.out.println("2. 출금");
				System.out.println("3. 종료");

				chooseMenu = input.nextInt();

				if (chooseMenu > 0 && chooseMenu < 4) {
					break;
				}
				System.out.println("잘못 선택 하셨습니다.");
			}
			if( chooseMenu == 1) {
				System.out.println("입금 금액을 입력해주세요.");
				money = input.nextLong();
				showBalance = account.depasit(money);
			}
			else if( chooseMenu == 2 ) {
				while (true) {
					System.out.println("출금 금액을 입력해주세요.");
					money = input.nextLong();
					showBalance = account.withdrawal(money);
					if (showBalance) {
						break;
					}
				}
				
			}
			else if( chooseMenu == 3 ) {
				System.out.println("안녕히 가세요.");
				break;
			}
			if ( showBalance ) {
				account.showMyBalance();
				showBalance = false;
			}
		}
			
	}
	public static void main(String[] args) {
		new Bank().print();
	}
}
