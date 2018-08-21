package com.home.practice.BasicInput;

public class IntegerfrmCommandLine {

	
	public static void main (String args[])
	{
		int firstnum,secnum;
		
		
		firstnum = Integer.parseInt(args[0]);
		secnum= Integer.parseInt(args[1]);
		
	int sum = (firstnum +secnum);
	 
	 System.out.println("Input command line sum is"+sum);
		
	}
}
