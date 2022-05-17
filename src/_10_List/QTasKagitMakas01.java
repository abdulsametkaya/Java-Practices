package _10_List;

import java.util.Random;
import java.util.Scanner;

public class QTasKagitMakas01 {

    public static void main(String[] args) {

        /* TASK:
         1tas >2makas
         makas >3kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int pcPuan = 0;
        int humanPuan = 0;
        int humanSecim = 0;
        int pcSecim;
        int exit = 1;
        while (exit != 0) {
            System.out.println("Tas icin 0 \nKagit icin 1 \nMakas icin 2 = ");
            humanSecim = scan.nextInt();
            pcSecim = (int)(Math.random()*3);

            if (humanSecim == pcSecim) {
                System.out.println(pcSecim);
                System.out.println("berabere");
            } else if (humanSecim == 0 && pcSecim == 1) {
                System.out.println(pcSecim);
                System.out.println("Kazandiniz");
                humanPuan++;
            } else if (humanSecim == 0 && pcSecim == 2) {
                System.out.println(pcSecim);
                System.out.println("Kaybettiniz");
                pcPuan++;
            } else if (humanSecim == 1 && pcSecim == 0) {
                System.out.println(pcSecim);
                System.out.println("Kaybettiniz");
                pcPuan++;
            } else if (humanSecim == 1 && pcSecim == 2) {
                System.out.println(pcSecim);
                System.out.println("Kazandiniz");
                humanPuan++;
            } else if (humanSecim == 2 && pcSecim == 1) {
                System.out.println(pcSecim);
                System.out.println("Kaybettiniz");
                pcPuan++;
            } else if (humanSecim == 2 && pcSecim == 0) {
                System.out.println(pcSecim);
                System.out.println("Kazandiniz");
                humanPuan++;
            }else {
                System.out.println("hatali giris");
            }
            System.out.println("bitirmek için 0'a tıklayiniz");
            exit = scan.nextInt();

        }

        System.out.println("====================== OYUN SONLANDIRILDI =========================");

        System.out.println("Toplam Pauniniz = " + humanPuan);
        System.out.println("Pc Puani = " + pcPuan);

        if (humanPuan>pcPuan){
            System.out.println("OYUN GALIBIYETLE SONUCLANDI");
        }else if (humanSecim<pcPuan){
            System.out.println("OYUN MAGLUBIYETLE SONUCLANDI");
        }else {
            System.out.println("BERABERE");
        }


    }
}



