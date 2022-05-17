package projects.ucusProjesi;

public abstract class Ucus {

    public static final double kmFiyat = 0.10;
    private boolean gidisDonus;
    private int yas;

    public Ucus(boolean gidisDonus, int yas) {
        this.gidisDonus = gidisDonus;
        this.yas = yas;
    }

    public boolean isGidisDonus() {
        return gidisDonus;
    }

    public int getYas() {
        return yas;
    }

    public abstract double toplamFiyat();
}
