package _07_ForLoop;

public class Q02 {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        for (char ch = 0; ch <= 255; ch++) {
            System.out.print(ch + " sayi degeri: " + (ch + 0));
            System.out.println("");
        }
    }
}


