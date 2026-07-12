class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int len = 0;

        for (int count : hm.values()) {
            len += (count / 2) * 2;
        }

        if (len < s.length()) {
            len++;
        }

        return len;
    }
}