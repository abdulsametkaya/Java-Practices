package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Ogrenci sayisini giriniz");
        int ogrenciler = scan.nextInt();
        System.out.println("Ogrenci Notlarini Giriniz = ");
        int[] notlar = new int[ogrenciler];
        int sum = 0;
        for (int i = 0; i < ogrenciler; i++) {
            notlar[i] = scan.nextInt();
            sum += notlar[i];
        }
        double ortalama = (double) sum / ogrenciler;
        int count = 0;
        for (int i = 0; i < ogrenciler; i++) {
            if (notlar[i] > ortalama) {
                count++;
            }
        }

        System.out.println("ogrenci not ortalamasi = " + ortalama);
        System.out.println(count + " ogrenci ortalama ustu not almistir");

        System.out.println("================ Arraylist ====================");

        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Ogrenci sayisini giriniz");
        int num1 = scan.nextInt();
        int toplam = 0;
        for (int i = 0; i < num1; i++) {
            list.add(i, scan.nextDouble());
            toplam += list.get(i);
        }
        double ort = (double) sum / ogrenciler;
        int sayi = 0;
        for (int i = 0; i < ogrenciler; i++) {
            if (list.get(i) > (ort)) {
                sayi++;
            }
        }


        System.out.println("ogrenci not ortalamasi = " + ort);
        System.out.println(sayi + " ogrenci ortalama ustu not almistir");


    }
}
