class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n = nums.length;
        double sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        double max_avg = sum / k;

        for(int i=k;i<n;i++){
            sum = sum + nums[i]-nums[i-k];
            double temp_avg = sum / k;
            max_avg = Math.max(max_avg,temp_avg);
        }

        return max_avg;
    }
}