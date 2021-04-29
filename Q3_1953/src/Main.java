
public class Main {

	public static void main(String[] args) {
		Calculator calculate=new Calculator(5.5,20.5);
		
		System.out.println("Sum :" + calculate.sum());
		System.out.println("Multiplication :" + calculate.multiplication());
		System.out.println("Difference :" + calculate.difference());

	}
}
