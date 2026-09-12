
class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int reversed = 0;
         n = Math.abs(n);
         int org = n;
         
        
         while(n != 0){
             int digit = n %10;
             reversed  = reversed * 10 + digit;
             n = n /10;
         }
         
         return  org == reversed ? true : false;
        
    }
}