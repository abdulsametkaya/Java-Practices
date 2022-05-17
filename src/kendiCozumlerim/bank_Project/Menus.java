package kendiCozumlerim.bank_Project;

public class Menus {   //Ana menu
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    public static void registerMenu() {

        System.out.println("========================== WELCOME COSMOS BANK =======================\r\n"

                + "   ____________________             ____________________    \n"
                + "   | 1-LOGIN  |                      | 2-REGISTER |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   " + B);

        System.out.print("ISLEM SECİNİZ : ");


        if(TryCatch.intGirisi()==1){
            login();
        }else{
            register();
        }
    }

    private static void register() {
    }

    private static void login() {

    }

    public static void mainMenu() { // Kullanıcı login/register olduktan sonraki ekran

        System.out.println("========================== CUSTOMER OPERATION =======================\r\n"

                + "   ____________________             ____________________    \n"
                + "   | 1-CHECK BALANCE |                | 2-WITHDRAWAL |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   _____________________             ____________________    \n"
                + "   | 3-DEPOSIT|                      | 4-UPDATE COSTUMER |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   _____________________            _____________________   \n"
                + "   | 5-FOREIGN CURRENCY|            | 6- LOAN TRANSACTION         |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  "
                + "   _____________________            _____________________   \n"
                + "   | 7-EXIT|                         | 8- -----          |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  " + B);

        System.out.print("ISLEM SECİNİZ : ");
    }




}
