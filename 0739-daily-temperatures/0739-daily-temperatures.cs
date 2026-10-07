public class Solution {
    public int[] DailyTemperatures(int[] arr) {
        int n = arr.Length;
        int[] res = new int[n];
        Stack<int> st = new Stack<int>();
        for(int i=n-1;i>=0;i--){
            while(st.Count !=0 && arr[i] >= arr[st.Peek()]){
                st.Pop();
            }
            if(st.Count == 0)
                res[i] = 0;
            else
                res[i] = st.Peek() - i;
            st.Push(i);
        }
        return res;
    }
}
