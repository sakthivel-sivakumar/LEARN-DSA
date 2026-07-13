class Solution {
    public int singleNumber(int[] arr) {
        // 10,20,30,10,10,10,20
        int n = arr.length;
        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=0;j<n;j++){
                if(i!=j && arr[i] == arr[j])
                c++;
            }
            if(c == 0)
            return arr[i];
        }

        return -1;
    }
}