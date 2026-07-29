class Solution {
    public int maxScore(int[] arr, int k) {

        int n = arr.length;

        int left = 0;
        int right = n - 1;

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 2 * k; i++) {

            if (i < k) {
                sum += arr[left++];
            } else {
                sum = sum - arr[--left] + arr[right--];
            }

            // Update only after selecting exactly k cards
            if (i >= k - 1) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}