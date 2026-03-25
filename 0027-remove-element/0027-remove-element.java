class Solution {
    public int removeElement(int[] arr, int val) {
        int i = 0;
        int j = 0; int n = arr.length;

        while(i<n)
        {
            if(arr[i] != val)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j++;
            }
            else
            i++;
        }

        return j;
        
    }
}