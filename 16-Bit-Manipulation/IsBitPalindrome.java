// Compare the leftmost and rightmost bits.

// If they differ, the binary representation is not a palindrome.

public class IsBitPalindrome {

    static boolean isPalindrome(int number) {

        int left = 31;
        int right = 0;

        while (left > right) {

            while (left > right && ((number >> left) & 1) == 0) {
                left--;
            }

            while (left > right && ((number >> right) & 1) == 0) {
                right++;
            }

            if (((number >> left) & 1) != ((number >> right) & 1)) {
                return false;
            }

            left--;
            right++;
        }

        return true;
    }

    public static void main(String[] args) {

        int number = 9;

        System.out.println(
            "Is bit palindrome: " + isPalindrome(number)
        );
    }
}

// Output
// Is bit palindrome: true

// Because:

// 9 = 1001

// and 1001 reads the same from both directions.