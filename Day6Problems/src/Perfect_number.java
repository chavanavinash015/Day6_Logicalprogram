import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		System.out.println("Enter Any Number");

		int Number = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		Number = sc.nextInt();

		for (int index = 1; index < Number; index++) {
			if (Number % index == 0) {
				sum = sum + index;
			}
		}
		if (Number == sum)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");

	}
}

