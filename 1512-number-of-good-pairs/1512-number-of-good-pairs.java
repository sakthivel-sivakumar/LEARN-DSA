class Solution {
    public int numIdenticalPairs(int[] arr) {

        int c = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    c++;
                }
            }
        }
        return c;
       
    }
}