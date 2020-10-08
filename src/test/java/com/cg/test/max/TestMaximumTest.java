package com.cg.test.max;
import org.junit.*;
import org.junit.Assert;
public class TestMaximumTest {
	@Test
	public void givenFirst_Greater_ShouldReturnFirstInteger() {
		TestMaximum test = new TestMaximum();
		Integer result = test.maximumOfThree(100, 90, 80);
		boolean finalResult=false; 
		if(result == 100) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecondInteger() {
		TestMaximum test = new TestMaximum();
		Integer result = test.maximumOfThree(90, 100, 80);
		boolean finalResult=false; 
		if(result == 100) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThirdInteger() {
		TestMaximum test = new TestMaximum();
		Integer result = test.maximumOfThree(90, 80, 100);
		boolean finalResult=false; 
		if(result == 100) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnFirstFloat() {
		TestMaximum test = new TestMaximum();
		Float result = test.maximumOfThree(100f, 90f, 80f);
		boolean finalResult=false; 
		if(result == 100f) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecondFloat() {
		TestMaximum test = new TestMaximum();
		Float result = test.maximumOfThree(90f, 100f, 80f);
		boolean finalResult=false; 
		if(result == 100f) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThirdFloat() {
		TestMaximum test = new TestMaximum();
		Float result = test.maximumOfThree(90f, 80f, 100f);
		boolean finalResult=false; 
		if(result == 100f) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnFirstString() {
		TestMaximum test = new TestMaximum();
		String result = test.maximumOfThree("peach", "banana", "apple");
		boolean finalResult=false; 
		if(result.equalsIgnoreCase("peach")) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecondString() {
		TestMaximum test = new TestMaximum();
		String result = test.maximumOfThree("banana", "peach", "apple");
		boolean finalResult=false; 
		if(result.equalsIgnoreCase("peach")) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThirdString() {
		TestMaximum test = new TestMaximum();
		String result = test.maximumOfThree("banana", "apple", "peach");
		boolean finalResult=false; 
		if(result.equalsIgnoreCase("peach")) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
}