public class CountingSort {

    public static void countingSort(int[] arr) {

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        System.out.print("Sorted Array: ");

        for (int num : arr)
            System.out.print(num + " ");
    }
}