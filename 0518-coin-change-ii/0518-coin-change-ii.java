class Solution {
    public int change(int amount, int[] coins) {

        int[] dp = new int[amount + 1];

        // One way to make amount 0: choose nothing
        dp[0] = 1;

        // Process one coin at a time
        for (int coin : coins) {

            // Build all possible amounts using this coin
            for (int sum = coin; sum <= amount; sum++) {
                dp[sum] += dp[sum - coin];
            }
        }

        return dp[amount];
    }
}