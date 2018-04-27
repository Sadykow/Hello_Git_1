package gitExerciseCalc;

public class ComplexNumber implements Calculator {
  double real;
  double complex;
  
  public ComplexNumber(double real,double complex){
		this.real = real;
		this.complex = complex;
  }
  
  @Override
  public String getResult() {
	  return String.valueOf(this.real + this.complex);
  }
}
