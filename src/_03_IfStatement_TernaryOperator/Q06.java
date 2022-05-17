package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen x değerini giriniz");
        int x = scanner.nextInt();
        System.out.println("Lütfen y değerini giriniz");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("girdiginiz degerler 1. bölgeye ait");
        } else if (x < 0 && y > 0) {
            System.out.println("girdiginiz degerler 2. bölgeye ait");
        } else if (x < 0 && y < 0) {
            System.out.println("girdiginiz degerler 3. bölgeye ait");
        } else if (x > 0 && y < 0) {
            System.out.println("girdiginiz degerler 4. bölgeye ait");
        } else if (x != 0) {
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        } else if (y != 0) {
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        } else System.out.println("girdiginiz degerler orjin'dedir");

        scanner.close();

    }
}
