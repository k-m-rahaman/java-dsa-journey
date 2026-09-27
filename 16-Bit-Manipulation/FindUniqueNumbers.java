// Every number appears twice, but two numbers appear only once.

// Example:

// 1 2 1 3 2 5

// Unique numbers:

// 3 and 5

// First XOR everything. Then use the rightmost set bit to separate the two unique numbers.

public class FindUniqueNumbers {

    static int[] findUnique(int[] nums) {

        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        // Get the rightmost set bit
        int mask = xor & -xor;

        int first = 0;
        int second = 0;

        for (int num : nums) {

            if ((num & mask) == 0) {
                first ^= num;
            } else {
                second ^= num;
            }
        }

        return new int[]{first, second};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 3, 2, 5};

        int[] result = findUnique(nums);

        System.out.println(
            "Unique numbers: " + result[0] + " and " + result[1]
        );
    }
}

// Unique numbers: 3 and 5

