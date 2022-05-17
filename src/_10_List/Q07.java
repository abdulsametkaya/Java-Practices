package _10_List;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 1,};
        boolean bl = true;

        if (arr.length % 2 != 0) {
            System.out.println("simetrik değildir");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    bl = false;
                }
            }

            if (bl) {
                System.out.println("simetriktir");
            } else {
                System.out.println("simetrik değildir");

            }
        }


    }
}