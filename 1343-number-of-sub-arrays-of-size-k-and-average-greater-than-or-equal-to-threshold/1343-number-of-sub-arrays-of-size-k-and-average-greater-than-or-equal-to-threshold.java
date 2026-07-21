class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int n = nums.length;
        double sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        double avg = sum / k;
        int c = 0;
        if(avg >= threshold)
            c++;

        for(int i=k;i<n;i++){
            sum = sum + nums[i]-nums[i-k];
            avg = sum / k;
            if(avg >= threshold)
                c++;
            
        }

        return c;

    }
}