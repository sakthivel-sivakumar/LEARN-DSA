class Solution {
    public int minimumRecolors(String s, int k) {
        int n = s.length();
        int c = 0;
        for(int i=0;i<k;i++){
            if(s.charAt(i) == 'W')
                c++;
        }

        int minCount = c;
        for(int i=k;i<n;i++){
            if(s.charAt(i) == 'W')
                c++;
            if(s.charAt(i-k) == 'W')
                c--;
            
            minCount = Math.min(c,minCount);
        }

        return minCount;
    }
}

// W B B W W B B W B W   