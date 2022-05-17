package projects.P04_okulYönetimi.ogrcOgrtYonetimi;

public class Kisi {

    private String adSoyad;
    private String kimlikNo;
    private int yas;

    public Kisi() {

    }

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        setAdSoyad(adSoyad);
        this.kimlikNo = kimlikNo;
        setYas(yas);
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad.toUpperCase();
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        try {
            if (kimlikNo.length() != 11) {
                throw new Exception();
            } else {
                this.kimlikNo = kimlikNo;
            }
        } catch (Exception e) {
            System.out.println("Kimlik no 11 haneli olmak zorunda");
        }
    }

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            this.yas = -yas;
        } else
            this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "adSoyad='" + adSoyad +
                        ", kimlikNo='" + kimlikNo +
                        ", yas=" + yas;
    }
}





