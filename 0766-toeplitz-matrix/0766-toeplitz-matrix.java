class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {

         int r = arr.length; // row
         int c = arr[0].length; // col

         for(int i=0;i<r-1;i++)
         {
            for(int j=0;j<c-1;j++)
            {
                if(arr[i][j] !=  arr[i+1][j+1])
                return false;
            }
         }
         return true;
        
    }
}