package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        String str = "Abdulsamet Kaya";

        String name = str.substring(0,str.indexOf(" "));
        String surname = str.substring(str.indexOf(" ") + 1);
        System.out.println(name);
        System.out.println(surname);




    }
}
