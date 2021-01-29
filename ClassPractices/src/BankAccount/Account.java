package BankAccount;
import java.util.Scanner;

public class Account {

	static double balance = 50000;
	
	

public static void main(String[] args) {
	
//	variable initialized for amount withdrawal method
		long accountNo = 1234567;
		String accHolderName = "John";
		String branchName = "SBI";
		
		
		
		Scanner sc = new Scanner(System.in);
		double withdrw = withdrawRead();
		
	    withdrawalAmt(withdrw, balance);
	    System.out.println("Enter the principal amount: ");
	    double principalAmt = sc.nextDouble();
	    System.out.println("Enter the no. of years: ");
	    int tenure = sc.nextInt();
	    System.out.println("rate of interest? ");
	    int rate = sc.nextInt();
	    double totalAmt = loan(principalAmt, tenure, rate);
	    System.out.println("total Amount to be paid: Rs."+totalAmt);
	    double totalloanAmt =loanPayment(totalAmt,tenure);
	    System.out.println("amount to be paid: Rs."+totalloanAmt);
	
}

public static double withdrawRead() {
	Scanner sc2 = new Scanner(System.in);
	
	System.out.println("Enter the amount to be withdrawn : ");
	double withdrw = sc2.nextDouble();
	
	return withdrw;
	
	
	
}

public static  double withdrawalAmt(double with, double bal)
{
	
	
	if(with < bal)
	{
		System.out.println("Withdrawal success!!\n Your balance is Rs. "+(bal- with));
		bal = bal-with;
//		System.out.println("new balance= "+bal);
	}
	
	else {
		System.out.println("Insufficient Balance!!");
	}
	return bal;

	}


public static double loan(double principalAmt, int rate, int tenure) {
	double si = (principalAmt*tenure*rate)/100;
	double totalAmt = principalAmt + si;
	return totalAmt;
}
	
	public static double loanPayment(double loanAmt, int tenure)
	{
		System.out.println("loan amount paying 1) Monthly\n2)Half Yearly\n3)Quarterly\n Enter the number accordingly: ");
		Scanner sc1 = new Scanner(System.in);
		int userInput = sc1.nextInt();
		double loanAmtPayed = 0.0;
		switch (userInput) {
		case 1:
			loanAmtPayed = loanAmt/(tenure*12d);
			break;
		case 2:
			loanAmtPayed = loanAmt/(tenure*6d);
			break;
		case 3:
			loanAmtPayed = loanAmt/(tenure*3d);
			break;
		
		default:
			System.out.println("Invalid operation!!");
			break;
		}
		return loanAmtPayed;
	}
	
	
}
	
		
		


