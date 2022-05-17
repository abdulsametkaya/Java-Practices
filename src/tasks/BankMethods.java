package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMethods {

    static int bakiye;
    static List<Musteri> customers = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);


    public void giris() {
        Musteri musteri1 = new Musteri("samet", "kaya", "1234", "1234");
        Musteri musteri2 = new Musteri("hakan", "tokat", "1235", "asdf");
        customers.add(musteri1);
        customers.add(musteri2);
        System.out.println("--------------BANKAMIZA HOSGELDINIZ--------------");
        System.out.println("LUTFEN MUSTERI BILGILERINIZI GIRINIZ");
        System.out.print("NAME = ");
        String name = scan.nextLine();
        System.out.println();
        System.out.print("SURNAME = ");
        String surName = scan.nextLine();
        System.out.println();
        System.out.print("CARD NUMBER = ");
        String cardNumber = scan.nextLine();
        System.out.println();
        System.out.print("PASSWORD = ");
        String password = scan.nextLine();
        System.out.println();
        boolean bl = false;
        for (Musteri customer : customers) {
            if (name.equals(customer.getName()) && surName.equals(customer.getSurname()) &&
                    cardNumber.equals(customer.getCardNumber()) && password.equals(customer.getPassword())) {
                bl = true;
                break;
            }
        }
        if (bl){
            menu();
        }else {
            System.out.println("BANKA SISTEMIMIZE KAYIT OLMAK ISTER MISINIZ? E/H?");
            String kayit = scan.nextLine();
            if (kayit.equalsIgnoreCase("E")) {
                customers.add(addCustomer());
                menu();
            } else exit();
        }



    }

    public void menu() {

        System.out.println("""
                LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ
                BAKIYE SORGULAMAK ICIN 1\s
                PARA CEKMEK ICIN 2
                PARA YATIRMAK ICIN 3
                PARA GONDERMEK ICIN 4
                SIFRE DEGISMEK ICIN 5
                CIKIS ICIN 6 'YI TUSLAYINIZ""");
        int secim = scan.nextInt();
        scan.nextLine();
        switch (secim) {
            case 1 -> bakiyeSorgulama();
            case 2 -> paraCek();
            case 3 -> paraYatir();
            case 4 -> paraGonder();
            case 5 -> changePassword();
            case 6 -> exit();
            default -> {
                System.out.println("HATALI TUSLAMA YAPTINIZ LUTFEN TEKRAR DENEYINIZ");
                menu();
            }
        }
    }

    public void bakiyeSorgulama() {
        if (bakiye <= 0) {
            System.out.println("MEVCUT BAKIYENIZ = " + bakiye + " TL" + " ISLEM YAPABILMEK ICIN LUTFEN PARA YATIRINIZ");
        } else System.out.println("MEVCUT BAKIYENIZ = " + bakiye + " TL" + "ISLEM MENUSUNE YONLENDIRILIYORSUNUZ");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        menu();
    }

    public void paraCek() {
        System.out.println("CEKMEK ISTEDIGINIZ MIKTARI GIRINIZ");
        int cekilenPara = scan.nextInt();
        if (bakiye - cekilenPara >= 0) {
            bakiye -=cekilenPara;
            System.out.println("ISLEMINIZ GERCEKLESTIRILDI YENI BAKIYENIZ = " + bakiye);
        } else {
            System.out.println("BELIRTILEN MIKTARDA PARA CEKMEK ICIN YETERLI PARANIZ BULUNMAMAKTADIR \nLUTFEN BAKIYENIZDEN" +
                    " DUSUK MIKTARDA PARA CEKINIZ");
            paraCek();
        }
        System.out.println("ISLEM MENUSUNE YONLENDIRILIYORSUNUZ");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        menu();
    }

    public void paraYatir() {
        System.out.println("YATIRMAK ISTEDIGINIZ MIKTARI GIRINIZ");
        int yatirilanPara = scan.nextInt();
        if (yatirilanPara <= 0) {
            System.out.println("GECERLI BIR MIKTAR GIRINIZ");
            paraYatir();
        } else {
            bakiye += yatirilanPara;
            System.out.println("ISLEMINIZ GERCEKLESTIRILDI YENI BAKIYENIZ = " + bakiye);
        }
        System.out.println("ISLEM MENUSUNE YONLENDIRILIYORSUNUZ");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        menu();
    }

    public void paraGonder() {
        System.out.println("PARA GONDERMEK ISTEDIGINIZ HESAP BILGILERINI GIRINIZ");
        System.out.print("NAME = ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println();
        System.out.print("SURNAME = ");
        String surName = scan.nextLine();
        System.out.println();
        System.out.print("CARD NUMBER = ");
        String cardNumber = scan.nextLine();
        System.out.println();

        int gonderilenPara;
        int secim;
        for (Musteri customer : customers) {
            if (name.equals(customer.getName()) && surName.equals(customer.getSurname()) &&
                    cardNumber.equals(customer.getCardNumber())) {
                System.out.println("GONDERMEK ISTEDIGINIZ MIKTARI GIRINIZ");
                gonderilenPara = scan.nextInt();
                if (gonderilenPara > bakiye) {
                    System.out.println("""
                            BELIRTILEN MIKTARDA PARA GONDERMEK ICIN YETERLI PARANIZ BULUNMAMAKTADIR\s
                            LUTFEN BAKIYENIZDEN DUSUK MIKTARDA PARA GONDERINIZ
                            MENUYE DONMEK ICIN 0'I MIKTAR DEGISIKLIGI ICIN 1'I TUSLAYINIZ""");
                    secim = scan.nextInt();
                    if (secim == 0) {
                        menu();
                    } else paraGonder();
                } else {
                    System.out.println("ISLEMINIZ GERCEKLESTIRILDI YENI BAKIYENIZ = " + (bakiye - gonderilenPara));
                    System.out.println("ISLEM MENUSUNE YONLENDIRILIYORSUNUZ");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    menu();
                }

            }
        }
        System.out.println("GIRDIGINIZ BILGILERE SAHIP MUSTERI BULUNAMADI");
        System.out.println("ISLEM MENUSUNE YONLENDIRILIYORSUNUZ");
        menu();
    }

    public void changePassword() {
        System.out.println("YENI SIFRENIZI GIRINIZ");
        scan.nextLine();
        String password = scan.nextLine();
        System.out.println("SIFRENIZ DEGISTIRILDI");
        System.out.println("ISLEM MENUSUNE YONLENDIRILIYORSUNUZ");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        menu();
    }

    public void exit() {
        System.out.println("BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ...");

    }

    public Musteri addCustomer() {

        System.out.println("LUTFEN MUSTERI BILGILERINIZI GIRINIZ");
        System.out.print("NAME = ");
        String name = scan.nextLine();
        System.out.println();
        System.out.print("SURNAME = ");
        String surName = scan.nextLine();
        System.out.println();
        System.out.print("CARD NUMBER = ");
        String cardNumber = scan.nextLine();
        System.out.println();
        System.out.print("PASSWORD = ");
        String password = scan.nextLine();
        System.out.println();


        System.out.println("KAYIT TAMAMLANDI. SIMDI TEKRAR GIRIS'E YONLENDIRILECEKSINIZ");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");

        return new Musteri(name, surName, cardNumber, password);
    }

}