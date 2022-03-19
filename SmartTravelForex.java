package test;

//package com.jap.masterychallenge1;

import java.util.Scanner;

public class SmartTravelForex {

    /**
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */
    public static double currentExchangeRates(double amount, int choice) {
		double exchangedCurrency;
		double indian;
		
		if(amount>=0){
			if(choice==1){
				
				exchangedCurrency = amount/0.67;
			}
			else if(choice==2){
				exchangedCurrency = amount/85.37;
			}
			else if(choice==3){
				exchangedCurrency = amount/94.5;
			}
			else if(choice==4){
				exchangedCurrency = amount/74.3;
			}
			else{
				exchangedCurrency = amount/20.25;
			}
		}else{
			return -1;
		}
		
		return exchangedCurrency;
    }

    /**
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
		double indianRupee;
		double result;
		if(sourceCurrency==targetCurrency){
			return -1;
		}
		if(sourceCurrency==1){
			indianRupee= amountToBeConverted*0.67;
			result = currentExchangeRates(indianRupee,targetCurrency);
		}
		else if(sourceCurrency==2){
			indianRupee= amountToBeConverted*85.37;
			result = currentExchangeRates(indianRupee,targetCurrency);
		}
		else if(sourceCurrency==3){
			indianRupee= amountToBeConverted*94.5;
			result = currentExchangeRates(indianRupee,targetCurrency);
		}
		else if(sourceCurrency==4){
			indianRupee= amountToBeConverted*74.3;
			result = currentExchangeRates(indianRupee,targetCurrency);
		}
		else{
			indianRupee= amountToBeConverted*20.25;
			result = currentExchangeRates(indianRupee,targetCurrency);
		}
        
		return result;
    }

    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails() {
		System.out.println("The exchanges rates for each currency (1,10,20,50,100) in INR");
		System.out.println("   \t 1\t 10\t 20\t 50\t 100\t");
		System.out.println("JPY\t 0.67\t 6.7\t 13.4\t 33.5\t 67.0\t");
		System.out.println("EUR\t 85.37\t 853.7\t 1707.4\t 4268.5\t 8537.0\t");
		System.out.println("GBP\t 94.5\t 945.0\t 1890.0\t 4725.0\t 9450.0\t");
		System.out.println("USD\t 74.3\t 743.0\t 1486.0\t 3715.0\t 7430.0\t");
		System.out.println("AED\t 20.25\t 202.5\t 405.0\t 1012.0\t 2025.0\t");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = sc.nextInt();
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = sc.nextInt();
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted = sc.nextDouble();
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }

}

