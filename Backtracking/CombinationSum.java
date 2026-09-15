import java.util.*;

public class CombinationSum {

    static void findCombinations(
            int[] candidates,
            int target,
            int index,
            List<Integer> current,
            List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        // Include current candidate
        current.add(candidates[index]);

        findCombinations(
                candidates,
                target - candidates[index],
                index,
                current,
                result
        );

        current.remove(current.size() - 1);

        // Skip current candidate
        findCombinations(
                candidates,
                target,
                index + 1,
                current,
                result
        );
    }

    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();

        findCombinations(
                candidates,
                target,
                0,
                new ArrayList<>(),
                result
        );

        System.out.println("Combinations:");

        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}