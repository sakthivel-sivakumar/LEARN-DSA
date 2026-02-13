class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        for(int i=0;i<=n;i++) // super set(all values)
        {
            int c = 0;
            for(int j=0;j<n;j++) // index 
            {
                if(i == arr[j]){
                    c = 1; break;
                }
            }
            if(c==0) return i;
        }
        return -1;
    }
}