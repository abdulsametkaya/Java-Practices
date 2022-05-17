package projects.ucusProjesi;

public class CSehri extends Ucus{
    private static final int bUzaklik = 700;

    public CSehri(boolean gidisDonus, int yas) {
        super(gidisDonus, yas);
    }

    @Override
    public double toplamFiyat() {
        double result = 0;
        if (getYas() > 0 && getYas() < 12) {
            if (isGidisDonus()) {
                result += (kmFiyat * bUzaklik) / 2;
            } else {
                result += ((kmFiyat * bUzaklik) * 0.5 * 0.8) * 2;
            }
        } else if (getYas() > 12 && getYas() < 24) {
            if (isGidisDonus()) {
                result += (kmFiyat * bUzaklik) * 0.9;
            } else {
                result += ((kmFiyat * bUzaklik) * 0.9 * 0.8) * 2;
            }
        } else if (getYas() >= 65) {
            if (isGidisDonus()) {
                result += (kmFiyat * bUzaklik) * 0.7;
            } else {
                result += ((kmFiyat * bUzaklik) * 0.7 * 0.8) * 2;
            }
        } else {
            if (isGidisDonus()) {
                result += (kmFiyat * bUzaklik);
            } else {
                result += ((kmFiyat * bUzaklik) * 0.8) * 2;
            }
        }

        return result;
    }
}
