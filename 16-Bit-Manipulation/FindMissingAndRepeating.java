// An array contains numbers from 1 to n.

// One number is missing and another appears twice.

// Example:

// 1 2 2 4 5

// Missing → 3
// Repeating → 2

// We can use XOR to separate them.

public class FindMissingAndRepeating {

    static void findNumbers(int[] nums) {

        int n = nums.length;

        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        for (int num : nums) {
            xor ^= num;
        }

        // Rightmost set bit
        int mask = xor & -xor;

        int first = 0;
        int second = 0;

        for (int i = 1; i <= n; i++) {

            if ((i & mask) == 0) {
                first ^= i;
            } else {
                second ^= i;
            }
        }

        for (int num : nums) {

            if ((num & mask) == 0) {
                first ^= num;
            } else {
                second ^= num;
            }
        }

        // Determine which one is repeating
        for (int num : nums) {

            if (num == first) {
                System.out.println("Repeating number: " + first);
                System.out.println("Missing number: " + second);
                return;
            }

            if (num == second) {
                System.out.println("Repeating number: " + second);
                System.out.println("Missing number: " + first);
                return;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4, 5};

        findNumbers(nums);
    }
}

// Output
// Repeating number: 2
// Missing number: 3