class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuffer r = new StringBuffer();

        for(int i=0;i<arr.length;i++)
        {
            StringBuffer sb = new StringBuffer(arr[i]);
            sb.reverse();
            r.append(sb);
            r.append(" ");
        }

        return r.toString().trim();

        
    }
}