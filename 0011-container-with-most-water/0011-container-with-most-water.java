class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max_width = 0;
        while(left < right)
        {
            int min_cap = height[left]<height[right]?height[left]:height[right];

            int temp_width = min_cap * (right-left);
            
            if(temp_width>max_width)
                max_width = temp_width;

            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return max_width;
        
    }
}