// Count the total number of set bits from 1 to n.

// We use:

// bits(i) = bits(i >> 1) + (i & 1)

public class CountBitsFromOneToN {

    static int countBits(int n) {

        int[] dp = new int[n + 1];
        int total = 0;

        for (int i = 1; i <= n; i++) {

            dp[i] = dp[i >> 1] + (i & 1);
            total += dp[i];
        }

        return total;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(
            "Total set bits from 1 to " + n + ": "
            + countBits(n)
        );
    }
}

// Output
// Total set bits from 1 to 5: 7

// Because:

// 1 = 001 → 1 bit
// 2 = 010 → 1 bit
// 3 = 011 → 2 bits
// 4 = 100 → 1 bit
// 5 = 101 → 2 bits

// Total = 7