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
}