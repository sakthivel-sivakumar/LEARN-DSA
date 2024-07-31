class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        String total = "";
        if(goal.length()==s.length())
           total = s+s;
        return total.contains(goal);
    }
}