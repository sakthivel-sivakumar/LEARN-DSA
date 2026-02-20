class Solution {
    public int mostWordsFound(String[] sentences) {
        
       // ["alice and bob" , "mi csk kkr srh" , "karunya students are very good"]
        int max = Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++)
        {
            int c = sentences[i].split("\\s+").length;
            if(c > max)
            max = c;
        }
        return max;
    }
}