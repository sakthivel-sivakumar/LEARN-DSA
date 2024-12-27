import java.util.Stack;

class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) 
        {
            if (!st.isEmpty()) 
            {
                char ch = s.charAt(i);
                char sch = st.peek();
                if(sch == '(' && ch == ')')
                    st.pop();
                else if(sch == '{' && ch == '}')
                    st.pop();
                else if(sch == '[' && ch == ']')
                    st.pop();
                else
                    st.push(ch);
            }
            else
                st.push(s.charAt(i));
        }
        return (st.isEmpty())?true:false;
    }
}
