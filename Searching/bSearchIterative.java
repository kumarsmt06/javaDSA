package searching;

public class bSearchIterative {
    /*
     * public static bSearchIterative method for binary search
     * arr : integer sorted array, k to be searched within array
     */
    public static int bSearch(int[] arr, int k){
        int high = arr.length - 1;
        int low = 0;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==k){
                return mid;
            } else if (arr[mid] > k){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
