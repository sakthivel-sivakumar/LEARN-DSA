class Solution(object):
    def isValid(self, s): # { [ ( ) ] }
        stack = []
        for ch in s:
            if ch == '[' or ch == '(' or ch == '{' :
                stack.append(ch)
            else:
                if len(stack) > 0:
                    top = stack[-1] 
                    if ch == ']' and top == '[':
                        stack.pop()
                    elif ch == '}' and top == '{':
                        stack.pop()
                    elif ch == ')' and top == '(':
                        stack.pop()
                    else:
                        return False
                else:
                    return False
        return len(stack) == 0
        