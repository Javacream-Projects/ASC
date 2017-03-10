package org.javacream.asc.training.test;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class PersonParserTest {

	@Test
	public void testReadPersonProperties() throws Exception{
		Properties personProperty = new Properties();
//		try {
			personProperty.load(getClass().getResourceAsStream("/sawitzki.properties"));
			Assert.assertEquals("Sawitzki", personProperty.getProperty("lastname"));
//		} catch (Exception e) {
//			System.out.println("Properties Datei nicht gefunden");
//		}
	}
}
