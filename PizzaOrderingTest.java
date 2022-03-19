package com.jap.pizzaorderingsystem;

import org.junit.*;

import test.PizzaOrdering;

import static org.junit.Assert.*;

public class PizzaOrderingTest {

	 PizzaOrdering pizzaOrdering;

	    @Before
	    public void setUp() {
	        pizzaOrdering = new PizzaOrdering();
	    }

	    @After
	    public void tearDown() {
	        pizzaOrdering = null;
	    }

	    /* NOTE: Write a minimum of 4 assert statements for each test case */

	    @Test
	    public void givenPizzaChoiceAndSizeCalculateBill() {
			assertEquals(0,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(0,1,"Regular"));
			assertEquals(450,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(100,1,"Medium"));
			assertEquals(100,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(100,2,"Regular"));
			assertEquals(600,pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(100,5,"Large"));
	    }

	    @Test
	    public void givenCrustChoiceEstimatePrice() {
			assertEquals(0,pizzaOrdering.estimatePriceOfCrust(0));
			assertEquals(60,pizzaOrdering.estimatePriceOfCrust(1));
			assertEquals(80,pizzaOrdering.estimatePriceOfCrust(2));
			assertEquals(70,pizzaOrdering.estimatePriceOfCrust(3));
	    }

	    @Test
	    public void givenToppingsChoiceEstimatePrice() {
			assertEquals(0,pizzaOrdering.estimatePriceOfToppings(0));
			assertEquals(80,pizzaOrdering.estimatePriceOfToppings(1));
			assertEquals(120,pizzaOrdering.estimatePriceOfToppings(2));
			assertEquals(0,pizzaOrdering.estimatePriceOfToppings(3));
	    }

	    @Test
	    public void givenCrustAndToppingsCostCalculateTotalBill() {
			assertEquals(600,pizzaOrdering.calculateBillWithCrustAndToppings(300,200,100));
			assertEquals(700,pizzaOrdering.calculateBillWithCrustAndToppings(400,200,100));
			assertEquals(300,pizzaOrdering.calculateBillWithCrustAndToppings(100,100,100));
			assertEquals(100,pizzaOrdering.calculateBillWithCrustAndToppings(100,0,0));
	    }

	    @Test
	    public void givenBreadChoiceCalculateTotalBill() {
			assertEquals(90,pizzaOrdering.calculateBillBasedOnChoiceOfBread(1,0));
			assertEquals(190,pizzaOrdering.calculateBillBasedOnChoiceOfBread(1,100));
			assertEquals(180,pizzaOrdering.calculateBillBasedOnChoiceOfBread(2,100));
			assertEquals(100,pizzaOrdering.calculateBillBasedOnChoiceOfBread(3,100));
		
	    }

	    @Test
	    public void givenDrinksChoiceCalculateTotalBill() {
			assertEquals(60,pizzaOrdering.calculateBillBasedOnDrinksChoice(1,0));
			assertEquals(60,pizzaOrdering.calculateBillBasedOnDrinksChoice(2,0));
			assertEquals(160,pizzaOrdering.calculateBillBasedOnDrinksChoice(2,100));
			assertEquals(0,pizzaOrdering.calculateBillBasedOnDrinksChoice(0,0));
			
	    }

	    @Test
	    public void givenTotalBillEstimateDiscountAmount() {
			assertEquals(45,pizzaOrdering.estimateDiscountAmount(900));
			assertEquals(100,pizzaOrdering.estimateDiscountAmount(1000));
			assertEquals(25,pizzaOrdering.estimateDiscountAmount(500));
			assertEquals(0,pizzaOrdering.estimateDiscountAmount(400));
	    }

	    @Test
	    public void givenDeliveryAndTipChargeCalculateFinalBill() {
			assertEquals(300,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(100,100,100));
			assertEquals(400,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(200,100,100));
			assertEquals(500,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(300,100,100));
			assertEquals(0,pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(0,0,0));
	    }


}
