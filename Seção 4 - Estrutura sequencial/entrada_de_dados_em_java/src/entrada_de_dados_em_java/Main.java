package entrada_de_dados_em_java;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		String x;
//		x = sc.next();

//		int x;
//		x = sc.nextInt();

//		double x;
//		x = sc.nextDouble();

//		System.out.printf("Você digitou: %.2f%n", x);

//		char x;
//		x = sc.next().charAt(0);

//		String x;
//		int y;
//		double z;
//		
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		
//		System.out.println("Dados digitados:");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
//		System.out.println("Você digitou: " + x);

		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
