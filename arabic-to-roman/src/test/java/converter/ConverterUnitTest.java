package converter;

import org.junit.Assert;
import org.junit.Test;

import converter.domain.*;

public class ConverterUnitTest {

	@Test 
	public  void converterToRomanUnitTest() {
		//arrange
		double x =100;
		
		//Act
		String result1 = Converter.converterToRoman(x);
		String result = "C";
		
		//Assert
		Assert.assertEquals(result, result1);
	}
}