class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 1;
        for(r = 1;r < nums.length;r++){
            if(nums[r] != nums[l]){
                l++;
                int t = nums[r];
                nums[r] = nums[l];
                nums[l] = t;
            }
        }

        return l+1;
    }
}