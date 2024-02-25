package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Statment_Brancch_coverage.Statment_Brancch_coverage.statusClass.status;

public class testCheckOut {

	@Test
	public void test1()
	{
		status status = statusClass.status.GOLD;
		double cart = 3_000.0;
		int creditRating = 700;
		boolean result = CheckOut.checkOut(cart, creditRating, status);
		boolean expected = true;
		
		assertEquals(result,expected);
	}
	
	@Test
	public void test2()
	{
		status status = statusClass.status.GOLD;
		double cart = 4_000.0;
		int creditRating = 700;
		boolean result = CheckOut.checkOut(cart, creditRating, status);
		boolean expected = true;
		
		assertEquals(result,expected);
	}
	
	@Test
	public void test3()
	{
		status status = statusClass.status.GOLD;
		double cart = 5_000.0;
		int creditRating = 500;
		boolean result = CheckOut.checkOut(cart, creditRating, status);
		boolean expected = false;
		
		assertEquals(result,expected);
	}
	
	@Test
	public void test4()
	{
		status status = statusClass.status.SILVER;
		double cart = 3_000.0;
		int creditRating = 800;
		boolean result = CheckOut.checkOut(cart, creditRating, status);
		boolean expected = true;
		
		assertEquals(result,expected);
	}
	
	@Test
	public void test5()
	{
		status status = statusClass.status.BRONZE;
		double cart = 1_000.0;
		int creditRating = 500;
		boolean result = CheckOut.checkOut(cart, creditRating, status);
		boolean expected = true;
		
		assertEquals(result,expected);
	}
}
