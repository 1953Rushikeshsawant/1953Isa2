
public class Calculator {

	private double number1;
	private double number2;
	
	
	public Calculator(double number1, double number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public double sum() {
		double sum=number1+number2;
		return sum;
	}
	
	public double multiplication() {
		double mult=number1*number2;
		return mult;
	}
	
	public double difference() {
		double diff= number1-number2;
		return diff;
	}
	
	
	
}
