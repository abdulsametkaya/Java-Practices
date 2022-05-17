package _15_Exceptions.Q04;


//     5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
//        active ve signedIn default olarak true, false atayabilirsiniz.
//        id yi sistem otomatik versin.,
//     6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
//        6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.

import java.util.Scanner;

public class UserMain {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Name: ");
        User user1 = new User();
        user1.setUsername(scan.nextLine());

        boolean bl = true;
        while(bl){
            try {
                System.out.println("Sifre: ");
                user1.setPassword(scan.nextLine());
                if (user1.getPassword().length()<6){
                    throw new Exception();
                }else
                {
                    bl = false;
                }
            } catch (Exception e) {
                System.out.println("sifre minimum 6 haneli olmalidir");
            }
        }
        user1.setActive(true);
        user1.setSignedIn(true);
        user1.setId(100);

        User.userList.add(user1);



    }


}
