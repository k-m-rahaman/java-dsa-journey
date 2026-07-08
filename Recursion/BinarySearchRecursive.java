public class BinarySearchRecursive {

    static int search(int[] arr, int left, int right, int target) {

        if (left > right)
            return -1;

        int mid = (left + right) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] > target)
            return search(arr, left, mid - 1, target);

        return search(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        System.out.println(search(arr,0,arr.length-1,40));
    }
}