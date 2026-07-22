class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
            
        }

        List<Integer> res = new ArrayList<>();

        for(int i:hm.keySet())
            if(hm.get(i) == 2)
                res.add(i);
        return res;
    }
}