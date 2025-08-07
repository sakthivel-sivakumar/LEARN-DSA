class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = nse(arr);
        int[] pse = pse(arr);
        long total = 0;
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + (1L * left * right % mod) * arr[i]) % mod;
        }
        return (int) total;
    }

    public int[] nse(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        int[] stack = new int[n];
        int top = -1;
        for (int i = n - 1; i >= 0; i--) {
            while (top >= 0 && arr[stack[top]] >= arr[i]) {
                top--;
            }
            nse[i] = (top == -1) ? n : stack[top];
            stack[++top] = i;
        }
        return nse;
    }

    public int[] pse(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            while (top >= 0 && arr[stack[top]] > arr[i]) {
                top--;
            }
            pse[i] = (top == -1) ? -1 : stack[top];
            stack[++top] = i;
        }
        return pse;
    }
}
