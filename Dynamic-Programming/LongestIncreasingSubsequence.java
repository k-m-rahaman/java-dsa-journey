public class LongestIncreasingSubsequence {

    static int lis(int[] arr) {

        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n];

        // Every element itself is a subsequence
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]) {

                    dp[i] = Math.max(
                            dp[i],
                            dp[j] + 1
                    );
                }
            }
        }

        int answer = 0;

        for (int value : dp) {
            answer = Math.max(answer, value);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {
                10, 9, 2, 5, 3, 7, 101, 18
        };

        System.out.println(
                "Longest Increasing Subsequence Length = "
                        + lis(arr)
        );
    }
}