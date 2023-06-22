import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		int number = sc.nextInt();

		while (number != 0) {
			sum += number;
			number = sc.nextInt();
		}

		System.out.printf("Total: %d%n", sum);

		sc.close();
	}

}
