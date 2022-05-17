package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
        Scanner scan = new Scanner(System.in);

        System.out.println("hızınızı yazınız");
        int hiz = scan.nextInt();
        System.out.println("ehliyetiniz var mı? E/H");
        char license = scan.next().toUpperCase().charAt(0);

        if (license == 'E') {
            if (hiz <= 0) {
                System.out.println("gecerli hız giriniz");
            } else if (hiz > 55 && hiz < 74) {
                System.out.println("penalty 100$");

            } else if (hiz > 75 && hiz < 84) {
                System.out.println("penalty 150$");
            } else if (hiz > 85 && hiz < 94) {
                System.out.println("penalty 320$");
            } else if (hiz > 95) {
                System.out.println("penalty 500$");
            } else {
                System.out.println("iyi yolculuklar");
            }

        } else if (license == 'H') {
            if (hiz > 55 && hiz < 74) {
                System.out.println("penalty 300$");
            } else if (hiz > 75 && hiz < 84) {
                System.out.println("penalty 350$");
            } else if (hiz > 85 && hiz < 94) {
                System.out.println("penalty 520$");
            } else if (hiz > 95) {
                System.out.println("penalty 700$");
            }
        } else {
            System.out.println("Do you have licence or not?");
        }

        scan.close();


    }
}
