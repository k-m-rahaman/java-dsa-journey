// Find the maximum XOR value possible between any two numbers.

// We build the answer bit by bit, starting from the most significant bit.

public class MaximumXORPair {

    static int findMaximumXOR(int[] nums) {

        int answer = 0;
        int mask = 0;

        for (int bit = 31; bit >= 0; bit--) {

            mask |= (1 << bit);

            java.util.HashSet<Integer> prefixes = new java.util.HashSet<>();

            for (int num : nums) {
                prefixes.add(num & mask);
            }

            int candidate = answer | (1 << bit);

            for (int prefix : prefixes) {

                if (prefixes.contains(prefix ^ candidate)) {
                    answer = candidate;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {3, 10, 5, 25, 2, 8};

        System.out.println(
            "Maximum XOR: " + findMaximumXOR(nums)
        );
    }
}

// Output
// Maximum XOR: 28

// Because:

// 5  = 00101
// 25 = 11001
// ------------
//      11100 = 28