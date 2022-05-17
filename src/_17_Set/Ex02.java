package _17_Set;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */

    public static void main(String[] args) {

        List<Integer> list1;
        List<Integer> list2;
        List<Integer> list3;

        list1 = arraylistHazirla(10, 6, 20);
        list2 = arraylistHazirla(5, 0, 20);

        System.out.println(list1);
        System.out.println(list2);

        list3 = listKarsilastir(list1, list2);
        System.out.println(list3);


    }


    private static List<Integer> listKarsilastir(List<Integer> list1, List<Integer> list2) {
        List<Integer> karsilastirList = new ArrayList<>();

        for (Integer each : list1) {
            for (Integer i : list2) {
                if ((int) each == i && !karsilastirList.contains(each)) {
                    karsilastirList.add(each);
                }
            }
        }


        return karsilastirList;
    }

    @NotNull
    private static List<Integer> arraylistHazirla(int size, int min, int max) {

        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list1.add((int) (min + Math.random() * (max - min + 1)));
        }
        return list1;
    }
}
