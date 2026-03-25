class Solution {
    public int numIdenticalPairs(int[] arr) {
        int n = arr.length;
        int c = 0;
        
        for(int i =0; i<n; i++){
            
            for (int j =i+1; j<n; j++){
                if(arr[i]==arr[j])
                c++;
            }
           
        }
     return c;
    }
}