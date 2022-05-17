package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println(" Toplama icin 1\n cıkarma icin 2\n carpma icin 3\n bolme icin 4");
		System.out.println("lütfen iki tam sayı giriniz: ");

		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		int islem = scan.nextInt();

		switch (islem) {
			case 1 -> System.out.println(num1 + num2);
			case 2 -> System.out.println(num1 - num2);
			case 3 -> System.out.println(num1 * num2);
			case 4 -> {
				if (num2 == 0) {
					System.out.println("Bolen sayı sıfır olamaz");
					break;
				}
				System.out.println(num1 / num2);
			}
			default -> System.out.println("geçerli sayı giriniz");
		}

		scan.close();

	}

}
