class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int max = Integer.MIN_VALUE;
        int points = 0;

        for(int i=0;i<=k+k-1;i++){
            if(i < k){
                points += arr[left];
                left++;
            }
            else{
                points = points + arr[right] - arr[--left];
                right--;
            }
            max = Math.max(points, max);
        }

        points = 0;
        for(int i=0;i<k;i++){
            points += arr[n-i-1];
        }
        max = Math.max(points, max);
        return max;  
    }
}

