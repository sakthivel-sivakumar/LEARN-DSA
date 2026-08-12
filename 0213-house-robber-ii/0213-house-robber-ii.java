class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];
        
        if(n == 2)
            return Math.max(nums[0] , nums[1]);

        // Case 1: Exclude last house
        int case1 = robLinear(nums, 0, n - 2);

        // Case 2: Exclude first house
        int case2 = robLinear(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    public int robLinear(int[] nums, int start, int end) {

        int[] dp = new int[nums.length];

        int prev2 = nums[start];

        int prev1 = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2; i <= end; i++) {

            int curr = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1  = curr;
            
           
        }

        return prev1;
    }
}