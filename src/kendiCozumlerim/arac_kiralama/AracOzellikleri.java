package kendiCozumlerim.arac_kiralama;

import static kendiCozumlerim.arac_kiralama.Islemler.*;

public class AracOzellikleri {

    private int id ;
    private String model="Model Girilmedi";
    private String marka="Marka Girilmedi";
    private String yakit="Yakıt Girilmedi";
    private String vites="Vites Girilmedi";
    private int koltukSayisi;
    private double ucret;
    private String musaitlikDurumu ="Bilgi Girilmedi";

    public AracOzellikleri(int id, String model, String marka, String yakit, String vites, int koltukSayisi, double ucret, String musaitlikDurumu) {
        this.id=id;
        this.model = model;
        this.marka = marka;
        this.yakit = yakit;
        this.vites = vites;
        this.koltukSayisi = koltukSayisi;
        this.ucret = ucret;
        setMusaitlikDurumu(musaitlikDurumu);

    }

    public AracOzellikleri(){
    }

    public String getMusaitlikDurumu() {
        return musaitlikDurumu;
    }

    public void setMusaitlikDurumu(String musaitlik) {

        if(musaitlik.equalsIgnoreCase("musait") || musaitlik.equalsIgnoreCase("mesgul") ){
            this.musaitlikDurumu = musaitlik;
        } else {
            System.out.println(R+"Hata! Arac musaitlik durumu sadece 'Musait' yada 'Mesgul' girişi yapılabilir.Lutfen tekrar arac musaitlik durumu giriniz: "+BLACK);
            setMusaitlikDurumu(scanner.nextLine());
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getModel() {
        return model;
    } // model list oluşturulup, sadece bu listten seçtirilebilir. (fikir)

    public void setModel(String model) {

        this.model = model;
    }

    public String getMarka() {
        return marka;
    }// marka list oluşturulup, sadece bu listten seçtirilebilir. (fikir)

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        if(yakit.equalsIgnoreCase("dizel") || yakit.equalsIgnoreCase("benzin") || yakit.equalsIgnoreCase("hybrid") ){
            this.yakit = yakit;
        } else {
            System.out.println(R+"Hata:Arac yakiti sadece 'Dizel', 'Benzin' ya da 'Hybrid' girişi yapılabilir.Lütfen tekrar yakit bilgisi giriniz: "+BLACK);
            setYakit(scanner.nextLine());
        }
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        if(vites.equalsIgnoreCase("otomatik") || vites.equalsIgnoreCase("manuel") ){
            this.vites = vites;
        } else {
            System.out.println(R+"Hata: Araç vitesi sadece 'Otomatik' yada 'Manuel' girişi yapılabilir. Tekrar vites girisi yapiniz:  "+BLACK);
            setVites(scanner.nextLine());
        }
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        if(koltukSayisi<=0){
            System.out.println(R+"Hata!: Koltuk sayisi 0'dan buyuk olmalidir. Tekrar koltuk sayisi giriniz: "+BLACK);
            setKoltukSayisi(TryCatch.intGirisi());
        } else if(koltukSayisi>10){
            System.out.println(R+"Hata!: Galeriye sadece binek araçların kaydı alındığı için koltuk sayisi 10'dan fazla olamaz.Tekrar koltuk sayısı giriniz"+BLACK);
            setKoltukSayisi(TryCatch.intGirisi());
        } else this.koltukSayisi = koltukSayisi;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        if(ucret<=0 ){
            System.out.println(R+"Hata! : Ucret sifirdan buyuk olmalidir. Tekrar ucret girisi yapiniz: "+BLACK);
            setUcret(scanner.nextDouble());
        } else  this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "Arac Ozellikleri: " +
                " ID= " + id +
                ", MODEL= " + model.toUpperCase()  +
                ", MARKA= " + marka.toUpperCase() +
                ", YAKIT= " + yakit.toUpperCase() +
                ", VITES= " + vites.toUpperCase() +
                ", KOLTUK NO= " + koltukSayisi +
                ", FIYAT= " + ucret ;
    }
}
