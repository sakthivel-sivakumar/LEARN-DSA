class Solution {
    public int numIdenticalPairs(int[] arr) {
        int n = arr.length;
        int c = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele:arr){
            if(hm.containsKey(ele)){
                int v = hm.get(ele);
                c = c +v ;
                hm.put(ele,v+1);
            }
            else{
                hm.put(ele,1);
            }
        }

        return c;
    }
}