package com.home.practice.BasicInput;

import java.util.Scanner;

public class Integer4mSystemin {
	
	public static void main (String args[])
	{
		int firstnum,secnum;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 num ");
		firstnum = sc.nextInt();
		System.out.println("Enter 2 num ");
		secnum = sc.nextInt();
		int sum =(firstnum+secnum);
		
		System.out.println("Sum is "+sum);
		
	}

}
