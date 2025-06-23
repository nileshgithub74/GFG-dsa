class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int leftsum =0;
        int rightsum = 0;
        for(int i =0; i<n ; i++){
            rightsum += arr[i];
            
        }
        for(int i =0; i< n; i++){
            rightsum   -= arr[i];
            if(rightsum == leftsum){
                return i;
            }
            
            leftsum += arr[i];
            
          
        }
        return -1;
        
    }
}
