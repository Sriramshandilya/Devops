package devops.numbers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberWordstests {
private NumberWordsApplication convert;
	
	
	@Before
	public void setup(){	
	NumberWordsApplication convert = new NumberWordsApplication();
	}
	
	@Test
	public void numberReturnZero(){
		String result = convert.convert(0);
		assertEquals("", result);
	}
	
	@Test
	public void numberReturnOne(){
		String result = convert.convert(1);
		assertEquals("One", result);
	}
	
	@Test
	public void numberReturnInvalid(){
		String result = convert.convert(-1);
		assertEquals("Minus One", result);
	}
	
	@Test
	public void numberReturn5Digits(){
		String result = convert.convert(12345);
		assertEquals("Twelve Thousand Three Hundred Forty Five", result);
	}
	
	@Test
	public void numberMillion(){
		String result = convert.convert(1000000);
		assertEquals("Ten Lakh", result);
	}
	@Test
	public void numberBillion(){
		String result = convert.convert(2000000000);
		assertEquals("Two Hundred Crore", result);
	}
	
}
