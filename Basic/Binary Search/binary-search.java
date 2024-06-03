//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
     int low = 0;
     int high = n-1;
     while(low<= high){
     int middle = (low + high) /2;
         if(k == arr[middle]){
             return middle;
         }else if(k < arr[ middle]){
             low = low;
             high = middle -1;
             
         }else{
             high = high;
             low = middle +1;
         }
         
         
         
     }
     return -1;
     
    }
}