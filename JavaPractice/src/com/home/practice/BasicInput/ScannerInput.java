package com.home.practice.BasicInput;

import java.util.*;

public class ScannerInput {
	
	public static void main (String arg[])
	{
		
		String lname,fname;
		System.out.print("Enter 1st Number");
		
		Scanner sc =new Scanner(System.in);
		fname = sc.nextLine();
		
		
		System.out.print("Enter 1st Number");
		lname =sc.nextLine();
		
		System.out.print("Scanner Print welcome " +fname+lname);
		
	}

}
