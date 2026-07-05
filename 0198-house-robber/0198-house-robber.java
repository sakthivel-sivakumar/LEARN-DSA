import java.util.Arrays;
class Solution {

    public int helper(int[] arr, int i,int[] dp){
        if(i >= arr.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int pick = arr[i] + helper(arr,i+2,dp);
        int notPick = helper(arr,i+1,dp);

        return dp[i] = Math.max(pick,notPick);
    }
    public int rob(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return helper(arr,0,dp);
    }
}