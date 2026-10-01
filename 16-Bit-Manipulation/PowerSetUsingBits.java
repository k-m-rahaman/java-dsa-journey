// For an array of n elements, there are 2^n possible subsets.

// Each bit represents whether an element is selected.

// 0 → don't select
// 1 → select

public class PowerSetUsingBits {

    static void generateSubsets(int[] nums) {

        int total = 1 << nums.length;

        for (int mask = 0; mask < total; mask++) {

            System.out.print("{ ");

            for (int i = 0; i < nums.length; i++) {

                if ((mask & (1 << i)) != 0) {
                    System.out.print(nums[i] + " ");
                }
            }

            System.out.println("}");
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        generateSubsets(nums);
    }
}

// Output
// { }
// { 1 }
// { 2 }
// { 1 2 }
// { 3 }
// { 1 3 }
// { 2 3 }
// { 1 2 3 }