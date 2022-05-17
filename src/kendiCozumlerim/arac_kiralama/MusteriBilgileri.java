package kendiCozumlerim.arac_kiralama;

public class MusteriBilgileri {

    private int id;
    private String ad;
    private String soyad;
    private int tel;
    private int yas;
    private String tc;
    private int balance;

    public MusteriBilgileri(){
    }

    public MusteriBilgileri(int id, String ad, String soyad, int tel, int yas, String tc, int balance) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.yas = yas;
        this.tc = tc;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    @Override
    public String toString() {
        return "MusteriBilgileri{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tel='" + tel + '\'' +
                ", yas=" + yas +
                ", tc='" + tc + '\'' +
                '}';
    }
}
