class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           
                s.add(nums[i]);
        }

        int n1 = nums.length;
        int n2 = s.size();

        if(n1  == n2)
            return false;
        else
        return true;

        
    }
}