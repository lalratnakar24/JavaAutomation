package com.learn.basic;

public class CurrencyConverter01 {

	
	int rupee = 63;
	int dirham = 3; // UAE
	int real = 3;  // brazilian     
	int chilean_peso = 595;
	int mexican_peso = 18;       
	int _yen = 107;
	int $australian = 2;  // australian dollar
	int dollar;

	void   printCurrencies(){
		
		System.out.println("rupee: " + rupee);   
     	System.out.println("dirham:" + dirham);
     	System.out.println("real:" + real);
   		System.out.println("chilean_peso:" +chilean_peso);
   		System.out.println("mexican_peso:"+mexican_peso);
					System.out.println("_yen:"+_yen);
   		   System.out.println("$australian: " + $australian);		
   					 	   System.out.println("dollar:"+dollar);
   					 	System.out.println("rupee: " + rupee);  
	}
	public static void main(String[] args){
		CurrencyConverter01 cc = new CurrencyConverter01();
		cc.printCurrencies();
	}
}