from typing import List


class Solution:
    def findNonMinOrMax(self, nums: List[int]) -> int:
        ma=max(nums)
        mi=min(nums)
        ans=-1
        for i in nums:
            if (i!=ma) & (i!=mi):
                ans=i
                break
        return ans
print(Solution().findNonMinOrMax([1,2,3,4,5]))