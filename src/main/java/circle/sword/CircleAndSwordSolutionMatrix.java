package circle.sword;

import java.util.ArrayList;
import java.util.List;

public class CircleAndSwordSolutionMatrix {
	
	/**
	 * Process the itterations and return the last man standing
	 * @param numberOfMen
	 * @return
	 */
	public Killer invokeProcessingRounds(int numberOfMen) {
		
		if(numberOfMen<=0) {
			System.out.println("Please provide a valid number");
			return new Killer(-1);
		}
		
		List<Killer> circle = new ArrayList<Killer>();

		for (int i = 0; i < numberOfMen; i++) {
			circle.add(new Killer(i));
		}

		int round = 0;
		while (circle.size() > 1) {
			round++;
			System.out.println("");
			System.out.println("**********************************");
			System.out.println("Round "+round+"  begins ....");
			System.out.println("**********************************");
			System.out.println("");
			
			for (int i = 0; i < circle.size(); i++) {
				Killer guilty = circle.get(i);
				Killer victim = circle.remove((i + 1) % circle.size());
				
				System.out.println("Man at index = " + guilty.getIndex() + " and position = " + guilty.getPosition()
						+ " Kills the man at index = " + victim.getIndex() + " and position = " + victim.getPosition());
				
			}

		}

		Killer lastMan = circle.get(0);
		System.out.println(
				"Last man alive is at index = " + lastMan.getIndex() + " and postion = " + lastMan.getPosition());
		
		return lastMan;
		
	}


}
