//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int count =0;
        int num= n;
        int sum=0;
        // while(n>0){
        //     n= n/10;
        //     count++;
            
        // }
        
        
        while(n> 0){
            int r = n % 10;
            sum = sum + r*r*r;
            n= n/10;
            
        }
        
        
        if(sum  == num){
            return "true";
            
        }
        else 
          return "false";
        
        
        
        
        
        
    }
}