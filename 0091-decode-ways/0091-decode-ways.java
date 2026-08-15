class Solution {

    public static int[] dp;
    public int numDecodings(String s) {
        dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        fun(s, 0,dp);
        return dp[0];
    }

    int fun(String s, int i,int[] dp) {

        // Successfully reached the end
        if (i == s.length())
            return dp[i] = 1;

        // Cannot decode a number starting with 0
        if (s.charAt(i) == '0')
            return dp[i] = 0;
        
        if(dp[i] != -1)
            return dp[i];

        // Take one digit
        int one = fun(s, i + 1 , dp);

        // Take two digits
        int two = 0;

        if (i + 1 < s.length()) {

            int num = Integer.parseInt(s.substring(i, i + 2));

            if (num >= 10 && num <= 26)
                two = fun(s, i + 2, dp);
        }

        return dp[i] = one + two;
    }
}