package kendiCozumlerim.arac_kiralama;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Islemler implements aracYonetimi {

    static Scanner scanner = new Scanner(System.in);
    public static final String BLACK = "\u001B[30m";
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    int aracId; // Methodlar seçilen araca göre işlem yapıyor. id'yi seçtikten sonra class level'da tanımlarsak sorunsuz
                //    bir şekilde tekrar kullanabiliriz

    int count;  //sistem başlatılırken default araç listesini sisteme kaydetmemiz gerekiyor. sisteme ilk girişte sadece
                // 1 defa default araç listesi tanımlansın diye konulan flag

    int kiralamaCount;  // araç kiralama işlemleri yapılmadan müşteriye teslimi engellemek için oluşturuldu

    double toplamOdenecek;  // toplam fiyat hesaplandıktan sonra ödeme methodunda da kullanabilmek için oluşturuldu

    static int deger = 1000; // unique id'ler oluşturmak için oluşturuldu

    Map<Integer, AracOzellikleri> arac = new HashMap<>();
    Map<Integer, MusteriBilgileri> musteri = new HashMap<>();
    Map<Integer, KiralamaBilgileri> kiralama = new HashMap<>();

    public void secim() {

        System.out.println("========================== AUTOKING GALERI YONETICI PANELI =======================\r\n"

                + "   ____________________             ____________________    \n"
                + "   | 1-ARAC LISTELEME  |            | 2-ARAC KIRALAMA   |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   _____________________             ____________________    \n"
                + "   | 3-MUSTERIYE TESLIM |           | 4-ARAC CIKARMA    |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   _____________________            _____________________   \n"
                + "   | 5- ARAÇ EKLEME    |            | 6- CIKIS          |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  " + B);

        System.out.print("ISLEM SECİNİZ : ");

        /*
        seçim ekranından direkt 3'e basılırsa işlem yaptırılmayacak çünkü müşteri yok
        1- tüm araçlar listelenecek
        2- araç kiralamak için seçilen aracın id si istenece
           kiralama tarihleri istenecek
           fiyat çıkartılacak
           müşteri fiyatı kabul ederse müşterinin kaydı yapılacak
           ödeme alınacak
        3- (2. aşama 3'ün görevlerini yapıyor o yüzden fonksiyonsuz kaldı?)
        4- Araç listesinden araç çıkarılıyor
        5- yeni araç ekleniyor
        6- sistemden çıkış yapılıyor
         */

        //defaultAraclar methodunu sadece bir defa ilk girişte çalıştırmak için oluşturuldu.
        //Runner class'ında çağırlabilirdi bununla uğraşmamak için
        if (count == 0) {
            defaultAraclar();
            count++;
        }


        int sec = TryCatch.intGirisi();

        switch (sec) {
            case 1:
                aracListeleme();
                TryCatch.threadSleep(1000);
                secim();
                break;
            case 2:
                aracKirala();
                TryCatch.threadSleep(1000);

                kiralamaCount++;
                break;
            case 3:
                if (kiralamaCount == 0) {
                    System.out.println("Araç kiralama menüsü doldurulmadan müşteriye teslim menüsü kullanılamaz!\n" +
                            "Ana Menüye yönlendiriliyorsunuz");
                    TryCatch.threadSleep(1000);
                    secim();
                } else {
                    aracTalebi();
                }
                break;
            case 4:
                aracCikarma();
                break;
            case 5:
                aracEkleme();
                secim();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatali deger girdiniz");
                secim();

        }

    }

    @Override
    public void aracKirala() {

        System.out.println("Lütfen galeride müsait durumda olan araçlarımızdan seçmek istediğinin ID'sini giriniz: ");
        int id = TryCatch.intGirisi();
        aracId = id;

        if (arac.containsKey(id)) {
            if (arac.get(id).getMusaitlikDurumu().equalsIgnoreCase("musait")) {
                System.out.println("Seçmiş olduğunuz araç: " + arac.get(id));
                aracTalebi();
            } else {
                System.out.println("Seçmiş olduğunuz araç şuan başka bir müşterimize tahsis edilmiştir. Sizi araç talebi ekranına tekrar yönlendiriyorum...");
                TryCatch.threadSleep(1000);
                aracKirala();
            }

        } else {
            System.out.println("Girmiş olduğunuz ID'ye ait araç bulunamadı. Tekrar denemek için 1'i, Ana Menü'ye dönmek için 2'yi seçiniz");
            int secim = TryCatch.intGirisi();
            if (secim == 1) {
                aracKirala();
            } else {
                secim();
            }
        }

    }

    @Override
    public void aracTalebi() { //tarihler set methodunun içerisinde alınmamalı !!!

        KiralamaBilgileri aracBilgisi = new KiralamaBilgileri();
        aracBilgisi.setId(String.valueOf(aracId));
        System.out.println("Aracı kiralamak istediğiniz Tarih:");
        aracBilgisi.setKiralamaTarih(LocalDate.parse(scanner.nextLine()));
        System.out.println("Aracı teslim edeceğiniz tarih:");
        aracBilgisi.setTeslimTarihi(LocalDate.parse(scanner.nextLine()));
        System.out.println("Aracı teslim alacağınız Şehir:");
        aracBilgisi.setAlinacagisehir(scanner.nextLine());

        kiralama.put(aracId, aracBilgisi);
        kiralananAracBilgileri();
    }

    @Override
    public void kiralananAracBilgileri() {

        int gunSayisi = Period.between(kiralama.get(aracId).getKiralamaTarih(), kiralama.get(aracId).getTeslimTarihi()).getDays();
        System.out.println(gunSayisi);
        double maliyet = arac.get(aracId).getUcret() * (gunSayisi);

        toplamOdenecek = maliyet + 3000;

        System.out.println("Kiralamak istediğiniz araç : ");
        System.out.println(arac.get(aracId));
        System.out.println("Kiralama Bedeli : " + maliyet + " TL");

        System.out.println("Araç kiralamalarında 3000 TL Depozito Alınmaktadır. Araç teslim ederken yapılan kontrol sonrası depozito iade edilecektir");
        System.out.println("Toplam Ödenecek Tutar : " + toplamOdenecek + " TL");
        System.out.println("Kabul ediyorsanız Müşteri Kaydı sayfasına yonlendirileceksiniz E/H");
        String tercih = scanner.next();
        scanner.nextLine();

        if (tercih.equalsIgnoreCase("e")) {
            TryCatch.threadSleep(1000);
            musteriKaydi();
        } else {
            System.out.println("Ana Menüye yönlendiriyorsunuz");
            TryCatch.threadSleep(1000);
            secim();
        }
    }

    @Override
    public void musteriKaydi() {
        MusteriBilgileri mstr1 = new MusteriBilgileri();
        System.out.println("Müşteri Isim: ");
        mstr1.setAd(scanner.nextLine());
        System.out.println("Müşteri Soyad: ");
        mstr1.setSoyad(scanner.nextLine());
        System.out.println("Müşteri Telefon: ");
        mstr1.setTel(TryCatch.intGirisi());
        System.out.println("Müşteri Yaş: ");
        mstr1.setYas(TryCatch.intGirisi());
        System.out.println("Müşteri TC: ");
        mstr1.setTc(scanner.nextLine());
        musteri.put(mstr1.getId(), mstr1);
        System.out.println("Müşteri kaydınız oluşturulmuştur. ");

        odeme(mstr1.getId());
    }


    @Override
    public void odeme(int id) {
        System.out.println("Ödenmesi gereken Tutar : " + toplamOdenecek + " TL");
        musteri.get(id).setBalance(3000);
        System.out.println("Odeme Tamamlandi");
        System.out.println("sozlesme mail yoluyla gonderilecektir.");
        arac.get(aracId).setMusaitlikDurumu("mesgul");
        secim();

    }

    @Override
    public void aracTeslim() {

    }


    @Override
    public void aracEkleme() {
        AracOzellikleri arc1 = new AracOzellikleri();

        System.out.println("Araç Marka: ");
        arc1.setMarka(scanner.nextLine());
        System.out.println("Araç Model: ");
        arc1.setModel(scanner.nextLine());
        System.out.println("Araç Yakıt: ");
        arc1.setYakit(scanner.nextLine());
        System.out.println("Araç Vites: ");
        arc1.setVites(scanner.nextLine());
        System.out.println("Araç Koltuk No: ");
        arc1.setKoltukSayisi(TryCatch.intGirisi());
        System.out.println("Araç Günlük Ücret: ");
        arc1.setUcret(TryCatch.intGirisi());
        System.out.println("Araç Müsaitlik (sadece musait veya mesgul girilebilir): ");
        arc1.setMusaitlikDurumu(scanner.nextLine());
        arc1.setId(deger++);

        arac.put(arc1.getId(), arc1);
        System.out.println("Araç kaydı galeriye eklenmiştir. Araç teslim ekranına yönlendiriyorum... ");
        aracTeslim();
    }


    @Override
    public void aracListeleme() {
        banner();
        aracYazdirma(arac);

    }


    @Override
    public void cikis() {
        System.out.println("Sistem Sonlandiriliyor");
        System.out.println(".");
        TryCatch.threadSleep(1000);
        System.out.println(".");
        TryCatch.threadSleep(1000);
        System.out.println(".");
        TryCatch.threadSleep(1000);
        System.out.println(".");

    }

    @Override
    public void aracCikarma() {
        System.out.println("Cikarmak istediginiz Aracin id'sini giriniz: ");
        int cikartilanAracId = scanner.nextInt();

        if (arac.containsKey(cikartilanAracId)) {

            System.out.println("Sistemden Çıkarmak istediginiz olduğunuz araç: " + arac.get(cikartilanAracId));
            arac.remove(cikartilanAracId);
            System.out.println("Isleminiz basariyla tamamlanmistir. Ana Menüye Yonlendiriliyorsunuz");
            TryCatch.threadSleep(1000);
            secim();
        } else {
            System.out.println("Girmiş olduğunuz ID'ye ait araç bulunamadı. Tekrar denemek için 1'i, Ana Menü'ye dönmek için 2'yi seçiniz");
            int secim = TryCatch.intGirisi();
            if (secim == 1) {
                aracKirala();
            } else {
                secim();
            }
        }


    }

    public void aracYazdirma(Map<Integer, AracOzellikleri> arac) {

        for (AracOzellikleri w : arac.values()) {

            if (w.getMusaitlikDurumu().equalsIgnoreCase("musait")) {
                System.out.printf(G + "%-8d%-15S%-15S%-15S%-15S%8S%14.2f     %10S \n",
                        w.getId(),
                        w.getModel(),
                        w.getMarka(),
                        w.getYakit(),
                        w.getVites(),
                        w.getKoltukSayisi(),
                        w.getUcret(),
                        w.getMusaitlikDurumu());
            } else if (w.getMusaitlikDurumu().equalsIgnoreCase("mesgul")) {
                System.out.printf(R + "%-8d%-15S%-15S%-15S%-15S%8S%14.2f     %10S \n",
                        w.getId(),
                        w.getModel(),
                        w.getMarka(),
                        w.getYakit(),
                        w.getVites(),
                        w.getKoltukSayisi(),
                        w.getUcret(),
                        w.getMusaitlikDurumu());
            } else {
                System.out.printf(BLACK + " %-8d%-15S  %-15S  %-15S  %-15S %8S %14.2f  %10S \n",
                        w.getId(),
                        w.getModel(),
                        w.getMarka(),
                        w.getYakit(),
                        w.getVites(),
                        w.getKoltukSayisi(),
                        w.getUcret(),
                        w.getMusaitlikDurumu());
            }

        }
        System.out.println(B + "============================================================================================================");
        System.out.println(" ");
    }

    public static void banner() {
        System.out.println(B + "ID\t\tMODEL\t\t\tMARKA\t\tYAKIT\t\t\tVITES\t\t\tKOLTUKSAYISI\tUCRET\tMUSAITLIKDURUMU" +
                "\n============================================================================================================");

    }

    @Override
    public void defaultAraclar() {

        AracOzellikleri arac1 = new AracOzellikleri(deger++, "tt", "audi", "dizel", "otomatik", 5, 250, "Musait");
        AracOzellikleri arac2 = new AracOzellikleri(deger++, "city", "cooper", "dizel", "manuel", 5, 350, "Musait");
        AracOzellikleri arac3 = new AracOzellikleri(deger++, "accord", "honda", "dizel", "otomatik", 5, 150, "Musait");
        AracOzellikleri arac4 = new AracOzellikleri(deger++, "cls", "mercedes", "benzin", "otomatik", 5, 350, "Musait");
        AracOzellikleri arac5 = new AracOzellikleri(deger++, "corolla", "toyota", "benzin", "manuel", 5, 200, "Musait");
        AracOzellikleri arac6 = new AracOzellikleri(deger++, "passat", "ww", "benzin", "manuel", 5, 175, "Mesgul");

        arac.put(arac1.getId(), arac1);
        arac.put(arac2.getId(), arac2);
        arac.put(arac3.getId(), arac3);
        arac.put(arac4.getId(), arac4);
        arac.put(arac5.getId(), arac5);
        arac.put(arac6.getId(), arac6);

    }

}
