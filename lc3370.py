import sys


class Solution:
    def smallestNumber(self, n: int) -> int:
        max_int = sys.maxsize
        ans=0
        for i in range(n,max_int):
            k=str(bin(i)[2:])
            t='1'*len(k)
            if t==k:
                ans=i
                break
        return ans