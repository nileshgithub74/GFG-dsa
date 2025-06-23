// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    
    
    static void reverseArr(int[] arr, int i , int j){
        while(i<j){
           int temp= arr[i];
           arr[i] = arr[j];
           arr[j ] = temp;
           i++;
           j--;
        }
    }
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        
        d = d%n;
        
        reverseArr(arr, 0, d-1);
        reverseArr(arr, d,n-1);
        reverseArr(arr, 0, n-1);
        
        
        
        
        
        
        
        
    }
}