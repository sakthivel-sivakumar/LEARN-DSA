class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String k = new String(arr);
            if(!hm.containsKey(k)){
                hm.put(k,new ArrayList<>());
            }
            hm.get(k).add(s);
        }

         List<List<String>> result = new ArrayList<>();
	        
	        for(List<String> x:hm.values()) {
	        	result.add(x);
	        }
	        
	       return result;
    }
}