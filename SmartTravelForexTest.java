package test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import org.junit.Test;

//package com.jap.masterychallenge1;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
public class SmartTravelForexTest 
{
static final double JPY = 0.67;
static final double EUR = 85.37;
static final double GBP = 94.5;
static final double USD = 74.3;
static final double AED = 20.25;
  @Test
  public void givenCurrencyChoiceAndAmountReturnExchangeRateInINR()
  {
      assertEquals(100*JPY, SmartTravelForex.currentExchangeRates(100, 1));
      assertEquals(367.67*EUR, SmartTravelForex.currentExchangeRates(367.67, 2));
      assertEquals(56.89*GBP, SmartTravelForex.currentExchangeRates(56.89, 3));
      assertEquals(78.80*USD, SmartTravelForex.currentExchangeRates(78.80, 4));
      assertEquals(66.99*AED, SmartTravelForex.currentExchangeRates(66.99, 5));
  }
  @Test
  public void givenCurrencyChoiceAndAmountInNegativeReturnExchangeRateInINR()
  {
	 
    assertEquals(-1, SmartTravelForex.currentExchangeRates(-100, 1));
    assertEquals(-1, SmartTravelForex.currentExchangeRates(-33, 2));
    assertEquals(-1, SmartTravelForex.currentExchangeRates(-56, 3));
    assertEquals(-1, SmartTravelForex.currentExchangeRates(-10, 4));
    assertEquals(-1, SmartTravelForex.currentExchangeRates(-98, 5));

  }

  @Test
  public void givenCurrencyInJPYConvertToTargetCurrency()
  {
    double convertedAmountToINR = 366.99 * JPY;
    assertEquals((convertedAmountToINR/EUR),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(1, 2, 366.99));
    assertEquals((convertedAmountToINR/GBP),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(1, 3, 366.99));
    assertEquals((convertedAmountToINR/USD),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(1, 4, 366.99));
    assertEquals((convertedAmountToINR/AED),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(1, 5, 366.99));
    
  }
  @Test
  public void givenCurrencyInEURConvertToTargetCurrency()
  {
    double convertedAmountToINR = 366.99 * EUR;
    assertEquals((convertedAmountToINR/JPY),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(2, 1, 366.99));
    assertEquals((convertedAmountToINR/GBP),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(2, 3, 366.99));
    assertEquals((convertedAmountToINR/USD),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(2, 4, 366.99));
    assertEquals((convertedAmountToINR/AED),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(2, 5, 366.99));
    
  }
  @Test
  public void givenCurrencyInGBPConvertToTargetCurrency()
  {
    double convertedAmountToINR = 366.99 * GBP;
    assertEquals((convertedAmountToINR/JPY),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(3, 1, 366.99));
    assertEquals((convertedAmountToINR/EUR),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(3, 2, 366.99));
    assertEquals((convertedAmountToINR/USD),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(3, 4, 366.99));
    assertEquals((convertedAmountToINR/AED),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(3, 5, 366.99));
    
  }

  @Test
  public void givenCurrencyInUSDConvertToTargetCurrency()
  {
    double convertedAmountToINR = 366.99 * USD;
    assertEquals((convertedAmountToINR/JPY),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(4, 1, 366.99));
    assertEquals((convertedAmountToINR/EUR),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(4, 2, 366.99));
    assertEquals((convertedAmountToINR/GBP),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(4, 3, 366.99));
    assertEquals((convertedAmountToINR/AED),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(4, 5, 366.99));
    
  }
  @Test
  public void givenCurrencyInAEDConvertToTargetCurrency()
  {
    double convertedAmountToINR = 366.99 * AED;
    assertEquals((convertedAmountToINR/JPY),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(5, 1, 366.99));
    assertEquals((convertedAmountToINR/EUR),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(5, 2, 366.99));
    assertEquals((convertedAmountToINR/GBP),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(5, 3, 366.99));
    assertEquals((convertedAmountToINR/USD),SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(5, 4, 366.99));
    
  }
@Test
  public void givenSourceCurrencyEqualToTargetCurrency()
{
  assertEquals(-1,SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(1,1,100.0));
  assertEquals(-1,SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(2,2,100.0));
  assertEquals(-1,SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(3,3,100.0));
  assertEquals(-1,SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(4,4,100.0));
  assertEquals(-1,SmartTravelForex.convertGivenCurrencyIntoDesiredCurrency(5,5,100.0));
}

}



