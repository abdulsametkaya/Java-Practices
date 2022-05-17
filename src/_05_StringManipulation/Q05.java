package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
     */
        String str1 = "%13.99";
        String str2 = "%10.55";

        String str1N = str1.substring(1);
        String str2N = str2.substring(1);

        double db1 = Double.parseDouble(str1N);
        double db2 = Double.parseDouble(str2N);

        System.out.println(db1 + db2);





    }
}
