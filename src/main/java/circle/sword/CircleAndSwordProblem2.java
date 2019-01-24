package circle.sword;

import java.util.Scanner;

/**
 * This class contains second approach to solve the 
 * Circle and sword problem.
 * @author vipul jain
 *
 */

public class CircleAndSwordProblem2 {
	
	public static void main(String[] args)
	{
		int a,b;
		
		
		// Entering total number of Person standing in a round table
		System.out.println("The total nummber of person standing in a round table is"); 
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();

		b=a;
		int index=0;
		int total=0;

		/**
		 * make sure that you will never get index out of bound Exception?
		 */
		int[] ar= new int[40];
		int[] ar2= new int[40];
		int[] ar3= new int[40];
		

		/**
		 * Finding out number of round till last person remains
		 */
		while(b > 0) 
		{
			ar2[index++] = b%2;
			b = b/2;
		}

		for(int k=0;k<index;k++)
		{
			ar[k]=ar2[index-k-1];
		}

		for(int l=0;l<index-1;l++)
		{
			ar3[l]=ar[l+1];
		}

		ar3[index-1]=ar[0];

		for(int g = 0; g < index; g++) 
		{
			total += (Math.pow(2,g) * ar3[index - g - 1]);
		}
		/**
		 * Below position is mapped with index.
		 * So if you count men from 1 then actual person will be position + 1
		 */
		System.out.println("The last standing living man is person standing at " +(total-1)+"th position"); 
	}


}
