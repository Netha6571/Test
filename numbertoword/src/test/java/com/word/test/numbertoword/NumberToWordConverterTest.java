package com.word.test.numbertoword;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class NumberToWordConverterTest 
{
	
	@InjectMocks
	private NumberToWordConverter numberToWordConverter;

	
	@Test
	public final void testTwoDigit(){
		
		int input=21;
		Assert.assertEquals(numberToWordConverter.convert(input),"twenty one");
		
	}
	
	

}
