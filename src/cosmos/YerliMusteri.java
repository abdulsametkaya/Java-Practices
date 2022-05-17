package cosmos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YerliMusteri extends Yolcu{

    Scanner scan = new Scanner(System.in);
    private String tcNo;
    List<YerliMusteri> yerliList = new ArrayList<>();
    double fiyat;

    public YerliMusteri() {
    }

    public YerliMusteri(String name, String surname, String cinsiyet, String telefonNo, String tcNo) {
        super(name, surname, cinsiyet, telefonNo);
        this.tcNo = tcNo;
    }

    public void girisEkrani(){

        System.out.println("HOSGELDINIZ");

        System.out.println("Turk vatandasiysaniz 1'e yabanciysaniz 2'ye basiniz");
        int vatandaslik = scan.nextInt();
        scan.nextLine();
        if (vatandaslik ==1){
            yolcuBilgileri();
        }else if (vatandaslik == 2){
            Turist obj = new Turist();
            obj.yolcuBilgileri();
        }else System.out.println("Hatali secim");

    }

    public void yolcuBilgileri(){
        System.out.println("Adinizi giriniz");
        String name = scan.nextLine();
        System.out.println("Soyadinizi giriniz");
        String surname = scan.nextLine();
        System.out.println("cinsiyetinizi giriniz");
        String cinsiyet = scan.nextLine();
        System.out.println("telefon no giriniz");
        String telefonNo = scan.nextLine();
        System.out.println("Tc kimlik no giriniz");
        String TcNo = scan.nextLine();

        YerliMusteri musteri1 = new YerliMusteri(name,surname,cinsiyet,telefonNo,tcNo);
        yerliList.add(musteri1);

        biletFiyati();

    }

    @Override
    public void biletFiyati() {
        int yol = 100;
        double kmYol = 1.2;

        fiyat = yol * kmYol;

        biletYazdir();
    }

   public void biletYazdir(){
       LocalTime tarih = LocalTime.now();
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");

       System.out.println(dtf.format(tarih));

       System.out.println(fiyat);

    }

}
