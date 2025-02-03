//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            t--;

            System.out.println(new Solution().findsum(arr) == true ? "true" : "false");
        }
    }
}
// } Driver Code Ends






class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[])
    {
        //Your code here
        
        int n = arr.length;
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0;
        for(int i =0;i<n;i++){
            pre_sum += arr[i];
            if(h.contains(pre_sum)) return true;
            if(pre_sum == 0) return true;
            h.add(pre_sum);
        }
        return false;
    }
}