class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        for(r = 0;r < nums.length;r++){
            if(nums[r] != 0){
                int t = nums[r];
                nums[r] = nums[l];
                nums[l] = t;
                l++;
            }
        }
    }
}