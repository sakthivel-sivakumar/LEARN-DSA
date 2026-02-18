class Solution {
    public int[] getConcatenation(int[] arr) {
         int n = arr.length;
         int res[] = new int[2*n]; 
         for(int i=0;i<n;i++){
            res[i] = arr[i];
            res[i+n] = arr[i];
         }
         return res;
    }
}