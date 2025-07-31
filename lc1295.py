from typing import List


class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        ans=0
        for i in nums:
            a=str(i)
            if len(a)%2==0:
                ans=ans+1
        return ans