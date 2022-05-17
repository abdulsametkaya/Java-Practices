package _06_Method_Creation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
        String name1 = "mehmet";
        String name2 = "ahmet";

        arasinaYazdirma(name1, name2);
    }

    private static void arasinaYazdirma(String name1, String name2) {

        if (name1.length() % 2 == 0) {
            System.out.println(name1.substring(0, name2.length() / 2 + 1) + name2 + name1.substring(name2.length() / 2 + 1));
        } else System.out.println(name1 + " cift sayili olmadigi icin ortasina yerlestiremedik");

    }


}
