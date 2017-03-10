package org.javacream.asc.training.test;

import org.junit.Assert;
import org.junit.Test;

public class StringBuilderTests {

	@Test
	public void testStringBuilder(){
		StringBuilder sb = new StringBuilder("Hugo");
		Assert.assertEquals("Hugo", sb.toString());
		sb.append("-Emil");
		Assert.assertEquals("Hugo-Emil", sb.toString());
		//...
		Assert.assertTrue(sb.toString().startsWith("Hugo"));
		System.out.println(sb.toString());
		
	}
	@Test
	public void dies(){
		
	}
	public void das(){
		
	}
}
