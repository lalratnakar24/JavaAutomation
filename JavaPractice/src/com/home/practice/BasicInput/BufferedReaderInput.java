package com.home.practice.BasicInput;
import java.*;
import java.io.*;

public class BufferedReaderInput {
	
	public static void  main(String[] args) throws Exception
	{
		String fname,lname;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter First name:");
		fname=br.readLine();
		System.out.print("Enter Last name:");
		lname=br.readLine();
		System.out.println("Buffered Welcome "+fname+"  "+lname );
	
	}

	

}
