package com.home.practice.BasicInput;
public class ComandLineInput 
{
	public static void  main(String[] args)
	{
		String fname,lname;
		fname=args[0];
		lname=args[1];
		System.out.println("Comand Welcome "+fname+"  "+lname );
	
	}
}

// to give the command line input in eclipse >> run as configuration and then in Argument tab give the input you want to give
// if u dont give the input while running this code you will get outOfbound Exception


