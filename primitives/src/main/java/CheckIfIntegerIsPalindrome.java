public class CheckIfIntegerIsPalindrome {

    /*
    5.9
    */

    public static boolean isPalindrome(int x) {
        //FROM BOOK SOLUTION
        if (x < 0)
            return false;

        int i = 0, j = 31;
        for (int k = 0; k <= 16; k++) {
            if (((x >>> i++) & 1) != ((x >>> j--) & 1)) {
                return false;
            }
        }
        return true;
    }
}
