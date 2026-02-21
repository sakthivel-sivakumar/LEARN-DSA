class Solution {
    private static boolean isVowel(char ch) {
		String v = "aeiouAEIOU";
		return v.indexOf(ch) != -1;
	}
    public String reverseVowels(String s) {

        char arr[] = s.toCharArray(); 
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left < right)
        {
            boolean x = isVowel(arr[left]);
            boolean y = isVowel(arr[right]);

            if(x == true && y==true)
            {
                 char temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++; right--;
            }
            else if(x == false)
                left++;
            else
                right--;
        }

        String result = new String(arr);
        return result;
        
    }
}