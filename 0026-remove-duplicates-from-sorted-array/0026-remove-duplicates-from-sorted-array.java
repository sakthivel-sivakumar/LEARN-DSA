class Solution {
    public int removeDuplicates(int[] arr) {

        int j = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[j]) {
				int t = arr[i];
        		arr[i] = arr[j+1];
        		arr[j+1] = t;
        		j++;
			}
		}
		return j+1;
        
    }
}