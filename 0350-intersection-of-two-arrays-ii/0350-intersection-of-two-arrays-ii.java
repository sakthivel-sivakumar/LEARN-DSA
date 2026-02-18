class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
       int freq[] = new int[1001];
       int res[] = new int[arr1.length+arr2.length];
       for(int i=0;i<arr1.length;i++)
       {
          freq[arr1[i]]++;
       }
       int k = 0;
       for(int i=0;i<arr2.length;i++)
       {
           if(freq[arr2[i]]  >= 1)
           {
             res[k] = arr2[i]; 
             freq[arr2[i]]--;
             k++;
           }
       }

       return Arrays.copyOf(res,k);
        
    }
}