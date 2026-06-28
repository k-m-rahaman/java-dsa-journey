public class PeakElement {

    public static void main(String[] args) {

        int[] arr = {1,3,20,4,1};

        int peak = arr[0];

        for(int num : arr){
            if(num > peak)
                peak = num;
        }

        System.out.println(peak);
    }
}