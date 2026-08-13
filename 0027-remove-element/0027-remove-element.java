class Solution {
    public int removeElement(int[] nums, int val) {


        int l = 0;
        int r = 0;
        for(r = 0;r < nums.length;r++){
            if(nums[r] != val){
                int t = nums[r];
                nums[r] = nums[l];
                nums[l] = t;
                l++;
            }
        }

        return l;
        
    }
}