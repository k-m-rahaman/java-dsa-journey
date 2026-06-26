public class LastOccurrence {

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4};
        int target = 2;

        int index = -1;

        for(int i = arr.length-1; i>=0; i--) {

            if(arr[i] == target){
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}