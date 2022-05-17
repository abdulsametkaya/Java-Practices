package _09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] arr = str.split(" ");
        int dolari = 0;
        String dolars = "";
        String pounds = "";
        int poundi = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")) {
                dolars = arr[i].replaceAll("\\D", "");
                dolari += Integer.parseInt(dolars);
            } else if (arr[i].contains("£")) {
                pounds = arr[i].replaceAll("\\D", "");
                poundi += Integer.parseInt(pounds);
            }
        }
        System.out.println(poundi);
        System.out.println(dolari);


    }
}


