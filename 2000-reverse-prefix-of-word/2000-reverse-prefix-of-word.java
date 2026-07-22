class Solution {
    public String reversePrefix(String s, char ch) {
        int left = 0;
        int right = s.indexOf(ch);
        char arr[] = s.toCharArray();

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        return new String(arr);
    }
}