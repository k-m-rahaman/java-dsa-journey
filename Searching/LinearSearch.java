public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {5, 12, 8, 20, 15};
        int target = 20;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}