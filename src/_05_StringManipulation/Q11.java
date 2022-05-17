package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int num1 = pickName.indexOf('A');
        int num2 = pickName.indexOf('L');
        int num3 = pickName.indexOf('I');

        System.out.println("" + pickName.charAt(num1) + pickName.charAt(num2) + pickName.charAt(num3));


    }

}
