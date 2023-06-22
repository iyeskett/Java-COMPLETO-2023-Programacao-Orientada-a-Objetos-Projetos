import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			sum += number;
		}

		System.out.printf("Total: %d%n", sum);

		sc.close();
	}

}
