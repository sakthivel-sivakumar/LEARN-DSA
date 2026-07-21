class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        long sum = 0;
        long ans = 0;

        for (int right = 0; right < nums.length; right++) {

            // Step 1 : Add Incoming Element
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Step 2 : Check Window Size
            if (right - left + 1 == k) {

                // Step 3 : Process Current Window
                if (map.size() == k) {
                    ans = Math.max(ans, sum);
                }

                // Step 4 : Remove Outgoing Element
                sum -= nums[left];

                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                // Step 5 : Slide Window
                left++;
            }
        }

        return ans;
    }
}