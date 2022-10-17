package session2;

import java.util.Scanner;

public class EncapsulationExample {

	public static void main(String[] args) {
		Bank b=new Bank();
		//System.out.println(b.bal);
		int ch;
		
		System.out.println("1. Deposite");
		
		System.out.println("2.withdraw");
		System.out.println("3.checkBalance");
		System.out.println("Enter your Choice");
		Scanner sc1=new Scanner(System.in);
		ch=sc1.nextInt();
		switch(ch) {
		case 1:b.Deposite(100);
			
			break;
		case 2:b.Withdraw(2000);
		break;
		case 3:b.checkbal();
		break;
		}}}
class Bank {
	private double bal=8000.0;
	private int psw;
	
	public void Deposite(double money) {
		
		System.out.println("Enter Password");

		Scanner scn=new Scanner(System.in);
		psw=scn.nextInt();
		
		if(psw==234) {
			bal=bal+money;
			
			System.out.println("Deposite money :"+money);
			System.out.println("Total Balance :"+bal);
		}else {
			System.out.println("incorrect Password");
		}}
public void Withdraw(double amount) {
		System.out.println("Enter Password");
		Scanner scn=new Scanner(System.in);
		psw=scn.nextInt();
		
		if(psw==234) {
			bal=bal-amount;
			
			System.out.println("Withdraw amount :"+amount);
			System.out.println("Total Balance :"+bal);
		}else {
			System.out.println("incorrect Password");
		}
	}
	
		public void checkbal() {
			System.out.println("Enter Password");

			Scanner scn=new Scanner(System.in);
			psw=scn.nextInt();
			
			if(psw==234) {
				
				System.out.println("Total balance "+bal);
		}
			else {
				System.out.println("Incorrect password ");
			}
	}
	
	
}