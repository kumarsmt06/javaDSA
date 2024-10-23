package searching;

public class bSearchRecursive {
    
    /*
     * Recursive binary search
     */
    public static int bSearch(int[] arr, int high, int low, int k){
        if(low > high) return -1;
        
        int mid = low + (high - low)/2;

        if(arr[mid] == k){
            return mid;
        } else if(arr[mid] > k ){
            return bSearch(arr, mid - 1, low, k);
        } else {
            return bSearch(arr, high, mid + 1, k);

        }
    }
}
