package org.stepdefinition;
import java.util.Scanner;

public class accountdetials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter bank name  :");
		String bankname =s.nextLine();
		s.nextLine();
		System.out.println("enter branch name :");
		String branchname=s.nextLine();
		s.nextLine();
		System.out.println("enter customer name :");
		String customername=s.nextLine();
		s.nextLine();
		System.out.println("enter account number :");
		long accountnumber =s.nextLong();
		 s.nextLine();
		 System.out.println("enter saving balance :");
		 double savingbalance =s.nextDouble();
		 s.nextLine();
		 System.out.println("enter loan amount :");
		 double loanamount=s.nextDouble();
		 
		 
		 System.out.println("bank name :" +bankname);
		 System.out.println("branch name :"+branchname);
		 System.out.println("customer name :" +customername);
		 System.out.println("account numbere :" +accountnumber);
		 System.out.println("saving balance :" +savingbalance);
		 System.out.println("loan amount :" +loanamount);


	}

}
