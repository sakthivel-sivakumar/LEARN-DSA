class Solution {

    int[] dp;

    public int climb(int[] arr, int n, int level) {

        if (level >= n)
            return 0;

        if (dp[level] != -1)
            return dp[level];

        return dp[level] =
                arr[level] +
                Math.min(
                    climb(arr, n, level + 1),
                    climb(arr, n, level + 2)
                );
    }

    public int minCostClimbingStairs(int[] arr) {

        int n = arr.length;

        dp = new int[n];

        Arrays.fill(dp, -1);

        return Math.min(
                climb(arr, n, 0),
                climb(arr, n, 1)
        );
    }
}