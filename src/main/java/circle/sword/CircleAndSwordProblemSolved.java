package circle.sword;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircleAndSwordProblemSolved {

	public static void main(String args[]) {

		System.out.println("Please enter the number of men  to join the circle -");
		System.out.println("");

		/**
		 * Assumption made that user will not test this with number out of the range of
		 * integer if not so the case then Change the type of static variable as long
		 * and change the input method also.
		 */
		Scanner sc = new Scanner(System.in);
		int numberOfMen = sc.nextInt();
		sc.close();
		
		CircleAndSwordSolutionMatrix solution = new CircleAndSwordSolutionMatrix();
		solution.invokeProcessingRounds(numberOfMen);
		
		

	}
}
