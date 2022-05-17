package projects.P11_depoYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static cosmos.depo.Depo.B;
import static cosmos.depo.Depo.R;

public class Operations {
    Scanner scan = new Scanner(System.in);
    List<Urunler> urunlist = new ArrayList<>();
    static int count = 0;


    public void secim() {

        System.out.println(R + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-URUN LISTESI  |            | 2-URUN TANIMLA|  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3-URUN RAFLAMA  |            | 4-URUN GIRIS     |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-URUN CIKIS    |            | 6-CIKIS           |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);

        System.out.print("ISLEM SECİNİZ : ");
        int sec = 0;
        boolean bl = true;
        while (bl) {
            try {
                sec = scan.nextInt();

                if (sec>6){
                    throw new Exception();
                }
                bl = false;
            } catch (Exception e) {
                System.out.println("geçerli sayi giriniz");
                scan.nextLine();
            }
        }

        switch (sec) {
            case 1:
                urunListele();
                break;
            case 2:
                urunTanimlama();
                break;
            case 3:
                urunuRafaKoy();
                break;
            case 4:
                urunGirisi();
                break;
            case 5:
                urunCikisi();
                break;
            case 6:
                cikis();
                break;
        }


    }

    private void cikis() {
    }

    private void urunCikisi() {
        System.out.println("çıkartmak istediginiz urun sayisi: ");
        int miktar = scan.nextInt();
        int num = 0;
        for (Urunler each : urunlist) {
            if (each.getFocus() == 1) {
                num = each.getMiktar() - miktar;
                each.setMiktar(num);
            }
        }
    }

    private void urunuRafaKoy() {
        System.out.println("koymak istediğiniz raf (1-10): ");
        String raf = scan.nextLine();

        for (Urunler each : urunlist) {
            if (each.getFocus() == 1) {
                each.setRaf(raf);
            }
        }
    }

    private void urunGirisi() {
        System.out.println("girmek istediginiz urun sayisi: ");
        int miktar = scan.nextInt();
        int num = 0;
        for (Urunler each : urunlist) {
            if (each.getFocus() == 1) {
                num = each.getMiktar() + miktar;
                each.setMiktar(num);
                urunuRafaKoy();
            }
        }
    }

    private void urunListele() {
        System.out.println(urunlist);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        secim();
    }

    private void urunTanimlama() {
        System.out.println("kitabin adi: ");
        String name = scan.nextLine();
        System.out.println("üreticisinin adi: ");
        String publisher = scan.nextLine();
        System.out.println("birimi: ");
        String birim = scan.nextLine();
        Urunler urun = new Urunler(0, name, publisher, birim, null, 0);
        urunlist.add(urun);
        urun.setId(urunlist.size() + 1000);
        urun.setFocus(1);
        count++;
        if (count > 1) {
            urunlist.get(urunlist.size() - 2).setFocus(0);
        }
        secim();
    }

}
