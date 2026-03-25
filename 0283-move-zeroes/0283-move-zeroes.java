class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0;
        int j = 0; int n = arr.length;

        while(i<n)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j++;
            }
            else
            i++;
        }
    }
}