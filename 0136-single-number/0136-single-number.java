class Solution {
    public int singleNumber(int[] arr) {  // 10, 20 , 20, 10 , 30;
        int n = arr.length; 
        for(int i=0;i<n;i++) 
        {
            int c = 1;
            for(int j=0;j<n;j++) 
            {
               if(i!= j && arr[i] == arr[j])
               c++;
            }
            if(c == 1)
                return arr[i];
           
        }
        return -1;
    }
}