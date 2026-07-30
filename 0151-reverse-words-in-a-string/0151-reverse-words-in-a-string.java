class Solution {
    public String reverseWords(String s) {
        String[] x = s.split("\\s+");
            int left = 0;
            int right = x.length-1;
            while(left<right){
            String temp = x[left];
            x[left]=x[right];
            x[right]=temp;
            left++;
            right--;
            
        }

        String result = "";
        for(int i=0;i<x.length;i++){
            result = result + x[i] +" ";
        }

        return result.trim();
        
    }
}