import java.util.Arrays;

public class JumpSearch {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,11,13,15};

        int target = 11;

        int index = Arrays.binarySearch(arr,target);

        System.out.println(index);
    }
}