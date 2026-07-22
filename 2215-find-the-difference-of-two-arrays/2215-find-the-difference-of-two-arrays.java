class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<2;i++)
            res.add(new ArrayList<>());

        Set<Integer> hs = new HashSet<>();
        for(int i:nums2)
            hs.add(i);

        for(int i:nums1)
        {
            if(!hs.contains(i) && !res.get(0).contains(i))
                res.get(0).add(i);
        }

        hs.clear();

        for(int i:nums1)
            hs.add(i);

        for(int i:nums2)
        {
            if(!hs.contains(i) && !res.get(1).contains(i))
                res.get(1).add(i);
        }
           
        

        return res;
    }
}