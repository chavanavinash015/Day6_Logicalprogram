import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
		char input = ' ';
		long Start = 0;
		long End = 0;
		double timeElapsed = 0;
		System.out.println("Enter any Character to start the Stopwatch");
		Scanner sc = new Scanner(System.in);
		input = sc.next().charAt(0);
		Start = System.currentTimeMillis();
		System.out.println("Enterany Character to Stop the Stopwatch");
		input = sc.next().charAt(0);
		End = System.currentTimeMillis();
		timeElapsed=(End - Start)/1000;
		System.out.println("Time Elapsed : " + timeElapsed+  "sec" );
				
	}

}