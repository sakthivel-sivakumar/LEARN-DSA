class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String result = "";
        int i = 0;
        int j = 0;
        int max_len = 1;
        int temp_len = 1;
        int low;
        int high;
        int start = 0;
        // To handle those string with length less than or equal 2
        if (len < 1)
            return "";
        else if (len == 1)
            return s;
        else if (len == 2) {
            if (s.charAt(0) == s.charAt(1))
                return s;
            return String.valueOf(s.charAt(0));
        }
        // To handle those string with length greater than 2
        else {
            for (i = 1; i < len; i++) {
                low = i - 1;
                high = i + 1;
                // identifying higher limit
                while (high < len && s.charAt(high) == s.charAt(i))
                    high++;

                // identifying lower limit
                while (low >= 0 && s.charAt(low) == s.charAt(i))
                    low--;

                while (low >= 0 && high < len && s.charAt(low) == s.charAt(high)) {
                    low--;
                    high++;
                }
                int length = high - low - 1;
                if (max_len < length) {
                    max_len = length;
                    start = low + 1;
                }
            }
            result = s.substring(start, start + max_len);
        }
        return result;
    }
}