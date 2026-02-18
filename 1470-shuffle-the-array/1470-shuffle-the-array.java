class Solution {
    public int[] shuffle(int[] arr, int n) {
        
         int res[] = new int[2*n];


         for(int i=0;i<n;i++)
         {
            res[2*i] = arr[i];
            res[2*i+1] = arr[i+n];
         }

         return res;

    }
}