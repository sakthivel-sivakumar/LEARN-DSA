class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int arr[] = new int[n];
        int i = 0;
        for(int ele:nums)
            arr[i++] = ele;
        
        // -1,1,1,2,3 , target = 2
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        int c = 0;
        while(left < right){
            if(arr[left] + arr[right] < target){
                c += right-left;
                left++;
            }
            else{
                right--;
            }
        }

        return c;
    }
}