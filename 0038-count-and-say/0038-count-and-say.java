class Solution {
    public String fun(String base)
    {
        int count = 1;
        String result="";
        int i;
        for(i=0;i<base.length()-1;i++)
        {
            if(base.charAt(i)==base.charAt(i+1))
                count++; 
            else
            {
                 result = result + count + base.charAt(i);
                 count = 1;
            }
        }
        result = result + count + base.charAt(i);
        //System.out.println(result);
        return result;
    }
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        else if(n==2)
            return "11";
        String base = "11";
        for(int i=2;i<n;i++)
        {
            base = fun(base);
        }
        return base;
    }
}