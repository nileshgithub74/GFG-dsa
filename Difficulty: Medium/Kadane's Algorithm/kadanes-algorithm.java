class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int max = arr[0];
        int currsum = 0;
        for(int i = 0; i< arr.length; i++){
            currsum += arr[i];
            currsum = Math.max(currsum, arr[i]);
            max = Math.max(max, currsum);
            
        }
        return max;
    }
}
