class Solution {
    public int diagonalSum(int[][] arr) {

         int r = arr.length; // row
         int c = arr[0].length; // col
         int sum = 0;

         for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
                if(i == j)
                    sum = sum + arr[i][j];
                else if(i+j == c-1)
                    sum = sum + arr[i][j];
            }
         }

         return sum;

        
    }
}