package application;


import java.util.Scanner;



public class bank {
	
	int deposit;
	int withdraw;
	int transfer;
	
	void setdeposit(int deposit) {
		this.deposit=deposit;
		System.out.println("Enter the amount want to deposit: "+deposit);
		System.out.println();
		System.out.println("Amount deposited :"+deposit);
	}
	void setwithdraw(int withdraw) {
		this.withdraw=withdraw;
		System.out.println("Enter the amount want to withdraw: "+withdraw);
		System.out.println();
		System.out.println("Amount Withdrawl :"+withdraw);
	}
	void settransfer(int transfer) {
		this.transfer=transfer;
		System.out.println("Amount transfered= "+transfer);
		System.out.println();
		System.out.println("Amount transfered from A to B :"+transfer);
	}
	
	
	void statement(){
		int total;
		total=deposit-withdraw;
		int t=total-transfer;
		System.out.println("Amount Deposited :" +deposit);
		System.out.println();
		System.out.println("Amount Withdrawl : "+withdraw);
		System.out.println();
		System.out.println("Balance Left :"+total);
		System.out.println();
		System.out.println("Amount Transfer from account : "+transfer);
		System.out.println();
		System.out.println("Balance Left after transfer :"+t);
		}

	public static void main(String[] args) {
		
		String s;
		System.out.println("Enter your Name");
		Scanner s1=new Scanner(System.in);
		s=s1.next();
		System.out.println("Hello "+s+" Welcome to Bank Application");
		System.out.println();
		System.out.println("1. Deposit  \t   2. withdraw");
		System.out.println("3. Transfer  \t   4. Statement");
		System.out.println();
		
		bank uRef1 = new bank();
		uRef1.setdeposit(3000);
		uRef1.setwithdraw(1000);
		uRef1.settransfer(1000);
		
		System.out.println();
		System.out.println("*********");
		
		System.out.println("Statement of "+s+" Bank Account");
		uRef1.statement();
		
		
	}

}
