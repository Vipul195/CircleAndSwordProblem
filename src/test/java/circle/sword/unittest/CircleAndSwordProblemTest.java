package circle.sword.unittest;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import circle.sword.CircleAndSwordProblem;
import circle.sword.CircleAndSwordSolutionMatrix;
import circle.sword.Killer;

public class CircleAndSwordProblemTest {
	
	/**
	 * for number of men as negative in circle 
	 * function should return a killer object with negative index value.
	 * this will work as test data
	 */
	@Test
	public void  testWithNegativeValueOfMen() {
		CircleAndSwordSolutionMatrix solution = new CircleAndSwordSolutionMatrix();
		Killer lastMan = solution.invokeProcessingRounds(-10);
		AssertJUnit.assertTrue("Last Man returned should be at index -1 got index "+lastMan.getIndex() , lastMan.getIndex() == -1);
	}
	
	/**
	 * Write a test with 1000 men
	 * and validate against the right index 976 as in above case.
	 */
	@Test
	public void  testWith1000MenInCircle() {
		CircleAndSwordSolutionMatrix solution = new CircleAndSwordSolutionMatrix();
		Killer lastMan = solution.invokeProcessingRounds(1000);
		AssertJUnit.assertTrue("Last Man returned should be at index 976 got index "+lastMan.getIndex() , lastMan.getIndex() == 976);
	}
	
	/**
	 * To test 2 to power n should be less than given number of people in a circle table
	 * and validate against the 10 men
	 */
	@Test
	public void testpowerof2() {
		CircleAndSwordProblem power = new CircleAndSwordProblem();
		int value = power.highestPowerof2(10);
		AssertJUnit.assertTrue("Nearest Power of 2 Value for 10 is" + value, power.highestPowerof2(10) ==8 );
	}
	

}
