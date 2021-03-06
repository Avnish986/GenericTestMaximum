package com.cg.test.max;
import java.util.ArrayList;

import org.junit.*;
import org.junit.Assert;
public class TestMaximumTest {
	@Test
	public void givenFirst_Greater_ShouldReturnFirstInteger() {
		TestMaximum test = new TestMaximum<Integer>(100,90,80,70);
		ArrayList<Integer> array = new ArrayList<>();
    	array = test.addVal();
		Integer result = (Integer) test.maximumInArrayList(array);
		boolean finalResult=false; 
		if(result == 100) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecondInteger() {
		TestMaximum test = new TestMaximum<Integer>(90,100,80,70);
		ArrayList<Integer> array = new ArrayList<>();
		array = test.addVal();
		Integer result = (Integer) test.maximumInArrayList(array);
		boolean finalResult=false; 
		if(result == 100) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThirdInteger() {
		TestMaximum test = new TestMaximum<Integer>(90,80,100,70);
		ArrayList<Integer> array = new ArrayList<>();
    	array = test.addVal();
		Integer result = (Integer) test.maximumInArrayList(array);
		boolean finalResult=false; 
		if(result == 100) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnFirstFloat() {
		TestMaximum test = new TestMaximum<Float>(100f,90f,80f,70f);
		ArrayList<Float> array = new ArrayList<>();
    	array = test.addVal();
		Float result = (Float) test.maximumInArrayList(array);
		boolean finalResult=false; 
		if(result == 100f) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecondFloat() {
		TestMaximum test = new TestMaximum<Float>(90f,100f,80f,70f);
		ArrayList<Float> array = new ArrayList<>();
    	array = test.addVal();
		Float result = (Float) test.maximumInArrayList(array);
		boolean finalResult=false; 
		if(result == 100f) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThirdFloat() {
		TestMaximum test = new TestMaximum<Float>(90f,80f,100f,70f);
		ArrayList<Float> array = new ArrayList<>();
    	array = test.addVal();
		Float result = (Float) test.maximumInArrayList(array);
		boolean finalResult=false; 
		if(result == 100f) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnFirstString() {
		TestMaximum test = new TestMaximum<String>("peach","banana","apple","cat");
		ArrayList<String> array = new ArrayList<>();
    	array = test.addVal();
		String result = (String) test.maximumInArrayList(array);
		boolean finalResult=false; 
		if(result.equalsIgnoreCase("peach")) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecondString() {
		TestMaximum test = new TestMaximum<String>("banana","peach","apple","cat");
		ArrayList<String> array = new ArrayList<>();
    	array = test.addVal();
		String result = (String) test.maximumInArrayList(array);
		boolean finalResult=false; 
		if(result.equalsIgnoreCase("peach")) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThirdString() {
		TestMaximum test = new TestMaximum<String>("banana","apple","peach","cat");
		ArrayList<String> array = new ArrayList<>();
    	array = test.addVal();
		String result = (String) test.maximumInArrayList(array);
		boolean finalResult=false; 
		if(result.equalsIgnoreCase("peach")) {
		finalResult = true;
		} 
		Assert.assertEquals(true, finalResult);;
	}
}