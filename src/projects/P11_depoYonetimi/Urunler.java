package projects.P11_depoYonetimi;

import java.util.List;

public class Urunler {

    private String urunIsmi, uretici, birim, raf;
    private int miktar, id, focus;

    public Urunler(int id, String urunIsmi, String uretici, String birim, String raf, int miktar) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.raf = raf;
        this.miktar = miktar;
    }
    public Urunler() {
    }

    public int getFocus() {return focus;}

    public void setFocus(int focus) {this.focus = focus;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                "urunIsmi=" + urunIsmi +
                ", uretici=" + uretici +
                ", miktar=" + miktar +
                ", birim=" + birim +
                ", raf=" + raf +
                "focus" + focus +
                '}';
    }
}
