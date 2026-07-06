class Solution {
    public int maximum69Number (int n) {

        int c = (int) Math.log10(n);
        int res = 0; boolean flag = true;
        while(c>=0) {
            int p = (int)Math.pow(10,c--);
            int d = n / p % 10;
            if(flag && d == 6) {
                res = res*10+9; 
                flag = false;
                continue;
            } 
            res = res*10 + d;
        }
            
            return (res);
        
    }
}