class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n-1;

        while(left < right)
        {
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left++; right--;
        }
    }
}
// 9 , 10, 11
// 8 ,9,10
// 7,8,9