class Solution:
    def mirrorDistance(self, n: int) -> int:
        rev=str(n)[::-1]
        ans=abs(int(rev)-n)
        return ans