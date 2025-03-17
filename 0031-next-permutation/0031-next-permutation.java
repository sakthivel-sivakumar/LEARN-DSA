class Solution {
    public void nextPermutation(int[] nums) {
        /*
            1) Find the pivot element(drop occurs)and get that index.
            2) Find the immeditate succesor of that pivot element and swap them both.
            3) sort the remaining elements (pivot_index+1,N) in ascending order
        */
        int pivotIndex=findPivot(nums);
        if(pivotIndex == -1){
            sortArray(nums,0);
        }
        else{
            findSuccesor(nums,pivotIndex+1,pivotIndex);
            sortArray(nums,pivotIndex+1);
        }
    }

        int findPivot(int[] nums)
        {
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i]<nums[i+1])
                    return i;
            }
            return -1;
        }
        void findSuccesor(int[]nums,int end,int pivotIndex)
        {
            int i;
            for(i=nums.length-1;i>=end;i--){
                if(nums[i]>nums[pivotIndex])
                    break;
            }
            swap(nums,i,pivotIndex);
        }
        void swap(int[] nums, int i, int j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        void sortArray(int[]nums,int start)
        {
            int end = nums.length - 1;
            while (start < end) {
                swap(nums, start++, end--);
            }
        }
}
