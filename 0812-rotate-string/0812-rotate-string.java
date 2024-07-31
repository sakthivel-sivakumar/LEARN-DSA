class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        String total = s + s;
        System.out.println(total);
        if(total.contains(goal) && goal.length()==s.length())
            return true;
        else
            return false;
    }
}