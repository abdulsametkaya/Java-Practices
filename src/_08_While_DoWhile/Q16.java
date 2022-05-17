package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        int i = 0;
        boolean bl = false;
        int kalanHak = 3;
        do {
            System.out.println("Pin kodunu giriniz:");
            String pin = scan.nextLine();

            if (pin.equals("samet")) {
                bl = true;
                break;
            } else System.out.println("yanlış şifre lütfen Tekrar deneyiniz" + "\nkalan hakkınız = " + (--kalanHak));

            i++;
        } while (i < 3);

        if (bl) {
            System.out.println("giriş başarı ile gerçekleşti");
        } else System.out.println("şifreniz bloke olmuştur");


    }
}
