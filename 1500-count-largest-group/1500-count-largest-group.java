class Solution 
{
    public int getSum(int n)
    {
        int sum = 0;
        for( ; n>0 ;sum += (n%10), n/=10);
        return sum;
    }
    public int countLargestGroup(int n) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            int sum = getSum(i);
            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }
        System.out.println(hm);
        int max_val = Collections.max(hm.values());
        int cnt = 0;
        for(int val:hm.values())
        {
            if(max_val == val)
                cnt++;
        }
        return cnt;

    }
}

