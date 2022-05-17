package kendiCozumlerim.bank_Project;

import kendiCozumlerim.arac_kiralama.TryCatch;

public interface Operations {

    void balanceInquiry();
    void withdrawal();
    void deposit();
    void moneyTransfer();
    void checkBalance();

     default void reDirectMainMenu(){
        System.out.println("You are redirected to the main menu");
        kendiCozumlerim.arac_kiralama.TryCatch.threadSleep(1000);
        System.out.println(".");
        kendiCozumlerim.arac_kiralama.TryCatch.threadSleep(1000);
        System.out.println(".");
        kendiCozumlerim.arac_kiralama.TryCatch.threadSleep(1000);
        System.out.println(".");
        TryCatch.threadSleep(1000);
        System.out.println(".");
        Menus.mainMenu();
    }

}
