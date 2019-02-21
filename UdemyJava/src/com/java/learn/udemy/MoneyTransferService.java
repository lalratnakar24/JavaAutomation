package com.java.learn.udemy;

public class MoneyTransferService {

	public static void main(String[] args) {

        MoneyTransferService transferService = new MoneyTransferService();

        double transferAmount = transferService.computeTransferAmount(0, 1000);

        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);

        System.out.println("Transfer Fee: " + transferFee);

}

	private double computeTransferFee(int i, int j) {
        double TransferFee= 0.02*computeTransferAmount(i,j);		

		return TransferFee;
	}

	private double computeTransferAmount(int i, int j) {
	
		CurrencyConverter cc = new CurrencyConverter();
		
		double TransferAmount = cc.computeTransferAmount(i, j);
	
		return TransferAmount;
	}

	

	
	
	
}
