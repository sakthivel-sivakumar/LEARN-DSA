class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // "hello all listen"
        String[] arr = s.split("\\s+");
        int n = arr.length;
        return arr[n-1].length();
    }
}