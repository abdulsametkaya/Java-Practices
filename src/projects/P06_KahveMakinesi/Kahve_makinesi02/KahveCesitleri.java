package projects.P06_KahveMakinesi.Kahve_makinesi02;

public class KahveCesitleri {

    private String kahveName;
    private String kahveNumber;

    public KahveCesitleri(String kahveName, String kahveNumber) {
        this.kahveName = kahveName;
        this.kahveNumber = kahveNumber;
    }

    public KahveCesitleri() {
    }

    public String getKahveName() {
        return kahveName;
    }

    public void setKahveName(String kahveName) {
        this.kahveName = kahveName;
    }

    public String getKahveNumber() {
        return kahveNumber;
    }

    public void setKahveNumber(String kahveNumber) {
        this.kahveNumber = kahveNumber;
    }

    @Override
    public String toString() {
        return
                "kahve Adi = " + kahveName  +
                ", kahve Numarasi = " + kahveNumber + "\n";
    }
}
