package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz");
        int age = scan.nextInt();

        System.out.println("kilonuzu giriniz");
        double weight = scan.nextDouble();

        if (age < 0) {
            System.out.println("lüften geçerli yaş giriniz");
        } else if (age < 18 || weight < 50) {
            System.out.println("kan bağışı yapamaz");
        } else {
            System.out.println("kan bağışı yapabilir");
        }

        scan.close();

    }

}
