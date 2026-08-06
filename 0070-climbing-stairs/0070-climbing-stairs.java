class Solution {
    public int rec(int level,int n,int[] dp){
        if(level > n)
            return 0;
        
        if(level == n)
            return 1;
        
        if(dp[level] != -1)
            return dp[level];
        
        return dp[level] = rec(level+1 , n,dp) + rec(level+2,n,dp);
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        rec(0, n,dp);
        return dp[0];
    }
}