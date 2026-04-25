class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int j = 0;
        int count = 1;
        for(int i=1;i<n;i++){
            
            if(nums[j] == nums[i])
            {
                count++;
                if(count<=2){
                     j++;
                     nums[j] = nums[i];
                     
                }  
            }
            else{
                nums[j+1] = nums[i]; 
                j++;
                count = 1;
            }
            
        }
        return j+1;
    }
}