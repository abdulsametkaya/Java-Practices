package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Boyunucu cm giriniz: ");
        double boy = scan.nextDouble();

        System.out.println("Kilonuzu kg giriniz: ");
        double kilo = scan.nextDouble();

        double bmi = kilo / ((boy / 100) * (boy / 100));

        if (bmi <= 20) {
            System.out.println("Oldukça zayıfsınız");
        } else if (bmi > 20 && bmi <= 25) {
            System.out.println("Normal sınırdasınız");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("Sisman kategoridesiniz");
        } else if (bmi > 30) {
            System.out.println("Obez kategoridesiniz");
        } else {
            System.out.println("gecerli sayı giriniz");
        }

        scan.close();
    }

}
