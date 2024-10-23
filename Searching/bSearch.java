package searching;
/***
 * public class bSearch
 * binary search iterative method
 */
public class bSearch {
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
        System.out.println("index of "+findx+" in sorted array "+ arrString + " is: " + bSearchIterative.bSearch(sortedArray,findx));
        System.out.println("index of "+findx+" in sorted array "+ arrString + " is: " + bSearchRecursive.bSearch(sortedArray,sortedArray.length-1,0,8));
    }
}