class Solution {

    public int numDecodings(String s) {

        int n = s.length();

        int[] dp = new int[n + 1];

        // Base case
        dp[n] = 1;

        // Fill from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Cannot decode a number starting with 0
            if (s.charAt(i) == '0') {
                dp[i] = 0;
                continue;
            }

            // Take one digit
            int one = dp[i + 1];

            // Take two digits
            int two = 0;

            if (i + 1 < n) {

                int num = Integer.parseInt(s.substring(i, i + 2));

                if (num >= 10 && num <= 26)
                    two = dp[i + 2];
            }

            dp[i] = one + two;
        }

        return dp[0];
    }
}