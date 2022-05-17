package _05_StringManipulation;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */
        String str = "Ahmet Emin Yılmaz";

        System.out.println(str.toUpperCase().charAt(0) + ". " +
                str.toUpperCase().charAt(str.indexOf(" ") + 1) + ". " +
                str.toUpperCase().charAt(str.lastIndexOf(" ") + 1) + ".");
    }
}
