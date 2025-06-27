// User function Template for Java
class Solution {
    int minCost(int[] height) {
        int n = height.length;
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            int oneJump = dp[i - 1] + Math.abs(height[i - 1] - height[i - 2]);
            int twoJump = Integer.MAX_VALUE;

            if (i >= 3) {
                twoJump = dp[i - 2] + Math.abs(height[i - 1] - height[i - 3]);
            }

            dp[i] = Math.min(oneJump, twoJump);
        }

        return dp[n];
    }
}
