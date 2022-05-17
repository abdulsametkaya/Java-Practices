package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
  /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
  çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
   */
    public static void main(String[] args) {



      System.out.println("yapmak istediğiniz işlemi seçiniz");
      Scanner scanner = new Scanner(System.in);
      int islem = scanner.nextInt();
      scanner.close();

      switch(islem){
        case 1:
          paraCekme();
          break;
        case 2:
          paraYatirma();
          break;
        case 3:
          bakiyeOgren();
          break;
        case 4:
          exitBank();
          break;
      }





    }

  private static void exitBank() {
    System.out.println("cikis yapilmistir.");
  }
  private static void bakiyeOgren() {
    int bakiye =1000;
    System.out.println( "bakiyeniz: " + bakiye);
  }
  private static void paraYatirma() {
    int yatirim = 2000;
    int bakiye =1000;
    System.out.println("Yatirmak istediğiniz miktar: " + yatirim);
    bakiye += yatirim;
    System.out.println("Yeni bakiyeniz: " + bakiye);

  }
  private static void paraCekme() {
    int cekme = 2000;
    int bakiye =1000;
    bakiye -= cekme;
    System.out.println("Yeni bakiyeniz: " + bakiye);
  }
}

