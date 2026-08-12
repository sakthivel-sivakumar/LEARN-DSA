class Solution {
    public int[] twoSum(int[] arr, int t) {
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int bal = t - arr[i];
            if(hm.containsKey(bal)){
                return new int[]{i,hm.get(bal)};
            }
            else{
                hm.put(arr[i] , i);
            }
        }

        return new int[]{-1,-1};
    }
}