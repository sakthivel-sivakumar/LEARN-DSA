class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        int max_len = 0;
        int curr_len = 0;
        int j=0;
        for(int i=0;i<n;i++){

            char ch = s.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,i);
            }
            else{
                while(hm.containsKey(ch))
                {
                    hm.remove(s.charAt(j));
                    j++;
                }
                hm.put(ch,i);
            }
            curr_len = i - j + 1;
            max_len = Math.max(max_len,curr_len);
        }
        return max_len;
        
    }
}