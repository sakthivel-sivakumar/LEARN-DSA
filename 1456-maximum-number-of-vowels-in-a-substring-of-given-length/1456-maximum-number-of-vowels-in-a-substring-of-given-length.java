class Solution {
    public boolean checkVowel(char ch){
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u') 
            return true;
       else
            return false;
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        int curr_count = 0;

        for(int i=0;i<k;i++){
            if(checkVowel(s.charAt(i)))
            curr_count++;
        }

        int max_count = curr_count;
        for(int i=k;i<n;i++)
        {
            if(checkVowel(s.charAt(i)))
                curr_count += 1;

            if(checkVowel(s.charAt(i-k)))
                curr_count -= 1;

            max_count = Math.max(curr_count,max_count);
        }

        return max_count;
    }
}