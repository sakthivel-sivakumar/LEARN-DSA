class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                int indx = hm.get(nums[i]);
                if(Math.abs(indx-i) <= k)
                    return true;
            }
            hm.put(nums[i],i);
        }

        return false;
        
    }
}