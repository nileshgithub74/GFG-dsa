class Solution {
    boolean isBinary(String s) {
        // Your code here
        int length = s.length();
        
        for(int i =0; i < length; i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1'){
                return false;
            }
        }
        return true;
    }
}