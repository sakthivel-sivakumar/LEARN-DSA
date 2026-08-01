class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            // Expand
            if (nums[right] == 0)
                zeros++;

            // Make window valid
            while (zeros > k) {
                if (nums[left] == 0)
                    zeros--;
                left++;
            }

            // Update answer
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}