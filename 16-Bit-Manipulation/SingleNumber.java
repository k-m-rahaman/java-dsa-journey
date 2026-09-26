// If every number appears twice except one:

// x ^ x = 0
// x ^ 0 = x

// So XOR all numbers.

public class SingleNumber {

    static int findSingle(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};

        System.out.println("Single number: " + findSingle(nums));
    }
}


// Missing number: 2

