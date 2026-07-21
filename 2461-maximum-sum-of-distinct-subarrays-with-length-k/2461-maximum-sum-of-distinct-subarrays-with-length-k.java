class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long ans = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k)
            ans = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            // Remove outgoing element
            int out = nums[i - k];
            sum -= out;

            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0)
                map.remove(out);

            // Add incoming element
            int in = nums[i];
            sum += in;
            map.put(in, map.getOrDefault(in, 0) + 1);

            // Check validity
            if (map.size() == k)
                ans = Math.max(ans, sum);
        }

        return ans;
    }
}