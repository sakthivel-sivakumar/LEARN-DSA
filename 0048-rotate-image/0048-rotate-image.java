class Solution {
    public void rotate(int[][] arr) {
        int r = arr.length;
        // transpose matrix
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }

        // reverse every row
        for(int i=0;i<r;i++){
            int left=0; int right=r-1;
            while(left<right){
                int t = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = t;
                left++; right--;
            }
        }
    }
}