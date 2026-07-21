class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        boolean flag = false;

        int left = 0;
        for(int right=0;right<n;right++){
            sum = sum + nums[right];
            while(sum >= target){
                int temp_len = right-left+1;
                len = Math.min(temp_len,len);
                flag = true;
                sum = sum - nums[left];
                left++;
            }
        }

        return flag ? len : 0;
    }
}