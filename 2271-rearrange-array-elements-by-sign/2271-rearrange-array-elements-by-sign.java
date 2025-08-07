class Solution {
    public int[] rearrangeArray(int[] nums) 
    /*
        METHOD-1:
        1)Create 2 arrays to store +ve & -ve numbers seperately.
        2)Then pick one element from each array and store in result array.
        TIME COMPLEXITY  : O(N + N/2)
        SPACE COMPLEXITY : O(N)
        --------------------------------------------------------------------
    {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
            pos[p++]=nums[i];
            else
            neg[n++]=nums[i];
        }
        int i=0;
        int index=0;
        while(i<pos.length){
            nums[index++]=pos[i];
            nums[index++]=neg[i];
            i++;
        }
        return nums;
    }
    */
    {
        int[] result=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
            {
                result[pos]=nums[i];
                pos+=2;
            }
            else
            {
                result[neg]=nums[i];
                neg+=2;
            }
        }
        return result;
    } 
    /*
        METHOD-2: 
        1) +ve elements occupy even index.
        2) -ve elements occupy odd index.
        TIME COMPLEXITY  : O(N)
        SPACE COMPLEXITY : O(N)
    */ 
}