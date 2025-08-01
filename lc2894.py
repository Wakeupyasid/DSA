class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        nd=0
        d=0
        for i in range(n+1):
            if (i%m==0):
                d+=i
            else:
                nd+=i
        ans=nd-d
        return ans
print(Solution().differenceOfSums(10,3))