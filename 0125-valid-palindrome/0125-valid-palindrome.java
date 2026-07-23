class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();

        int left = 0;
        int right = n-1;

        while(left < right)
        {
            char c1 = s.charAt(left); //0
            char c2 = s.charAt(right); //p
            boolean x = (c1>='a'&& c1<='z') ||  (c1>='0'&& c1<='9');
            boolean y = (c2>='a'&& c2<='z') ||  (c2>='0'&& c2<='9');
            if(x && y )
            {
                if(c1 != c2)
                    return false;
                left++; 
                right--;
            }
            else if(x){
                right--;
            }
            else
                left++;
        }

         return true;

    }
}