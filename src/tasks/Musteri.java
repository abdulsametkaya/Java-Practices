package tasks;

public class Musteri {


    private String name;
    private String surname;
    private String cardNumber;
    private String password;

    public Musteri(String name, String surname, String cardNumber, String password) {
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.password = password;
    }

    public Musteri() {
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

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Musteri : " +
                "Name= " + name +
                ", Surname= " + surname +
                ", CardNumber= " + cardNumber +
                ", Password= " + password;
    }
}
