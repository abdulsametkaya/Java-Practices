package cosmos;
/*
    otobüs bileti alma programı
    turistler için bir class
    yerliler için bir class
    ad soyad cinsiyet telefon no ortak
    id num ve pasaport numarası farklı variable'lar

    giriş ekranı
    yolcu bilgisi
    biletFiyati
    bilet yazdir

    çok basit bir şekilde giriş ekranında turistse turiste göre kayıt değilse yerliye göre kayıt
    bilet fiyatı km başına turist için 1.4TL yerliye 1.2TL

     */
public class Yolcu {

    private String name;
    private String surname;
    private String cinsiyet;
    private String telefonNo;

    public Yolcu() {
    }

    public Yolcu(String name, String surname, String cinsiyet, String telefonNo) {
        this.name = name;
        this.surname = surname;
        this.cinsiyet = cinsiyet;
        this.telefonNo = telefonNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }



    //override ettiğimiz methodlar
    public void yolcuBilgileri(){
    }

    public void biletFiyati(){
    }




    @Override
    public String toString() {
        return "Yolcu{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", telefonNo='" + telefonNo + '\'' +
                '}';
    }
}
