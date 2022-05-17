package kendiCozumlerim.Questions;

import java.util.Scanner;

public class Q2 {
    //Soru3:Kullanicidan bir sayi girmesini isteyin Girilen sayi
    //10ise“Iki basamakli en kucuk sayi
    //100 ise“uc basamakli en kucuk sayi”
    //1000 ise“dört basamakli en kucuk sayi”
    //Diğer durumlarda “Girdigin sayiyi degistir”yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayi girin");

        int num1 = scan.nextInt();

        switch (num1) {
            case 10:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir");
        }

        scan.close();

    }

}
