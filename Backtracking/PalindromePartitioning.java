import java.util.*;

public class PalindromePartitioning {

    static boolean isPalindrome(
            String str,
            int left,
            int right) {

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    static void partition(
            String str,
            int start,
            List<String> current,
            List<List<String>> result) {

        if (start == str.length()) {

            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start;
             end < str.length();
             end++) {

            if (isPalindrome(str, start, end)) {

                current.add(
                        str.substring(start, end + 1)
                );

                partition(
                        str,
                        end + 1,
                        current,
                        result
                );

                // Backtrack
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        String str = "aab";

        List<List<String>> result = new ArrayList<>();

        partition(
                str,
                0,
                new ArrayList<>(),
                result
        );

        System.out.println("Palindrome Partitions:");

        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}