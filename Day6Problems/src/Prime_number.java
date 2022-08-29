import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		System.out.println("Enter Any Number");

		int Number = 0;
		int Count = 0;

		Scanner sc = new Scanner(System.in);
		Number = sc.nextInt();

		for (int index = 1; index <= Number; index++) {

			if (Number % index == 0) {

				Count++;
			}
		}
		if (Count == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");

	}

}