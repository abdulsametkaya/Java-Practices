package _04_switchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("notunuzu yazınız: ");
		int num = scan.nextInt();
		scan.close();

	//	notOrtalamasi(num);
		if (num>0 && num<50){
			num = 1;
		}else if (num>= 50 && num<60){
			num = 2;
		}else if (num>=60 && num<80){
			num = 3;
		}else if(num>=80 && num<100){
			num = 4;
		}


		switch(num){
			case 1:
				System.out.println("Harf notunuz D");
			break;
			case 2:
				System.out.println("Harf notunuz C");
				break;
			case 3:
				System.out.println("Harf notunuz B");
				break;
			case 4:
				System.out.println("Harf notunuz A");
				break;
			default:
				System.out.println("geçerli not giriniz");
		}


	}

	private static void notOrtalamasi(int num) {

		if (num>0 && num<50){
			System.out.println("Harf notunuz D");
		}else if (num>= 50 && num<60){
			System.out.println("Harf notunuz C");
		}else if (num>=60 && num<80){
			System.out.println("Harf notunuz B");
		}else if (num>=80 && num<100){
			System.out.println("Harf notunuz A");
		}else{
			System.out.println("geçerli not giriniz");
		}


	}
}
