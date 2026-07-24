class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int c = 0;
        int sum = 0;

        for(int right = 0; right < arr.length; right++){
            sum = sum + arr[right];

            if(right - left + 1 == k){
                int avg = sum / k;
                if(avg >= threshold)
                    c++;
                sum = sum - arr[left];
                left++;
            }
        }

        return c;
    }
}