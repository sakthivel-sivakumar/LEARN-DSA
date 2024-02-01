class Solution {
    /*
        Method-1:Two-pointer approach
        -------------------------------
    public int[] twoSum(int[] nums, int target) 
    {
        int indices[]=new int[2];
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++)
        {
           for(j=0;j<nums.length;j++)
           {
            if(i!=j)
            {
              int temp_target=nums[i]+nums[j];
              if(temp_target==target)
              {
                indices[0]=i;
                indices[1]=j;
                break;
               }
            }
           }
        }
        return indices;
    }
    Method-2:
    ---------
    1) use hashmap to store the element and its index.
    2) check if target-arr[i] present in hashmap.
    */
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> eleMap=new HashMap<>();
        int result[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int balance = target-nums[i];
            if(eleMap.containsKey(balance)){
                result[0]=i;
                result[1]=eleMap.get(balance);
                return result;
            }
            else{
                eleMap.put(nums[i],i);
            }
        }
        return result;
    }
}