class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int left = 0; int right = n-1;
        int ans[] = new int[n];  int i=n-1;
        while(left <= right){
            int r1 = arr[left]*arr[left]; 
            int r2 = arr[right]*arr[right]; 

            if(r1 > r2){
                ans[i--] = r1;
                left++;
            }
            else{
                ans[i--] = r2;
                right--;
            }
            
        }

        return ans;
        
    }
}