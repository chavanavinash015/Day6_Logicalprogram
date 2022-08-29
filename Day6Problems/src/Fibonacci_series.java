import java.util.Scanner;


public class Fibonacci_series {
	public static void main(String[] args) {
		int Number, a = 0, b = 1, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		Number = sc.nextInt();

		for (int index = 1; index <= Number; index++) {

			c = a + b;
			a = b;
			b = c;
			System.out.println(a+ "   ");
		}
	}

}

