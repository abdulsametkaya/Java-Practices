package kendiCozumlerim.bank_Project;

public class Customers {

    private String name;
    private String surname;
    private int idNumber = OperationsTRY.mapKeyGenerator();
    private String password;
    private double balaceTRY = 100;
    private double balanceUSD;
    private boolean debit;
    private String telefon;
    private int monthlyInCome;
    private String cardNumber = OperationsTRY.cardNumberGenerator();


    public Customers() {
    }

    public Customers(String name, String surname, String password, String telefon, int monthlyInCome) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.telefon = telefon;
        this.monthlyInCome = monthlyInCome;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalaceTRY() {
        return balaceTRY;
    }

    public void setBalaceTRY(double balaceTRY) {
        this.balaceTRY = balaceTRY;
    }

    public double getBalanceUSD() {
        return balanceUSD;
    }

    public void setBalanceUSD(double balanceUSD) {
        this.balanceUSD = balanceUSD;
    }

    public boolean isDebit() {
        return debit;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getMonthlyInCome() {
        return monthlyInCome;
    }

    public void setMonthlyInCome(int monthlyInCome) {
        this.monthlyInCome = monthlyInCome;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", password='" + password + '\'' +
                ", telefon='" + telefon + '\'' +
                ", monthlyInCome=" + monthlyInCome +
                ", cardNumber='" + cardNumber + '\'' +
                '}' + "\n";
    }


}
