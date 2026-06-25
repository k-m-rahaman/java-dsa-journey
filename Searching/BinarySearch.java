public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int target = 30;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                System.out.println("Found at index " + mid);
                return;
            }

            if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        System.out.println("Element not found");
    }
}