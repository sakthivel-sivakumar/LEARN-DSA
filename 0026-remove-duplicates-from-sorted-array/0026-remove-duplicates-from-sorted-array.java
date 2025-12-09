class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int j=0;
        for(int i=1;i<n;i++){
            if(arr[i] !=  arr[j]){
                int temp = arr[i]; 
                arr[i] = arr[j+1]; 
                arr[j+1] = temp; 
                j++;
            }
        }
        return j+1;
    }
}