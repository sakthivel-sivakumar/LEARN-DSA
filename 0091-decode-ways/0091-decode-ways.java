class Solution {

    public int numDecodings(String s) {

        int n = s.length();

        // dp[n] = 1
        int next1 = 1; // dp[i + 1]
        int next2 = 0; // dp[i + 2]

        for (int i = n - 1; i >= 0; i--) {

            int current = 0;

            // Cannot decode starting with 0
            if (s.charAt(i) != '0') {

                // Take one digit
                current = next1;

                // Take two digits
                if (i + 1 < n) {

                    int num = Integer.parseInt(s.substring(i, i + 2));

                    if (num >= 10 && num <= 26)
                        current += next2;
                }
            }

            // Move the window
            next2 = next1;
            next1 = current;
        }

        return next1;
    }
}