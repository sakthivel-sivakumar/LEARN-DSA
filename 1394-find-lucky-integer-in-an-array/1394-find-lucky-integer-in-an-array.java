class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for(int i=0;i<n;i++){
            int c = 1;
            for(int j=0;j<n;j++)
            {
                if(i!=j )
                {
                   if(arr[i] == arr[j])
                   c++; 
                }
            }
            if(c == arr[i])
                ans = Math.max(arr[i],ans);
        }
        return ans;
    }
}