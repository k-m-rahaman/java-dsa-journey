public class ExponentialSearch {

    static int binarySearch(int[] arr,int left,int right,int target){

        while(left<=right){

            int mid=(left+right)/2;

            if(arr[mid]==target)
                return mid;

            if(arr[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }

        return -1;
    }

    public static void main(String[] args){

        int[] arr={2,4,6,8,10,12,14};

        int target=10;

        int i=1;

        while(i<arr.length && arr[i]<=target)
            i*=2;

        System.out.println(binarySearch(arr,i/2,
                Math.min(i,arr.length-1),target));
    }
}