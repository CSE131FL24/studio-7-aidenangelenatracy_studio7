package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	private double perimeter;
	

	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		this.area = length * width;
		this.perimeter = length + length + width + width;
		
	}
	
	public boolean compare(Rectangle a, Rectangle b) {
		if (a.area >= b.area) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public boolean isSquare(Rectangle c) {
		if (c.length == c.width) {
			return true;
		} else {
			return false;
		}
	}
	

}

