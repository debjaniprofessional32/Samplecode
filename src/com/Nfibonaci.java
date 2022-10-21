package com;

import java.util.Scanner;

public class Nfibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n , firstTerm, secondTerm ;
		    System.out.println("Enter first number");
		 Scanner sc= new Scanner(System.in);
		       firstTerm=sc.nextInt();
		       System.out.println("Enter  second number");
		       Scanner sc2= new Scanner(System.in);
		       secondTerm=sc2.nextInt();
		       System.out.println("Fibonacci Series till ");
		     Scanner sc3= new Scanner(System.in);
		     n=sc3.nextInt();
		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstTerm + ", ");

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		
	}

}
