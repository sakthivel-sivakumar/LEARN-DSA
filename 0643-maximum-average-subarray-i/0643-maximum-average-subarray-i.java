class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int left = 0;
        double sum = 0;
        double ans = Double.NEGATIVE_INFINITY;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            if (right - left + 1 == k) {

                ans = Math.max(ans, sum / k);

                sum -= arr[left];
                left++;
            }
        }

        return ans;
    }
}