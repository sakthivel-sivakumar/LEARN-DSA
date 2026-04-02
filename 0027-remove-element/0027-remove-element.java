class Solution {
    public int removeElement(int[] arr, int val) {

        int j = 0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!= val) {
        		int t = arr[i];
        		arr[i] = arr[j];
        		arr[j] = t;
        		j++;
        	}
        }

        return j;
        
    }
}