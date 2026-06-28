public class InterpolationSearch {

    public static void main(String[] args) {

        int[] arr={10,20,30,40,50};

        int target=40;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){

                System.out.println(i);

                return;
            }
        }

        System.out.println("Not Found");
    }
}