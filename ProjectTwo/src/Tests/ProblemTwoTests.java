package Tests;

import static org.junit.Assert.*;
import main.ProblemTwo;

import org.junit.Test;

public class ProblemTwoTests {
	
	@Test
	public void sumOfEvenNumbersTest() {
		int result = 0, expected = 0, cap = 4000000;
		
		result = ProblemTwo.sumOfEvenNumbersFibonacci(cap);
		expected = 4613730;
		
		assertEquals(result, expected);
	}


}
