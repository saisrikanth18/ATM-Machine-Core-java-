package com.resume.ATM;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		AtmOperationInterface op = new AtmOperationsImpl();
		
		int atmNumber = 123;
		int atmPin = 123;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine!");
		System.out.print("Enter ATM Number : ");
		int atmNo = sc.nextInt();
		System.out.print("Enter ATM Pin : ");
		int pin = sc.nextInt();
		
		if((atmNumber == atmNo) && (atmPin == pin)) {
			while(true) {
				System.out.println("1. View Available Balance\n2. Withdraw Amount\n3. Deposite Amount\n"
						+ "4. View Ministatement\n5. Exit");
				System.out.print("Enter Choice : ");
				int choice = sc.nextInt();
				if(choice == 1) {
					op.viewBalance();
				}
				else if(choice == 2) {
					System.out.println("Enter amount to withdraw : ");
					double withdrawAmount = sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}
				else if(choice == 3) {
					System.out.print("Enter amount to Deposit : ");
					double depositeAmount = sc.nextDouble();
					op.depositeAmount(depositeAmount);
				}
				else if(choice == 4) {
					op.viewMiniStatement();
					
				}
				else if(choice == 5) {
					System.out.println("Collect your ATM card\nThank you for using ATM Machine.");
					System.exit(0);
				}
				else {
					System.out.println("Please enter correct choice.");
				}
			}
		}
		else {
			System.out.println("Invalid ATM Number or Pin");
			System.exit(0);
		}
	}

}
