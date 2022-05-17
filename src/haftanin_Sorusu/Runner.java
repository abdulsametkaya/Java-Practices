package haftanin_Sorusu;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Registration userReg = new Registration();
        ArrayList<User> register = userReg.register();
        userReg.printHappyUsers(register);
    }
}
