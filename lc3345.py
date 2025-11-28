import math


class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        ans=0
        while True:
            digits = [int(d) for d in str(n)]
            if math.prod(digits)%t==0:
                ans=n
                break
            else:
                n+=1
        return ans