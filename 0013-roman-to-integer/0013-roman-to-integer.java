class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>(
    Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    )
);


        int val = 0;

        for(int i=0;i<s.length();i++){
            int v1 = map.get(s.charAt(i));
            if(i+1 < s.length() && v1<map.get(s.charAt(i+1))) {
               val = val + (map.get(s.charAt(i+1)) - v1);
               i++;
            }
            else
            val = val + v1;
        }
        return val;
        
    }
}