class Solution:
    def sumAndMultiply(self, n: int) -> int:
        t=''
        s=0
        ans=0
        for i in str(n):
            if i != '0':
                t += i
                s+=int(i)
        if t != "":
            ans = int(t) * s
        return ans