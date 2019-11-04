package converter;

import org.junit.Assert;
import org.junit.Test;

import converter.domain.*;

public class ConverterUnitTest {

	@Test 
	public  void converterToRomanUnitTest() {
		//arrange
		double a =5;
		double b = 10;
		double c = 50;
		double d = 100;
		double e = 999;
		
		//Act
		String resulta = Converter.converterToRoman(a);
		String expecteda = "V";
		
		String resultb = Converter.converterToRoman(b);
		String expectedb = "X";
		
		String resultc = Converter.converterToRoman(c);
		String expectedc = "L";
		
		String resultd = Converter.converterToRoman(d);
		String expectedd = "C";
		
		String resulte = Converter.converterToRoman(e);
		String expectede = "CMXCIX";
		
		//Assert
		Assert.assertEquals(resulta, expecteda);
		Assert.assertEquals(resultb, expectedb);
		Assert.assertEquals(resultc, expectedc);
		Assert.assertEquals(resultd, expectedd);
		Assert.assertEquals(resulte, expectede);
	}
}



