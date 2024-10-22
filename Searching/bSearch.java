package Searching;
/***
 * public class bSearch
 * binary search iterative method
 */
public class bSearch {
    /*
     * public static bSearchIterative method for binary search
     * arr : integer sorted array, k to be searched within array
     */
    public static int bSearchIterative(int[] arr, int k){
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

    /*
     * method to convert the array into string array
     */
    public static String ArrayToString(int[] arr){
        StringBuilder arrayString = new StringBuilder();
        arrayString.append("[");
        
            for( int a : arr){
                arrayString.append(a);
                arrayString.append(",");
            }
        arrayString.append("]");
        return arrayString.toString();
    }
    public static void main(String[] args) {
        System.out.println("binary search");
        int[] sortedArray = {1,2,3,4,5,6};
        int findx = 5;
        String arrString = ArrayToString(sortedArray);
        System.out.println("index of "+findx+" in sorted array "+ arrString + " is: " + bSearchIterative(sortedArray,findx));
    }
}