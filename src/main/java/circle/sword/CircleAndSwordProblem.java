package circle.sword;

import java.util.Scanner;

public class CircleAndSwordProblem {
	
	/**
	 * Find a number which should equal to 2 to the power X
	 * And number should be less than number of men
	 * @param num
	 * @return int
	 */
	static int highestPowerof2(int num) 
	   { 
	     int square = 0; 
	     for (int i =num; i>0;i--) 
	        { 
	         // If i is a power of 2 
	          if ((i & (i - 1)) == 0) 
	             { 
	               square = i; 
	               break; 
	             } 
	        } 
	     return square; 
	   } 

	public static void main(String[] args) {
		
		System.out.println("The total nummber of person standing in a round table is");
		
		// Variable should be enter for the no. of people in a circle
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		
		int square = (highestPowerof2(num)); 
		
		// (Total no. of people) - (nearest smaller number for power of 2)
		int rem = num - square; 
		
		// As indexing starts from 0
		int last = (2*rem); 
		
		/**
		 * Below position is mapped with index.
		 * So if you count men from 1 then actual person will be position + 1
		 */
		System.out.println("The last standing living man is person standing at " +last+"th position");
		
	}

}
