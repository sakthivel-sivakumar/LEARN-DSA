class Solution {
    public boolean checkXMatrix(int[][] arr) {


        int r = arr.length; // row
         int c = arr[0].length; // col

         for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
                if(i == j  || (i+j == c-1) )
                {
                    if(arr[i][j] == 0)
                        return false;

                }
                else
                {
                    if(arr[i][j]!=0) 
                        return false;
                }
            }
         }
         return true;

        
        
    }
}