package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        String str = "Kullanicidan gelen cumleyi parametre olarak alan ve cumledeki en uzun kelimeyi" +
                " return eden LongestWord (sentence) methodu create ediniz.";
        String[] arr = str.split(" ");

        int sayac =0;
        int count = 0;
        String enUzun = "";
        for (String s : arr) {
            if (s.length() > sayac) {
                sayac = s.length();
                enUzun = s;
            }else if (s.length() == sayac){
                count++;
            }
        }

        System.out.println("CUMLEDEKI EN UZUN KELIME : " + enUzun + " UZUNLUGU : " + sayac + " HARF");
       if (count>0){
           System.out.println("AYNI UZUNLUKTA " + count + " KELIME DAHA VAR");
       }



    }
}
