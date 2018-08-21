package com.home.practice.BasicInput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Input4mFile {
	
	
	  public static void main(String[] args) throws IOException {
	  
		  
		  Scanner sc =new Scanner (new File("lal.txt"));
		  
		  int i = sc.nextInt();
		  System.out.println("The First Numbr is- "+i);
		  int j=sc.nextInt();
		  System.out.println("The Second Numbr is- "+j);
	        int sum =(i+j);
	        
	        System.out.println("from file sum is " +sum);
	        
	        

	  
	  }

}
