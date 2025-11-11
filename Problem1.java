import java.util.Scanner;

public class Problem1 {

	public double calculate(double a, double b, String operation) {
		switch (operation) {
		case "Addition":
			return a + b;
		case "Subtraction":
			return a - b;
		case "Multiplication":
			return a * b;
		case "Division":
			if (b != 0) {
				return a / b;
			} else {
				System.err.println("Error: divided by zero");
				return 0;
			}
		default:
			System.err.println("Invalid Input");
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value a");
		double a = scan.nextDouble();

		System.out.println("Enter the value b");
		double b = scan.nextDouble();

		System.out.println("Enter the operation(Addition, Subtraction, Multiplication, Division)");
		String op = scan.next();

		Problem1 pm = new Problem1();
		double result = pm.calculate(a, b, op);
		System.out.println("Result: " + result);
		scan.close();
	}

}
