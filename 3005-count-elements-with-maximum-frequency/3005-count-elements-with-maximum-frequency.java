class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
      HashMap<Integer,Integer> hm= new HashMap<>();
      for(int x:nums)
      {
          hm.put(x,hm.getOrDefault(x,0)+1);
      }  
      int max = -1;
      int count = 0;
      for(int x:hm.values())
      {
          if(x == max)
            count++;
          else if(x>max)
          {
              max = x;
              count = 1;
          }  
      }
      return max*count;
    }
}