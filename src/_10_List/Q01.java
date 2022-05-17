package _10_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().contains("a")) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);


    }


}
