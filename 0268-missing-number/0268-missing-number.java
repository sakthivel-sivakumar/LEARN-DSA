class Solution {
    public int missingNumber(int[] arr) {
 

          int n = arr.length;
          for(int i=0;i<=n;i++) // super set values  (0,1,2,3)
          {
              int c = 0;
              for(int j=0;j<n;j++) // array indices  [1,3,2]
              {
                   if(arr[j] == i)
                   {
                     c = c+1;
                   }
              } 
              if(c == 0)
              return i;
          } 
          return -1;

          
      
    }
}