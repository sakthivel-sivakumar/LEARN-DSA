class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        
        int next1 = 1;
        int next2 = 0;

        for(int i=n-1;i>=0;i--){

            int curr = 0;
            if (s.charAt(i) == '0') {
                curr = 0;
                next2 = next1;
                next1 = curr;
                continue;
            }

            // Take one digit
            int one = next1;

            // Take two digits
            int two = 0;

            if (i + 1 < s.length()) {

                int num = Integer.parseInt(s.substring(i, i + 2));

                if (num >= 10 && num <= 26)
                    two = next2;
            }

            curr = next1 + two;
            next2 = next1;
            next1 = curr;
        }

        return next1;
    }
}