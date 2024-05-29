public class MaxSubarraySum {
    /**
     * This method returns the maximum sum of a contiguous subsequence in an array of integers.
     *
     * @param a The array of integers to search.
     * @return The maximum sum of a contiguous subsequence in the array.
     */
    public  int maxSubarraySum(int[] a) {
        // If the maximum element in the array is less than or equal to 0,
        // then the maximum sum of a contiguous subsequence is the maximum element in the array.
        //{-9,-1, -4}; max = -1
        int max = max(a);
        if(max<=0){
            return max;
        }
        int sumTemp = 0;
        for (int i = 0; i < a.length ; i++) {
            sumTemp+=a[i];
            //if the sum becomes negative, then add a larger negative number to my sum,
            //so the sum would be the current one without the negative number or the new sum
            //starting from the successor of the negative number
            if (sumTemp<0){
                sumTemp = 0;
            }
            if (sumTemp>max){
                max=sumTemp;
            }
        }
        return max;
    }
    public  int max(int [] a){
        int max = a[0];
        for (int i = 1; i <a.length ; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
}
