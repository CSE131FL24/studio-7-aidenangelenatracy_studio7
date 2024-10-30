package studio7;

public class Fractions {
	private double numerator;
	private double denominator;
	public Fractions(double numerator, double denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public Fractions adding(Fractions a, Fractions b) {
	double newnumerator = a.numerator*b.denominator+b.numerator*a.denominator;
	double newdenominator = (a.denominator*b.denominator);
	return new Fractions(newnumerator, newdenominator);
	}
	public Fractions multiplying(Fractions a, Fractions b) {
		double newnumerator = a.numerator * b.numerator;
		double newdenominator = (b.denominator * a.denominator);
		return new Fractions(newnumerator, newdenominator);
	}
	public double reciprocal(Fractions a) {
		return (a.denominator/a.numerator);
	}


}
