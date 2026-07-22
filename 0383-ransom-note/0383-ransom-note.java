class Solution {
    public boolean canConstruct(String r, String m) {
        int freq[] =  new int[26];
        for(char ch:r.toCharArray()){
            freq[ch-97]++;
        }
        for(char ch:m.toCharArray()){
            if(freq[ch-97] > 0)
                freq[ch-97]--;
        }

        for(int i:freq){
            if(i!=0)
            return false;
        }
        return true;
    }
}