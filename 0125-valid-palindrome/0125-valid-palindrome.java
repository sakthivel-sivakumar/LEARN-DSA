class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        s=s.toLowerCase();
        String rev = "";
        String forw = "";
        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(ch>=97&&ch<=122 || ch>=48 && ch<=57){
                forw = forw + ch;
                rev = ch + rev;
            }
            
        }
        if(forw.equals(rev))
            return true;
        return false;
    }
}