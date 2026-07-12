class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int m = s.length();
        int n = t.length();

        int match = 0;

        while(i < m && j < n){
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
                match++;
            }
            else{
                j++;
            }
        }

        return match == m;
    }
}