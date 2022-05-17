package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();
        int onlarBasamagi = (sayi / 10) % 10, birlerBasamagi = (sayi % 10), yuzlerBasamagi = sayi / 100;
        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBasamagi) {
                case 0 -> System.out.println(" ");
                case 1 -> System.out.println("yuz");
                case 2 -> System.out.println("ikiyuz");
                case 3 -> System.out.println("ucyuz");
                case 4 -> System.out.println("dortyuz");
                case 5 -> System.out.println("besyuz");
                case 6 -> System.out.println("altiyuz");
                case 7 -> System.out.println("yediyuz");
                case 8 -> System.out.println("sekizyuz");
                case 9 -> System.out.println("dokuzyuz");
            }
            switch (onlarBasamagi) {
                case 0 -> System.out.println(" ");
                case 1 -> System.out.println("on");
                case 2 -> System.out.println("yirmi");
                case 3 -> System.out.println("otuz");
                case 4 -> System.out.println("kirk");
                case 5 -> System.out.println("elli");
                case 6 -> System.out.println("altmis");
                case 7 -> System.out.println("yetmis");
                case 8 -> System.out.println("seksen");
                case 9 -> System.out.println("doksan");
            }
            switch (birlerBasamagi) {
                case 0 -> System.out.println(" ");
                case 1 -> System.out.println("bir");
                case 2 -> System.out.println("iki");
                case 3 -> System.out.println("uc");
                case 4 -> System.out.println("dort");
                case 5 -> System.out.println("bes");
                case 6 -> System.out.println("alti");
                case 7 -> System.out.println("yedi");
                case 8 -> System.out.println("sekiz");
                case 9 -> System.out.println("dokuz");
            }

        }



scan.close();

    }
}
