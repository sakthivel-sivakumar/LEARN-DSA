class Solution(object):
    def removeDuplicates(self, s):
        stack = []
        for ch in s:
            if len(stack) > 0:
                top = stack[-1]
                if ch == top:
                    stack.pop()
                else:
                    stack.append(ch)
            else:
                stack.append(ch)

        result = ""
        for ch in stack:
            result = result + ch
            
        return result
        