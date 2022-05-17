package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "";
        int i = 1;

        while (i != 0) {

            System.out.println("harf giriniz");
            str = scan.next();
            switch (str) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("Sesli Harftir");
                    break;
                default:
                    System.out.println("hatalı giris");
            }

            System.out.println("--------------------------");

            System.out.println("çıkmak için 0 a basınız devam etmek için herhangi bir rakama basınız");

            i += scan.nextInt();


        }


    }

}


