package kendiCozumlerim.arac_kiralama;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class KiralamaBilgileri {

    Scanner scan = new Scanner(System.in);
    private String id;
    private LocalDate kiralamaTarih;
    private final LocalTime kiralamaSaati = LocalTime.of(12, 0);
    private String alinacagisehir;
    private LocalDate teslimTarihi;
    private final LocalTime teslimSaati = LocalTime.of(12, 0);

    public KiralamaBilgileri() {
    }

    public KiralamaBilgileri(String id, LocalDate kiralamaTarih, String alinacagisehir, LocalDate teslimTarihi) {
        this.id = id;
        this.kiralamaTarih = kiralamaTarih;
        //this.kiralamaSaati = kiralamaSaati;
        this.alinacagisehir = alinacagisehir;
        this.teslimTarihi = teslimTarihi;
        //this.teslimSaati = teslimSaati;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getKiralamaTarih() {
        return kiralamaTarih;
    }

    public void setKiralamaTarih(LocalDate kiralamaTarih) {

        LocalDate tarih = LocalDate.now();
        if (tarih.isAfter(kiralamaTarih)) {
            System.out.println("Geçmiş tarih giremezsiniz!");
            String timeString = scan.next();
            LocalDate date = LocalDate.parse(timeString);
        }
        this.kiralamaTarih = kiralamaTarih;
    }

    public LocalTime getKiralamaSaati() {
        return kiralamaSaati;
    }

    public String getAlinacagisehir() {
        return alinacagisehir;
    }

    public void setAlinacagisehir(String alinacagisehir) {
        this.alinacagisehir = alinacagisehir;
    }

    public LocalDate getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(LocalDate teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }

    public LocalTime getTeslimSaati() {
        return teslimSaati;
    }

    @Override
    public String toString() {
        return "KiralamaBilgileri{" +
                "id='" + id + '\'' +
                ", kiralamaTarih=" + kiralamaTarih +
                ", kiralamaSaati=" + kiralamaSaati +
                ", alinacagisehir='" + alinacagisehir + '\'' +
                ", teslimTarihi=" + teslimTarihi +
                ", teslimSaati=" + teslimSaati +
                '}';
    }
}
