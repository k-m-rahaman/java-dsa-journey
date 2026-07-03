import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static void bucketSort(float[] arr) {

        int n = arr.length;

        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++)
            buckets[i] = new ArrayList<>();

        for (float num : arr) {

            int index = (int) (num * n);

            buckets[index].add(num);
        }

        for (ArrayList<Float> bucket : buckets)
            Collections.sort(bucket);

        int index = 0;

        for (ArrayList<Float> bucket : buckets) {

            for (float num : bucket) {

                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {

        float[] arr = {
                0.42f,
                0.32f,
                0.23f,
                0.52f,
                0.25f,
                0.47f,
                0.51f
        };

        bucketSort(arr);

        for (float num : arr)
            System.out.print(num + " ");
    }
}