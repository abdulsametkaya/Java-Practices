package _09_Arrays;

public class Q17 {
    /* TASK :
    Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
    Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

     */
    public static void main(String[] args) {
        int[] somun = {2, 5, 1, 3, 12, 7};
        int[] civata = {12, 3, 7, 5, 2, 1};

        for (int j : somun) {
            for (int k : civata) {
                if (j == k) {
                    System.out.print("somun " + j + " ile  " + "civata " + k + " birbirine uygundur \n");
                }
            }
        }

    }

}
