class Solution {
    public String truncateSentence(String s, int k) {


        String arr[] = s.split("\\s+");  // "hello how are you guys"  // k = 3
        String res = "";
        for(int i=0;i<k;i++)
        {
           res = res + arr[i]+" ";
        }

        return res.trim();
        
    }
}