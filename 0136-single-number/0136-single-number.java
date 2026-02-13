class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) 
        {
            int c = 0;
            for(int j=0;j<n;j++) 
            {
                if(arr[i] == arr[j]){
                    c = c+1; 
                }
            }
            if(c==1) return arr[i];
        }
        return -1;
    }
}