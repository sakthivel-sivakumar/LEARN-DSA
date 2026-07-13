import java.util.Arrays;
class Solution {
    public int numRescueBoats(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        int trips = 0;
        while(i<=j){
           if(arr[i] + arr[j] <= k)
                i++;
            j--;
            trips++;
        }

        return trips;
    }
}