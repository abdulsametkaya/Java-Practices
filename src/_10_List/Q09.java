package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q09 {
    public static void main(String[] args) {
    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

       Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
        String str = "Learning java is easy";
        str = str.toLowerCase();

        char ch = ' ';
        int num1 = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > num1) {
                num1 = count;
                ch = str.charAt(i);
            }
            count = 0;
        }
        System.out.println("en cok tekrar eden harf = " + ch + " toplamda = " + num1 + " kez tekrar etmistir");

        System.out.println("====================== Arraylist cozumu ==================");

        String input = "Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.";


        String[] arr = input.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> list2 = new ArrayList<>(List.of("sa","dsa"));

        String str1 = "";
        int sayac = 0;
        int container = 0;
        for (int i = 0; i < list.size(); i++) {
            for (String s : list) {
                if (list.get(i).equalsIgnoreCase(s)) {
                    container++;
                }
            }
            if (container > sayac) {
                sayac = container;
                str1 = list.get(i);
            }
            container = 0;

        }
        System.out.println("en cok tekrar eden harf = " + str1 + " toplamda = " + sayac + " kez tekrar etmistir");
    }
}

