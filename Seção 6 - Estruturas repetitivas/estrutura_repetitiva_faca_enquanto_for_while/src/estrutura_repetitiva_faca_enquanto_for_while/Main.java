package estrutura_repetitiva_faca_enquanto_for_while;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char r;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();

			double fahrenheit = (9.0 * celsius) / 5.0 + 32.0;
			System.out.printf("Equivalente em fahrenheit: %.1f%n", fahrenheit);

			System.out.print("Deseja repetir (s/n)? ");
			r = sc.next().charAt(0);

		} while (r != 'n');

		sc.close();
	}

}
