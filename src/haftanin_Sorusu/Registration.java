package haftanin_Sorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    ArrayList<User> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public ArrayList<User> register() {
        System.out.println("Kullanici adini giriniz");
        User user = new User();
        user.setName(scan.nextLine());
        list.add(user);
        user.setRegisterDate(LocalDateTime.now());
        return list;
    }

    public void printHappyUsers(ArrayList<User> register) {
        for (User user : register) {
            if (user.getRegisterDate().getSecond() <= 10) {
                System.out.println(register.get(0).getName() + " is Lucky");
            }
        }
    }


}
