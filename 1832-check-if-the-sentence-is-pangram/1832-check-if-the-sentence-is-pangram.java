class Solution {
    public boolean checkIfPangram(String s) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-97]++;
        }
        for(int e:freq){
            if(e==0)
                return false;
        }
        return true;
    }
}