class Solution {
    
    public void dfs(int[][] image, int i, int j, int oldColor , int newColor){
        
        int m = image.length;
        int n  = image[0].length;
        
        if(i < 0|| j<0 || i>=m || j >=n  || image[i][j] != oldColor){
            return ;
        }
        
        image[i][j] = newColor; 
        
         
        
        
        
        dfs(image, i+1, j, oldColor, newColor);
        dfs(image, i-1, j, oldColor, newColor);
        dfs(image, i, j+1, oldColor, newColor);
        dfs(image, i, j-1, oldColor, newColor);
        
        
        
    }
    
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int oldColor = image[sr][sc];
        
        if(oldColor == newColor){
            return  image;
        }
        
        
        dfs(image, sr,sc, oldColor, newColor);
        return image;
        
        
        
        
    }
}