class Solution:
    def reverse(self, x: int) -> int:
        INT_MIN, INT_MAX = -2**31, 2**31 - 1
        k=1
        if x<0:
            k=-1
            x=x*(-1)
        s=str(x)
        s= "".join(reversed(s))
        ans=int(s)*(k)
        if ans < INT_MIN or ans > INT_MAX:
            ans=0
        return ans