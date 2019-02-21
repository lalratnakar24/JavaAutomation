package com.java.learn.udemy;


public class CurrencyConverter1 {
 
	 double[] exchangeRates ;
	
	 void setexchangeRates(double[] rates)
	 {
		 exchangeRates = rates;
	 }
	 
	 void updateexchangeRate(int arrayIndex, double newVal)
	 {
		 exchangeRates[arrayIndex] = newVal;
	 }
 void printCurrencies() {
	     System.out.println("\nrupee: " + exchangeRates[0]);
	     System.out.println("dirham: " + exchangeRates[1]);
	     System.out.println("real: " + exchangeRates[2]);
	     System.out.println("chilean_peso: " + exchangeRates[3]);
	     System.out.println("mexican_peso: " + exchangeRates[4]);
	     System.out.println("_yen: " + exchangeRates[5]);
	     System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);
	     System.out.println("$australian: " + exchangeRates[exchangeRates.length-2]);
    }
	   
    public static void main(String[] args) {
	     CurrencyConverter1 ec = new CurrencyConverter1();
	     
	     //jan1st
	     double[] rates=  {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
	     ec.setexchangeRates(rates);
		 ec.printCurrencies();

	     rates=  new double[]  {66.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
	     ec.setexchangeRates(rates);
		 ec.printCurrencies();
		 ec.updateexchangeRate(0, 77);
		 ec.printCurrencies();
		
    }
}