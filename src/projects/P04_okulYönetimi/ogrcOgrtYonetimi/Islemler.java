package projects.P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrncListesi = new ArrayList<>();
    static ArrayList<Kisi> ogrtmListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;

            case "Q":
                cikis();
                break;
            default:
                System.out.println("hatalı giriş yaptınız  :(");
                girisPaneli();//recursive method call
                break;


        }


    }

    private static void cikis() {
        System.out.println("agam eline sağlık yine bekleriz selametle   :)");
    }

    public static void islemMenusu() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();
        scan.nextLine();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("adam bir şey girrr :( ");
                islemMenusu();
                break;
        }

    }

    private static void arama() {
        boolean arama = false;
        if (kisiTuru.equals("OGRENCI")){
            System.out.println(" Lütfen aramak istediğiniz öğrencinin kimlik numarasını giriniz");
            String kimlikNo = scan.nextLine();
            for (Kisi kisi : ogrncListesi) {
                if (kisi.getKimlikNo().equals(kimlikNo)) {
                    System.out.println(kisi);
                    arama = true;
                }
            }
        }else {
            System.out.println(" Lütfen aramak istediğiniz öğretmenin kimlik numarasını giriniz");
            String kimlikNo = scan.nextLine();
            for (Kisi kisi : ogrtmListesi) {
                if (kisi.getKimlikNo().equals(kimlikNo)) {
                    System.out.println(kisi);
                    arama = true;
                }
            }
        }
        if (!arama){
            System.out.println("girdiğiniz kimlik numarasına sahip " + kisiTuru + " bulunmamaktadır");
        }
    }

    private static void silme() {

        boolean silme = false;
        if (kisiTuru.equals("OGRENCI")){
            System.out.println(" Lütfen silmek istediğiniz öğrencinin kimlik numarasını giriniz");
            String kimlikNo = scan.nextLine();
            for (int i = 0; i <ogrncListesi.size(); i++){
                if (ogrncListesi.get(i).getKimlikNo().equals(kimlikNo)){
                    ogrncListesi.remove(ogrncListesi.get(i));
                    silme = true;
                }
            }
        }else {
            System.out.println(" Lütfen silmek istediğiniz öğretmenin kimlik numarasını giriniz");
            String kimlikNo = scan.nextLine();
            for (int i = 0; i <ogrtmListesi.size(); i++){
                if (ogrtmListesi.get(i).getKimlikNo().equals(kimlikNo)){
                    ogrtmListesi.remove(ogrtmListesi.get(i));
                    silme = true;
                }
            }

        }
        if (silme){
            System.out.println("silme işlemi başarıyla gerçekleşmiştir");
        }else{
            System.out.println("girdiğiniz kimlik numarasına sahip " + kisiTuru + " bulunmamaktadır");
        }
    }

    private static void listele() {
        if (kisiTuru.equals("OGRENCI")){
            System.out.println("   ***   " + kisiTuru + " Listesi   ***");
            for(Kisi ogrenci : ogrncListesi){
                System.out.println(ogrenci);
            }
        }else {
            System.out.println("   ***   " + kisiTuru + " Listesi   ***");
            for(Kisi ogretmen : ogrncListesi){
                System.out.println(ogretmen);
            }
        }

    }

    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " ekleme sayfası   ***");
        System.out.print("ad soyad giriniz : ");
        String adSoyad = scan.nextLine();
        String kimlikNo = null;
        boolean flag = true;
        while (flag) {
            System.out.print("kimlik No giriniz : ");
            kimlikNo = null;
            try {
                kimlikNo = scan.next();
                if (kimlikNo.length()!=11){
                    throw new Exception();
                }else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Kimlik no 11 haneli olmak zorunda");
            }
        }
        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();
        scan.nextLine();//dummy hayalet komut
        if (kisiTuru.equals("OGRENCI")) {

            System.out.print("ogrenci No giriniz : ");
            String ogrcNo = scan.next();
            System.out.print("sinif giriniz : ");
            String sinif = scan.next();
            Ogrenci sefilOgrenci = new Ogrenci(adSoyad, null, yas, ogrcNo, sinif);//p'li cons ogrc obj create edildi
            sefilOgrenci.setKimlikNo(kimlikNo);
            ogrncListesi.add(sefilOgrenci);
        } else {
            System.out.print("sicil No giriniz : ");
            String sicilNo = scan.nextLine();
            System.out.print("bolum giriniz : ");
            String bolum = scan.nextLine();
            Ogretmen muhtesemOgretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);//p'li cons ogrtm obj create edildi
            ogrtmListesi.add(muhtesemOgretmen);
        }
    }
}
