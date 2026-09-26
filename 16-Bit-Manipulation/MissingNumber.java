// Array contains numbers from 0 to n, but one number is missing.

// XOR cancels matching numbers.

public class MissingNumber {

    static int findMissing(int[] nums) {

        int n = nums.length;
        int result = n;

        for (int i = 0; i < n; i++) {
            result ^= i;
            result ^= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        System.out.println("Missing number: " + findMissing(nums));
    }
}

// Missing number: 2