package circle.sword;

/**
 * 
 * @author vipul
 * This class represents every Persion in the circle 
 * with their index as it starts with 0
 * And their position as logically person standing at 0th index
 * Is actually 1st position.
 */
public class Killer {

	private int index;
	private int position;
	
	public Killer(int index) {
		this.index = index;
		this.position = index + 1;
	}
	
	public int getIndex() {
		return this.index;
	}
	public int getPosition() {
		return this.position;
	}
}
