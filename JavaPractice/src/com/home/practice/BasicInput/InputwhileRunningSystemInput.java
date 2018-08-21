package com.home.practice.BasicInput;
import java.*;
import java.io.*;
public class InputwhileRunningSystemInput {
	public static void  main(String[] args) throws IOException
	{
	
	String fname,lname;
	DataInputStream dis = new DataInputStream(System.in);
	System.out.print("Enter First Name");
	fname=dis.readLine();
	System.out.println("Enter Second Name");
	lname=dis.readLine();
	System.out.print("SYstem Welcome "+fname+"  "+lname );


}}

//while usinng reaadLine function you must have to handle exception.
//print will take input in same line
//while println take the input in nextline. It insert a next line actually



