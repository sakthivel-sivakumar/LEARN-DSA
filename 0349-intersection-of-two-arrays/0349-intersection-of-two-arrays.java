class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> al = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        for(int x:nums1)
            al.add(x);
        for(int x:nums2)
            if(al.contains(x))
                intersect.add(x);

        int result[] = new int[intersect.size()];
        int i=0;
        for(int x:intersect)
            result[i++]=x;
        return result;
    }
}