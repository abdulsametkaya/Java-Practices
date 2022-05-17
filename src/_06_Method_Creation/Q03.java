package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("cevirim yapacağınız islemi secin");
        String islem = scan.next().toLowerCase();
        System.out.println("cevirim miktarını girin");
        double miktar = scan.nextDouble();

        donustur(islem, miktar);
    }

    private static void donustur(String islem, double miktar) {

        switch (islem) {
            case "saat":
                System.out.println("merak edilen saniye " + miktar * 60 * 60);
                break;
            case "mil":
                System.out.println("merak edilen km " + miktar * 1.61);
                break;
            case "kg":
                System.out.println("merak edilen gram " + miktar * 1000);
                break;
            default:
                System.out.println("hatalı giris");

        }

    }
}

