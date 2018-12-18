package com.mplatform.learn;


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
	 
	 double getExchangeRates(int arrayIndex)
	 {
		 return exchangeRates[arrayIndex];
	 }
	 
	 double computeTransferAmount(int arrayIndex, double amount)
	 {
		 return amount * getExchangeRates(arrayIndex);
	 }
	 
 void printCurrencies() {
	     System.out.println("\nrupee: " + exchangeRates[0]);
	     System.out.println("dirham: " + exchangeRates[1]);
	     System.out.println("real: " + exchangeRates[2]);
	     System.out.println("chilean_peso: " + exchangeRates[3]);
	     System.out.println("mexican_peso: " + exchangeRates[4]);
	     System.out.println("_yen: " + exchangeRates[5]);
	     System.out.println("$australian: " + exchangeRates[6]);
	     System.out.println("$Euro: " + exchangeRates[exchangeRates.length-2]);
    }
	   
    public static void main(String[] args) {
	     CurrencyConverter1 ec = new CurrencyConverter1();
	     
	     //jan1st
	     double[] rates=  {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
	     ec.setexchangeRates(rates);
	     
	     int lengthoFArray = rates.length;
	     
	     System.out.println("lengthoFArray:" +lengthoFArray);
	     System.out.println("JAN1st:");
	    ec.printCurrencies();
	    //jan2nd
	     rates=  new double[]  {66.0, 3.0, 3.0, 595.5, 108.0, 107.0, 2.0};
	     ec.setexchangeRates(rates);
	     System.out.println("JAN2nd:");
		 ec.printCurrencies();
		 
		 
		 
		 //Update with new Value
		 System.out.println("Update with new Value for Australian Dollar:");
		 ec.updateexchangeRate(6, 1000);
		 ec.printCurrencies();
		
		 
		 //Get Exchange Rates
		 
		 System.out.println("Get Exchange Rates:");
		 double exchangerate= ec.getExchangeRates(0);
		 System.out.println("Exchange Rates:"+exchangerate);
		 
		 //Transfer amount
		 System.out.println("Transfer amount:");
		 double TransferAmount = ec.computeTransferAmount(0,2000);
		 System.out.println("TransferAmount is "+TransferAmount);
		 
		 
		 
		 
    }
}