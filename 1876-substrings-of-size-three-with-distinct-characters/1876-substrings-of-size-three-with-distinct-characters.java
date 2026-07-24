class Solution {
    public int countGoodSubstrings(String s) {

        int[] freq = new int[26];
        int left = 0;
        int distinct = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'a';

            if (freq[index] == 0)
                distinct++;

            freq[index]++;

            if (right - left + 1 == 3) {

                if (distinct == 3)
                    count++;

                int remove = s.charAt(left) - 'a';

                freq[remove]--;

                if (freq[remove] == 0)
                    distinct--;

                left++;
            }
        }

        return count;
    }
}