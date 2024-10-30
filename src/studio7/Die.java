package studio7;

public class Die {
	
	private int sides;
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int roll(int sides) {
		return (int)Math.random()*(sides-1)+1;
	
	}
	
}
	
	