package kendiCozumlerim.Questions;

public class Q8 {
    //String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    //String str1 = “$13.99”
    //String str2 = “$10.55”

    public static void main(String[] args) {

        String str1 = "$13.99";
        String str2 = "$10.55";

        String nstr1 = str1.substring(1);
        String nstr2 = str2.substring(1);

        double d1 = Double.parseDouble(nstr1);
        double d2 = Double.parseDouble(nstr2);

        System.out.println(d1 + d2);




    }

}
