class Solution {
    public int numIdenticalPairs(int[] a) {

        int n = a.length;
        int c = 0;
        for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i< j && a[i] == a[j])
                c++;
			}
		}
        return c;
        
    }
}