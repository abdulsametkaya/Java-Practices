package cosmos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turist extends Yolcu {

    private String passportNumber;
    Scanner scan = new Scanner(System.in);
    List<Turist> turistList = new ArrayList<>();
    double fiyat;


    public Turist() {
    }

    public Turist(String name, String surname, String cinsiyet, String telefonNo, String passportNumber) {
        super(name, surname, cinsiyet, telefonNo);
        this.passportNumber = passportNumber;
    }

    public void yolcuBilgileri() {
        System.out.println("Adinizi giriniz");
        String name = scan.nextLine();
        System.out.println("Soyadinizi giriniz");
        String surname = scan.nextLine();
        System.out.println("cinsiyetinizi giriniz");
        String cinsiyet = scan.nextLine();
        System.out.println("telefon no giriniz");
        String telefonNo = scan.nextLine();
        System.out.println("passport numarası no giriniz");
        String passportNumber = scan.nextLine();

        Turist turist1 = new Turist(name, surname, cinsiyet, telefonNo, passportNumber);
        turistList.add(turist1);
        biletFiyati();
    }

    @Override
    public void biletFiyati() {
        int yol = 100;
        double kmYol = 1.4;

        fiyat = yol * kmYol;

        biletYazdir();
    }

    public void biletYazdir() {
        LocalTime tarih = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println(dtf.format(tarih));

        System.out.println(fiyat);

    }
}
