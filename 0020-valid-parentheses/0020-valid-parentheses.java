

class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        String pattern = "([{";
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (!st.isEmpty()) 
            {
                char sch = st.peek();
                if(sch == '(' && ch == ')')
                    st.pop();
                else if(sch == '{' && ch == '}')
                    st.pop();
                else if(sch == '[' && ch == ']')
                    st.pop();
                else if(pattern.indexOf(ch) == -1)
                    return false;
                else
                    st.push(ch);
            }
            else
            {
                if(pattern.indexOf(ch) == -1)
                    return false;
                else
                    st.push(s.charAt(i));
            }
                
        }
        return (st.isEmpty())?true:false;
        
    }
}