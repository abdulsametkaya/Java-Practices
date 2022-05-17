package kendiCozumlerim.bank_Project;

import kendiCozumlerim.arac_kiralama.TryCatch;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OperationsTRY implements Operations {

    static int cardNumber = 2744;
    static int customerKey = 1;
    Map<Integer, Customers> customerMap = new TreeMap<>();
    static Customers currentCustomer;
    Scanner scan = new Scanner(System.in);

    public static void payments() {
    }

    public static void creditsTransection() {
    }

    @Override
    public void checkBalance() {
    }

    @Override
    public void balanceInquiry() { // Kullanıcının bakiyesini öğrenebilmesi için oluşturulmuştur. Current Customer örnek
        //olarak oluşturulmuştur. Giriş sayfası ile bağlanınca Current Customer giriş sayfasından
        //alınacaktır.

        currentCustomer = customerMap.get(1);

        String customerCardNumber = currentCustomer.getCardNumber();

        String secretCardNumber = customerCardNumber.substring(0, customerCardNumber.length() - 4).replaceAll("\\d", "*");

        System.out.println("There is a balance of " + currentCustomer.getBalaceTRY() + " TL" + " in your TL account number "
                + secretCardNumber + customerCardNumber.
                substring(customerCardNumber.length() - 4) + "");

        System.out.println(" ");
        TryCatch.threadSleep(2000);

        // reDirectMainMenu();
    }

    @Override
    public void withdrawal() {

        System.out.println("Please enter the amount you want to withdraw");
        int amountOfWithdraw = TryCatch.intGirisi();
        int selection = 0;
        if (currentCustomer.getBalaceTRY() < amountOfWithdraw || amountOfWithdraw <= 0) {
            System.out.println("""
                    your balance is not enough or invalid choice
                    press 1 to re-enter\s
                    press 2 to return to the main menu""");
            selection = TryCatch.intGirisi();
            if (selection == 1) {
                withdrawal();
            } else if (selection == 2) {
                Menus.mainMenu();
            } else {
                System.out.println("invalid choice");
                reDirectMainMenu();
            }
        } else {
            currentCustomer.setBalaceTRY(currentCustomer.getBalaceTRY() - amountOfWithdraw);
            System.out.println("transaction completed successfully");
            System.out.println("your new balance : " + currentCustomer.getBalaceTRY());
            reDirectMainMenu();
        }

    }

    @Override
    public void deposit() {

        System.out.println("Please enter the amount you want to deposit");
        int amountOfDeposit = TryCatch.intGirisi();
        int selection = 0;
        if (amountOfDeposit <= 0) {
            System.out.println("""
                    Invalid choice
                    press 1 to re-enter
                    press 2 to return to the main menu""");
            selection = TryCatch.intGirisi();
            if (selection == 1) {
                deposit();
            } else if (selection == 2) {
                Menus.mainMenu();
            } else {
                System.out.println("invalid choice");
                reDirectMainMenu();
            }
        } else {
            currentCustomer.setBalaceTRY(currentCustomer.getBalaceTRY() + amountOfDeposit);
            System.out.println("transaction completed successfully");
            System.out.println("your new balance : " + currentCustomer.getBalaceTRY());
            reDirectMainMenu();
        }
    }

    @Override
    public void moneyTransfer() {

        String accountSelection = null;
        Customers transferCustomer = null;
        boolean account = false;
        int sendAmount = 0;
        int customerSelection = 0;

        System.out.println("""
                If the person you want to send money to is a Cosmos Bank customer, click 1 to send money quickly,\s
                or click 2 if another bank customer.\s
                or click 3 to back to main menu""");
        customerSelection = TryCatch.intGirisi();

        if (customerSelection == 1) {
            System.out.println("Please enter the account number you want to send:");
            accountSelection = scan.nextLine();

            for (int i = 1; i <= customerMap.size(); i++) {
                System.out.println(customerMap.get(i));
                if (accountSelection.equalsIgnoreCase(customerMap.get(i).getCardNumber())) {
                    transferCustomer = customerMap.get(i);
                    account = true;
                    break;
                }
            }
            if (account) {
                System.out.println("Enter the amount you want to send");
                sendAmount = TryCatch.intGirisi();

                if (sendAmount >= 0 || currentCustomer.getBalaceTRY() >= sendAmount) {
                    currentCustomer.setBalaceTRY(currentCustomer.getBalaceTRY() - sendAmount - 1);
                    transferCustomer.setBalaceTRY(transferCustomer.getBalaceTRY() + sendAmount);
                    System.out.println("transaction completed successfully");
                    System.out.println("your new balance : " + currentCustomer.getBalaceTRY());
                    reDirectMainMenu();
                } else {
                    System.out.println("Invalid amount. Redirecting Money Transfer main menu");
                    moneyTransfer();
                }
            } else {
                System.out.println("Invalid Account Number. Redirecting Money Transfer main menu");
                moneyTransfer();
            }

        } else if (customerSelection == 2) {
            System.out.println("Please enter the account number you want to send:");
            accountSelection = scan.nextLine();
            System.out.println("Enter the amount you want to send");
            sendAmount = TryCatch.intGirisi();
            if (sendAmount >= 0 || currentCustomer.getBalaceTRY() >= sendAmount) {
                currentCustomer.setBalaceTRY(currentCustomer.getBalaceTRY() - sendAmount - 2);
                System.out.println("transaction completed successfully");
                System.out.println("your new balance : " + currentCustomer.getBalaceTRY());
                reDirectMainMenu();
            } else {
                System.out.println("Invalid amount. Redirecting Money Transfer main menu");
                moneyTransfer();
            }

        } else if (customerSelection == 3) {
            reDirectMainMenu();
        }
    }

    public void defaultCustomers() {

        Customers c1 = new Customers("Samet", "Kaya", "3s14a", "32433424", 213);
        Customers c2 = new Customers("dsa", "dsaya", "3s1424", "32433424", 213);
        customerMap.put(c1.getIdNumber(), c1);
        customerMap.put(c2.getIdNumber(), c2);
        System.out.println(customerMap);

    }

    public static String cardNumberGenerator() {
        return "4209 0000 0239" + " " + (cardNumber++);
    }

    public static int mapKeyGenerator() {
        return customerKey++;
    }

}
