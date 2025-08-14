class Solution {
    public void rotate(int[] nums, int k) 
    {
        /*
        space complexity : O(1);
        Time complexity  : O(rotate*N);
        --------------------------
        int rotate = k % nums.length;
        while(rotate>0)
        {
            int temp=nums[nums.length-1];
            for(int i=nums.length-1;i>=0;i--){
                if(i!=0)
                nums[i]=nums[i-1];
                else
                nums[i]=temp;
            }
            rotate--;
        }
        */
        int n = nums.length;
        if(!(n==1 || k==0))
        {
            k = k % n;
            reverseArray(nums,n-k,n-1);
            reverseArray(nums,0,n-k-1); 
            reverseArray(nums,0,n-1);
        }
        
    }
        public static void reverseArray(int[] nums,int start,int end)
        {
            while(start < end)
            {
                nums[start] = nums[start]^nums[end];
                nums[end] = nums[start]^nums[end];
                nums[start] = nums[start]^nums[end];
                
                start++;
                end--;
            }
        }
        /*
            Method-2:
            -----------
            Time complexity  : O(n)+O(k)+O(n-k) = O(n+k+n-k) = O(2N)
                                
            Space Complexity : O(1)
        */
}