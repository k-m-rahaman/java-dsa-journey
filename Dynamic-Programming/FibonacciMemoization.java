import java.util.Arrays;

public class FibonacciMemoization {

    static int fibonacci(int n, int[] dp) {

        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fibonacci(n - 1, dp)
                + fibonacci(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 10;

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        System.out.println(
                "Fibonacci Number = "
                        + fibonacci(n, dp)
        );
    }
}