import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value a");
		int a = scan.nextInt();
		if (a % 2 == 0) {
			a = a - 1;
		}
		for (int i = 1; i <= 2 * a - 1; i += 2) {
			System.out.print(i + " ");
		}
		scan.close();
	}
}
