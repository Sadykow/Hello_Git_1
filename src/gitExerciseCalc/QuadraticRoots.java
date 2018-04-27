package gitExerciseCalc;

public class QuadraticRoots {

	double a,b,c;
	
	public QuadraticRoots(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double x1() {
		return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}
	
	public double x2() {
		return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}
	
	public void changeCoefficients(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
}
